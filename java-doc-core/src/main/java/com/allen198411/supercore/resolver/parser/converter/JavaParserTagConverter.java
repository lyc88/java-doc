/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.resolver.parser.converter;

import com.allen198411.supercore.tag.AbstractDocTag;

/**
 * @author chenhx
 * @version JavaParserTagConverter.java, v 0.1 2018-09-26 下午 5:23
 */
public interface JavaParserTagConverter<T extends String> {
    AbstractDocTag converter(T o);
}
