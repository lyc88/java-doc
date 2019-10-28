/**
 *
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.allen198411.superspring.format;

import com.allen198411.supercore.format.Format;
import com.allen198411.supercore.model.ApiAction;
import com.allen198411.supercore.model.ApiDoc;
import com.allen198411.supercore.model.ApiModule;
import com.allen198411.supercore.utils.JsonFormatUtils;
import com.allen198411.superspring.framework.SpringApiAction;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author allen
 * @version MarkdownFormat.java, v 0.1 2019-10-21 下午 4:31
 */

public class MarkdownFormat implements Format {

    private Logger log = LoggerFactory.getLogger(getClass());

    private VelocityTemplater templater = new VelocityTemplater("com/allen198411/superspring/format/api.vm");

    @Override
    public String format(ApiDoc apiDoc) {
        StringBuilder sb = new StringBuilder();
        for (ApiModule apiModule : apiDoc.getApiModules()) {
            sb.append(format(apiModule)).append("\n\n");
        }
        return sb.toString();
    }

    private String format(ApiModule apiModule) {

        for (ApiAction apiAction : apiModule.getApiActions()) {
            SpringApiAction saa = (SpringApiAction) apiAction;
            if (saa.isJson() && StringUtils.isNotBlank(saa.getRespbody())) {
                saa.setRespbody(JsonFormatUtils.formatJson(saa.getRespbody()));
            }
        }

        try {
            Map<String, Object> map = PropertyUtils.describe(apiModule);
            return templater.parse(map);
        } catch (Exception e) {
            log.error("输出markdown文档格式失败", e);
        }
        return null;
    }
}
