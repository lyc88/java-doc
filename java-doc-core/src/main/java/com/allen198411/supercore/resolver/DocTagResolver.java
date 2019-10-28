/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.resolver;

import com.allen198411.supercore.framework.AbstractFramework;
import com.allen198411.supercore.model.ApiModule;

import java.util.List;

/**
 * 注释解析器接口,所有的解析器实现都要继承此接口
 * <p>
 * 现有的实现有基于sun javadoc, 也有基于开源的javaparser
 *
 * @author chenhx
 * @version DocTagResolver.java, v 0.1 2018-09-26 下午 4:45
 */
public interface DocTagResolver {

    /**
     * 执行解析
     * @param files 要解析的所有java源代码文件的绝对路径
     * @param abstractFramework api文档所属框架
     * @return
     */
    List<ApiModule> resolve(List<String> files, AbstractFramework abstractFramework);
}
