package com.hebehan.config;

import com.hebehan.controllerbean.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Hebe Han
 * Date: 2019-01-17
 */
@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(value = Exception.class)//RuntimeException范围会更大
    @ResponseBody
    public BaseResponse errorHandlerOverJson(HttpServletRequest request, Exception exception) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(100);
        baseResponse.setMessage(exception.getMessage());
        baseResponse.setStatus("error");
        return baseResponse;
    }



//    @ExceptionHandler(value = RuntimeException.class)
//    @ResponseBody
//    public BaseResponse runtimeErrorHandlerOverJson(HttpServletRequest request, Exception exception) {
//        BaseResponse baseResponse = new BaseResponse();
//        baseResponse.setCode(100);
//        baseResponse.setMessage(exception.getMessage());
//        baseResponse.setStatus("error");
//        return baseResponse;
//    }
}
