package com.sjh.controller;

import com.sjh.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 宋俊辉
 * @date 2022/4/4 0004
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    private static final String URL = "http://CLOUD-PAY-SERVICE/pay";


    /**
     * 创建订单
     */
    @RequestMapping("/create")
    public String pay() {
        log.info("这是订单服务");
        //String result = restTemplate.postForObject(URL, null, String.class);
        String result = orderService.pay();
        return "通过订单服务调用了" + result;
    }

    @RequestMapping("/timeOut")
    public String timeOut() {
        return orderService.timeOut();
    }
}
