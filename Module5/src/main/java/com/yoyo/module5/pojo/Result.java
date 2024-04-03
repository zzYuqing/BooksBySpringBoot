package com.yoyo.module5.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Integer code;//响应码，1 响应成功，0 响应失败
    private String msg;//响应信息
    private Object data;//响应数据

    // 增删改，成功响应
    public static Result success(){
        return new Result(1,"success",null);
    }

    // 查询，成功响应
    public static Result success(Object data){
        return new Result(1,"success",data);
    }

    // 失败响应
    public static Result error(){
        return new Result(0,"error",null);
    }


}
