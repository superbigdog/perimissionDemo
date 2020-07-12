package com.lxp.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CommonResult.java
 * @Description TODO
 * @createTime 2020年07月11日 02:25:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 not found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
