package com.lyoko.result.result;

import lombok.Getter;

/**
 * 模块名
 * @author Yawn
 * @version 1.0
 * @date 2020年10月12 17:12:27
 */
public enum ErrorCodeEnum  {
    FAIL ("1", 1, "错误"),
    NEXT ("2", 2, "非错误型, 下一步")
    ;
    @Getter
    private Integer code;
    @Getter
    private String message;

    private ErrorCodeEnum(String status, Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
