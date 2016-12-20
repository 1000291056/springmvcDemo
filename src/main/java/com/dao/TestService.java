package com.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * Created by wufeifei on 2016/12/20.
 */
@Service
public class TestService {
    private static final Log logger = LogFactory.getLog(TestService.class);
    public void Log(String arg) {
        logger.info(arg);
    }
}
