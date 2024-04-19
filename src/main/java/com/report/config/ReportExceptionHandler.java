package com.report.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: march
 * @Date: 2022/2/11 22:20
 * @Description:
 **/
@ControllerAdvice
public class ReportExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public R globalException(RuntimeException ex){
        logger.error("异常信息：", ex);

        String message = ex.getMessage();
        return R.error(message);
    }

}
