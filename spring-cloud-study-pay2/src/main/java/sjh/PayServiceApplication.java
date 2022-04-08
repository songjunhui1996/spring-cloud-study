package sjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 宋俊辉
 * @date 2022/4/4 0004
 */
@SpringBootApplication
@EnableEurekaClient
public class PayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayServiceApplication.class, args);
    }
}
