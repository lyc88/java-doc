/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superstarter.boot;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 开启注解
 *
 * @author chenhx
 * @version EnableXDoc.java, v 0.1 2018-09-26 下午 6:10
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(XDocConfiguration.class)
@EnableConfigurationProperties(XDocProperties.class)
public @interface EnableXDoc {
}