package customer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import provider.service.PAService;

/**
 * Description:
 * Author: mif
 * Date: 2017/5/3
 * Time: 15:11
 */
@Service
public class CATestServiceImpl implements CATestService {

    @Reference(version = "1.0.1")
    private PAService paService;

    @Override
    public String getMessage() {
        return paService.getMessage();
    }

}
