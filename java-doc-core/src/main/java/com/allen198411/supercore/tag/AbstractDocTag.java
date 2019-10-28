/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.tag;

/**
 * 针对注释标签
 *
 * @author allen
 * @version AbstractDocTag.java, v 0.1 2019-10-21 下午 4:31
 */
public abstract class AbstractDocTag<T> {

    /**
     * 标签名称
     */
    private String tagName;

    public AbstractDocTag(String tagName) {
        this.tagName = tagName;
    }

    public abstract T getValues();

    /**
     * Getter method for property <tt>tagName</tt>.
     *
     * @return property value of tagName
     */
    public String getTagName() {
        return tagName;
    }

}
