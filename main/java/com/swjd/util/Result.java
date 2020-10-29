package com.swjd.util;

public class Result {
    private boolean flag;//处理结果标识
    private String message;//返回的结果信息

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
