package com.xkcoding.logback.error;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaolei.he
 * @Date 2022/7/17 16:51
 */
@Slf4j
public class ExceptionExample {

    public void log()  {
        int i = 0;
        int j = 1 / i;
    }
}
