/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.resolver.parser.converter.impl;

import com.allen198411.supercore.resolver.parser.converter.JavaParserTagConverter;
import com.allen198411.supercore.tag.AbstractDocTag;
import com.allen198411.supercore.tag.impl.DocTagImpl;
import com.allen198411.supercore.utils.CommentUtils;

/**
 * @author allen
 * @version DefaultJavaParserTagConverterImpl.java, v 0.1 2019-10-21 下午 4:31
 */
public class DefaultJavaParserTagConverterImpl implements JavaParserTagConverter<String> {

    @Override
    public AbstractDocTag converter(String comment) {
        String tagType = CommentUtils.getTagType(comment);
        String coment = comment.substring(tagType.length()).trim();
        return new DocTagImpl(tagType, coment);
    }
}
