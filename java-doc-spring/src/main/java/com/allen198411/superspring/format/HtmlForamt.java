/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superspring.format;

import com.allen198411.supercore.format.Format;
import com.allen198411.supercore.model.ApiDoc;
import com.allen198411.supercore.utils.JsonUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author allen
 * @version HtmlForamt.java, v 0.1 2019-10-21 下午 4:31
 */

public class HtmlForamt implements Format {

    @Override
    public String format(ApiDoc apiDoc) {
        InputStream in = HtmlForamt.class.getResourceAsStream("html.vm");
        if (in != null) {
            try {
                String s = IOUtils.toString(in, "utf-8");

                Map<String, Object> model = new HashMap<>(4);
                model.put("title", StringUtils.defaultString((String) apiDoc.getProperties().get("title"), "在线接口文档"));
                model.put("apiModules", apiDoc.getApiModules());
                //生成json数据
                return s.replace("_apis_json", JsonUtils.toJson(model));
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                IOUtils.closeQuietly(in);
            }
        }
        return "";
    }
}
