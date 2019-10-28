/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superstarter.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author allen
 * @version XDocProperties.java, v 0.1 2019-10-22 下午 2:16
 */
@ConfigurationProperties("xdoc")
public class XDocProperties {

    /**
     * 是否启动xDoc,此值便于在生产等环境启动程序时增加参数进行控制
     */
    private boolean enable = true;
    /**
     * 界面标题描述
     */
    private String title = "在线接口文档";
    /**
     * 源码相对路径(支持多个,用英文逗号隔开)
     */
    private String sourcePath;
    /**
     * 文档版本号
     */
    private String version;

    public XDocProperties() {
    }

    /**
     * Getter method for property <tt>enable</tt>.
     *
     * @return property value of enable
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Setter method for property <tt>enable</tt>.
     *
     * @param enable value to be assigned to property enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    /**
     * Getter method for property <tt>title</tt>.
     *
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     *
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>sourcePath</tt>.
     *
     * @return property value of sourcePath
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * Setter method for property <tt>sourcePath</tt>.
     *
     * @param sourcePath value to be assigned to property sourcePath
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * Getter method for property <tt>version</tt>.
     *
     * @return property value of version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter method for property <tt>version</tt>.
     *
     * @param version value to be assigned to property version
     */
    public void setVersion(String version) {
        this.version = version;
    }
}