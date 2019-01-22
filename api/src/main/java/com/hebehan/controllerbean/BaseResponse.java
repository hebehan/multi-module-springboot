package com.hebehan.controllerbean;

import lombok.Data;

import java.util.Map;

/**
 * Created by Hebe Han
 * Date: 2019-01-17
 */
@Data
public class BaseResponse {
    private int code;
    private String status;
    private String message;
    private Map<String,Object> content;
}
