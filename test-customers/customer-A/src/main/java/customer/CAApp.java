package customer;

import customer.service.CATestService;
import customer.service.CATestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Description:
 * Author: mif
 * Date: 2017/5/3
 * Time: 11:44
 */
@SpringBootApplication
public class CAApp {

    private static final Logger log = LoggerFactory.getLogger(CAApp.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CAApp.class, args);
        CATestService caTestService = run.getBean(CATestServiceImpl.class);
        Long s = System.currentTimeMillis();
        log.info("message is {}", caTestService.getMessage());
        Long e = System.currentTimeMillis();
        log.info("customer-A : startTime = {},endTime={},expend = {}", s, e, e - s);
    }
}
