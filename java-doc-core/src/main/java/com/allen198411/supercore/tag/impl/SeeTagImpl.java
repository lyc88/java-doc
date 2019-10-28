/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.tag.impl;

import com.allen198411.supercore.model.ObjectInfo;
import com.allen198411.supercore.tag.AbstractDocTag;

/**
 * 针对@see注释标签进行封装,返回@see上注释的类信息
 *
 * @author allen
 * @version SeeTagImpl.java, v 0.1 2019-10-21 下午 4:31
 */
public class SeeTagImpl extends AbstractDocTag<ObjectInfo> {

    private ObjectInfo objectInfo;

    public SeeTagImpl(String tagName, ObjectInfo objectInfo) {
        super(tagName);
        this.objectInfo = objectInfo;
    }

    @Override
    public ObjectInfo getValues() {
        return objectInfo;
    }
}
