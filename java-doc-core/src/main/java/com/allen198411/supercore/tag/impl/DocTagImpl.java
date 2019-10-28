/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.tag.impl;

import com.allen198411.supercore.tag.AbstractDocTag;

/**
 * 简单文本型注释标签实现
 *
 * @author allen
 * @version DocTagImpl.java, v 0.1 2019-10-21 下午 4:31
 */
public class DocTagImpl extends AbstractDocTag<String> {

    private String value;

    public DocTagImpl(String tagName, String value) {
        super(tagName);
        this.value = value;
    }

    @Override
    public String getValues() {
        return value;
    }

    /**
     * Getter method for property <tt>value</tt>.
     *
     * @return property value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter method for property <tt>value</tt>.
     *
     * @param value value to be assigned to property value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
