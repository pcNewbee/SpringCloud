package com.pc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pc
 * @date 2020/5/25 21:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T       data;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
