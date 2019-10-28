/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.format;

import com.allen198411.supercore.model.ApiDoc;

/**
 * 文档输出格式
 *
 * @author chenhx
 * @version Format.java, v 0.1 2018-09-26 下午 4:31
 */
public interface Format {
    String format(ApiDoc apiDoc);
}