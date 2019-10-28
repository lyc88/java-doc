/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superstarter.boot;

import com.allen198411.supercore.JavaDoc;
import com.allen198411.supercore.model.ApiDoc;
import com.allen198411.supercore.utils.JsonUtils;
import com.allen198411.superspring.framework.SpringWebFramework;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author allen
 * @version XDocController.java, v 0.1 2019-10-22 下午 2:16
 */
@RequestMapping("xdoc")
public class XDocController {
    private static final Logger LOGGER = getLogger(XDocController.class);
    private static ApiDoc apiDoc; 
    @Autowired
    private XDocProperties docProperties;

    @PostConstruct
    public void init() {
        if (!docProperties.isEnable()) {
            return;
        }

        String path = docProperties.getSourcePath();

        if (StringUtils.isBlank(path)) {
            //默认为当前目录
            path = ".";
        }

        List<String> paths = Arrays.asList(path.split(","));

        LOGGER.debug("starting XDoc, source path:{}", paths);

        try {
            JavaDoc javaDoc = new JavaDoc(paths, new SpringWebFramework());

            Thread thread = new Thread(() -> {
                try {
                    apiDoc = javaDoc.resolve();
                    HashMap<String, Object> properties = new HashMap<>(4);
                    properties.put("version", docProperties.getVersion());
                    properties.put("title", docProperties.getTitle());
                    apiDoc.setProperties(properties);

                    LOGGER.info("start up XDoc");
                } catch (Exception e) {
                    LOGGER.error("start up XDoc error", e);
                }
            });
            thread.start();
        } catch (Exception e) {
            LOGGER.error("start up XDoc error", e);
        }
    }

    /**
     * 跳转到接口文档首页
     */
    @GetMapping
    public String index() {
        return "redirect:index.html";
    }

    /**
     * 获取所有文档api
     *
     * @return 系统所有文档接口的数据(json格式)
     */
    @ResponseBody
    @RequestMapping("apis")
    public Object apis() {
        return JsonUtils.toJson(apiDoc);
    }

    /**
     * 重新构建文档
     *
     * @return 文档页面
     */
    @GetMapping("rebuild")
    public String rebuild() {
        init();
        return "redirect:index.html";
    }
}
