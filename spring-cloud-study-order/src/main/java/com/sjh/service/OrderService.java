package com.sjh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 宋俊辉
 * @date 2022/4/6 0006
 * 通过openFeign调用，value==服务名
 */
@FeignClient(value = "CLOUD-PAY-SERVICE")
public interface OrderService {

    @RequestMapping("/pay")
    String pay();

    @RequestMapping("/timeOut")
     String timeOut();

}
