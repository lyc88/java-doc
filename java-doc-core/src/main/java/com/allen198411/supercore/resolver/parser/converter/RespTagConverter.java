/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.resolver.parser.converter;

import com.allen198411.supercore.tag.AbstractDocTag;
import com.allen198411.supercore.tag.impl.ParamTagImpl;
import com.allen198411.supercore.tag.impl.RespTagImpl;

/**
 * @author allen
 * @version RespTagConverter.java, v 0.1 2019-10-21 下午 4:31
 */

public class RespTagConverter extends ParamTagConverter {

    @Override
    public AbstractDocTag converter(String comment) {
        ParamTagImpl paramTag = (ParamTagImpl) super.converter(comment);
        RespTagImpl respTag = new RespTagImpl(paramTag.getTagName(), paramTag.getParamName(), paramTag.getParamDesc(),
                paramTag.getParamType(), paramTag.isRequire());
        return respTag;
    }
}
