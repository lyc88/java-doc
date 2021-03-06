/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.supercore.model;

import com.allen198411.supercore.tag.AbstractDocTag;

import java.util.ArrayList;
import java.util.List;

/**
 * @author allen
 * @version DocTags.java, v 0.1 2019-10-21 下午 4:31
 */
public class DocTags {

    private List<AbstractDocTag> list;

    public DocTags() {
    }

    public DocTags(List<AbstractDocTag> list) {
        this.list = list;
    }

    public AbstractDocTag getTag(String name) {
        for (int i = 0; i < list.size(); i++) {
            AbstractDocTag abstractDocTag = list.get(i);
            if (abstractDocTag.getTagName().equals(name)) {
                return abstractDocTag;
            }
        }
        return null;
    }

    public List<AbstractDocTag> getTags(String name) {
        List<AbstractDocTag> abstractDocTags = new ArrayList<AbstractDocTag>();
        for (int i = 0; i < list.size(); i++) {
            AbstractDocTag abstractDocTag = list.get(i);
            if (abstractDocTag.getTagName().equals(name)) {
                abstractDocTags.add(abstractDocTag);
            }
        }
        return abstractDocTags;
    }

    /**
     * Getter method for property <tt>list</tt>.
     *
     * @return property value of list
     */
    public List<AbstractDocTag> getList() {
        return list;
    }

    /**
     * Setter method for property <tt>list</tt>.
     *
     * @param list value to be assigned to property list
     */
    public void setList(List<AbstractDocTag> list) {
        this.list = list;
    }
}