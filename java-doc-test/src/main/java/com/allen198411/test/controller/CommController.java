package com.allen198411.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通用接口
 *
 * @author allen
 * @version CommController.java, v 0.1 2019-10-26 下午 6:28
 */
@RestController
public class CommController {
    /**
     * 首页
     *
     * @return 首页页面
     */
    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
