package com.lyoko.result.result;

import lombok.Getter;

/**
 *
 * @Description:
 * @Author: HJQ
 * @Param null
 * @Return:
 * @Date: 2021/2/20 17:49
 */
public enum CommonResultCodeEnum  {
    SUCCESS             ("200", 200, "成功"),
    FAIL                ("1", 1, "失败"),
    TOO_MORE_REQUEST    ("2", 2, "接口次数已达到上限"),
    BAD_REQUEST         ("3", 3, "非法请求"),
    MISS_PARAM          ("4", 4, "参数校验失败"),
    NO_AUTH             ("5", 5, "没有权限"),
    NO_LOGIN            ("6", 6, "未登录"),


    NO_BODY            ("90", 90, "未查询到数据"),


    /**
     * 用于Fallback.
     */
    REMOTE_FAIL         ("99", 99, "远程服务异常"),
    ;
    @Getter
    private Integer code;
    @Getter
    private String message;

    private CommonResultCodeEnum(String status, Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
