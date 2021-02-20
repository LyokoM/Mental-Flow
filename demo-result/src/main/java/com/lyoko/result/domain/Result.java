package com.lyoko.result.domain;

import com.lyoko.result.result.BaseBusinessCodeEnum;
import com.lyoko.result.result.CommonResultCodeEnum;
import com.lyoko.result.result.ResultCodeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -8089663969714308666L;

    private Integer code;
    private String msg;
    private T data;


    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> Result<T> success(T data){
        return new Result<>(CommonResultCodeEnum.SUCCESS.getCode(), CommonResultCodeEnum.SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> success(){
        return new Result<>(CommonResultCodeEnum.SUCCESS.getCode(), CommonResultCodeEnum.SUCCESS.getMessage());
    }
    public static <T> Result<T> error(){
        return new Result<>(ResultCodeEnum.FAILURE.getCode(), ResultCodeEnum.FAILURE.getMsg());
    }






}
