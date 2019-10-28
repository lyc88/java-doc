/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superstarter.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @author allen
 * @version XDocConfiguration.java, v 0.1 2019-10-22 下午 2:16
 */
public class XDocConfiguration {

    public XDocConfiguration() {
    }

    @Bean
    @ConditionalOnProperty(prefix = "xdoc", name = "enable", matchIfMissing = true)
    public XDocController XDocController() {
        return new XDocController();
    }
}
