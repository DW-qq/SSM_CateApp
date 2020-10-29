package com.swjd.wxpay.sdk;

import java.io.InputStream;

public class MyWXPayConfig extends WXPayConfig {
    @Override
    String getAppID() {
        return "wx632c8f211f8122c6";
    }

    @Override
    String getMchID() {
        return "1497984412";
    }

    @Override
    String getKey() {
        return "sbNCm1JnevqI36LrEaxFwcaT0hkGxFnC";
    }

    @Override
    InputStream getCertStream() {
        return null;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        MyWXPayDomain myWXPayDomain = new MyWXPayDomain();
        return myWXPayDomain;
    }
}
