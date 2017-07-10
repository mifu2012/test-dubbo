package provider.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * Author: mif
 * Date: 2017/5/3
 * Time: 16:45
 */
@Service(version = "1.0.1")
public class PBServiceImpl implements PBService {

    private static final Logger log = LoggerFactory.getLogger (PBServiceImpl.class);

    @Reference(version = "1.0.1")
    private PCService pcService;

    @Override
    public String getMessage() {
        Long s = System.currentTimeMillis ();
        String m = pcService.getMessage ();
        Long e = System.currentTimeMillis ();
        log.info ("provider-B : startTime = {},endTime={},expend = {}", s, e, e - s);
        return m;
    }
}
