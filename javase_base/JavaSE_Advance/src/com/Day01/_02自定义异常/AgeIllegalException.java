package com.Day01._02自定义异常;

/**
 * @Description AgeIllegalException
 * @Author ChengYun
 * @Date 2025-03-27  19:50
 */
public class AgeIllegalException extends Exception {
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
