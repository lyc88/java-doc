/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.framework;

import com.allen198411.supercore.model.ApiModule;

import java.util.List;

/**
 * 抽象各种API框架的特性,用于在基于java-doc-core渲染出来的ApiModule基础中,进行再度包装
 *
 * @author allen
 * @version Framework.java, v 0.1 2019-10-20 下午 4:45
 */
public abstract class AbstractFramework {

    /**
     * 扩展API数据
     *
     * @param apiModules 原始基本的Api数据
     * @return 扩展后的api数据
     */
    public abstract List<ApiModule> extend(List<ApiModule> apiModules);

    /**
     * 判断该类是否适合该框架
     *
     * @param classz 扫描到的类
     * @return 是支持
     */
    public abstract boolean support(Class<?> classz);
}