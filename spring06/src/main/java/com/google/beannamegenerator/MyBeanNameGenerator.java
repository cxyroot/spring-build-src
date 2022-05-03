package com.google.beannamegenerator;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.beans.Introspector;
import java.util.Map;
import java.util.Set;

public class MyBeanNameGenerator implements BeanNameGenerator {

	private static final String COMPONENT_ANNOTATION_CLASSNAME = "org.springframework.stereotype.Component";

	protected boolean isStereotypeWithNameValue(String annotationType,
												Set<String> metaAnnotationTypes, @Nullable Map<String, Object> attributes) {

		boolean isStereotype = annotationType.equals(COMPONENT_ANNOTATION_CLASSNAME) ||
				metaAnnotationTypes.contains(COMPONENT_ANNOTATION_CLASSNAME) ||
				annotationType.equals("javax.annotation.ManagedBean") ||
				annotationType.equals("javax.inject.Named");

		return (isStereotype && attributes != null && attributes.containsKey("value"));
	}

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		String beanName = null;
		if (definition instanceof AnnotatedBeanDefinition) {
			AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition)definition;
			AnnotationMetadata annotationMetadata = annotatedBeanDefinition.getMetadata();
			Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
			for (String type : annotationTypes) {
				AnnotationAttributes attributes =
						AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(type,Boolean.FALSE));
				if (attributes != null && isStereotypeWithNameValue(type, annotationMetadata.getMetaAnnotationTypes(type), attributes)) {
					Object value = attributes.get("value");
					if (value instanceof String) {
						String strVal = (String) value;
						if (StringUtils.hasLength(strVal)) {
							if (beanName != null && !strVal.equals(beanName)) {
								throw new IllegalStateException("Stereotype annotations suggest inconsistent " +
										"component names: '" + beanName + "' versus '" + strVal + "'");
							}
							beanName = strVal;
						}
					}
				}
			}
		}
		return beanName != null ? "my"+beanName:"my"+buildDefaultBeanName(definition);
	}

	private String buildDefaultBeanName(BeanDefinition definition) {
		String beanClassName = definition.getBeanClassName();
		Assert.state(beanClassName != null, "No bean class name set");
		String shortClassName = ClassUtils.getShortName(beanClassName);
		return Introspector.decapitalize(shortClassName);
	}
}
