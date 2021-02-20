package com.lyoko.result.result;

import lombok.Getter;

/**
 * 通用错误码
 * @author Yawn
 * @version 1.0
 * @date 2020年10月12 17:12:27
 */
public enum BaseBusinessCodeEnum  {
    CREATE                 ("001", 1, "插入失败"),
    DELETE                 ("002", 2, "删除失败"),
    UPDATE                 ("003", 3, "更新失败"),
    READ                   ("004", 4, "查询失败"),
    NO_BODY                ("005", 5, "数据不存在"),
    MISS_PARAM             ("006", 6, "请求参数[%s]缺失"),
    // 不符合逻辑的数据
    PARAM_VALID            ("007", 7, "请求参数[%s]非法"),
    STATUS_ERROR           ("008", 8, "数据状态不支持修改"),
    REMOTE_ERROR           ("009", 9, "远程访问异常"),
    ;
    @Getter
    private Integer code;

    @Getter
    private String message;

    private BaseBusinessCodeEnum(String status, Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private static String missParamMessage (String field) {
        return String.format(PARAM_VALID.message, field);
    }

    private static String unValidParamMessage (String field) {
        return String.format(MISS_PARAM.message, field);
    }
}
