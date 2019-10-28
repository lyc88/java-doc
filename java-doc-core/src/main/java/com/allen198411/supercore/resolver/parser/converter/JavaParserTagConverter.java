/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.resolver.parser.converter;

import com.allen198411.supercore.tag.AbstractDocTag;

/**
 * @author allen
 * @version JavaParserTagConverter.java, v 0.1 2019-10-21 下午 4:31
 */
public interface JavaParserTagConverter<T extends String> {
    AbstractDocTag converter(T o);
}
