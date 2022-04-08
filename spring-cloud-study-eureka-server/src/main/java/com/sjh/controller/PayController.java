package com.sjh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 宋俊辉
 * @date 2022/4/4 0004
 */
@RestController
@RequestMapping("/pay")
public class PayController {

    /**
     * 测试
     *
     * @return
     */
    @RequestMapping("/create")
    public String pay() {
        return "调用了支付接口";
    }
}
