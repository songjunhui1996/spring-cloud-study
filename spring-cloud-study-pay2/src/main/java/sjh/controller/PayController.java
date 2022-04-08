package sjh.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author 宋俊辉
 * @date 2022/4/4 0004
 */
@RestController
@Slf4j
public class PayController {

    @RequestMapping("/pay")
    public String pay(){
       return "进入了第二个服务";
    }

    @RequestMapping("/timeOut")
    public String timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "这是超时方法2";
    }
}
