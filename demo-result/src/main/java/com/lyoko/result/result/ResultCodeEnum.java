package com.lyoko.result.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by Bob_张
 * @Classname ResultCodeEnum
 * @Description 错误结果枚举
 * @Date 2020/4/14 10:32
 */
@Getter
@AllArgsConstructor
public enum ResultCodeEnum {

    /**
     * 请求成功
     */
    SUCCESS(200, "请求成功"),
    /**
     * 服务器内部出错
     */
    FAILURE(500, "服务器内部出错"),
    /**
     * 未授权
     */
    UNAUTHORIZED(403, "未授权"),
    /**
     * 未查到数据
     */
    NO_RECORD(201, "未查到数据"),
    /**
     * 未登录
     */
    NO_LOGIN(401, "未登录"),
    /**
     * 请求参数出错
     */
    PARAM_ERROR(400, "请求参数出错"),
    /**
     * 请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),

    /**
     * 需前端确认
     */
    CONFIRM(20009, "请求确认");


    private Integer code;

    private String msg;

}
