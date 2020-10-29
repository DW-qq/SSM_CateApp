package com.swjd.service;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;


public interface AliyunSmsService {
    public abstract SendSmsResponse sendSms(String telephone, String code);
}
