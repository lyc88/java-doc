/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superstarter.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @author chenhx
 * @version XDocConfiguration.java, v 0.1 2018-09-26 下午 6:10
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
