package com.xkcoding.logback.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author xiaolei.he
 * @Date 2022/7/17 16:27
 */
@Slf4j
public class ErrorExample {

    public void log() {
        log.trace(ErrorExample.class.getSimpleName() + "trace");
        log.info(ErrorExample.class.getSimpleName() + "info");
        log.warn(ErrorExample.class.getSimpleName() + "warn");
        log.error(ErrorExample.class.getSimpleName() + "error");
    }


}
