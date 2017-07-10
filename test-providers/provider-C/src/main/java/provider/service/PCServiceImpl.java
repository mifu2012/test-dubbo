package provider.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * Author: mif
 * Date: 2017/5/3
 * Time: 16:48
 */
@Service(version = "1.0.1")
public class PCServiceImpl implements PCService {

    private static final Logger log = LoggerFactory.getLogger (PCServiceImpl.class);

    @Reference(version = "1.0.1")
    private PDService pdService;

    @Override
    public String getMessage() {
        Long s = System.currentTimeMillis ();
        String m = pdService.getMessage ();
        Long e = System.currentTimeMillis ();
        log.info ("provider-C : startTime = {},endTime={},expend = {}", s, e, e - s);
        return m;
    }
}
