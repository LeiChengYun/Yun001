package org.example.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success()
    {
        Result result = new Result();
        result.code = 1;
        return result;
    }

    public static Result success(Object data)
    {
        Result result = new Result();
        result.code = 1;
        result.data = data;
        result.msg = "success";
        return result;
    }

    public static Result fail(String msg)
    {
        Result result = new Result();
        result.code = 0;
        result.msg = msg;
        return result;
    }
}
