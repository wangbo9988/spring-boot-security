package com.cn.security.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description
 * @Author Wangbo
 * @Date 2019/11/18
 * @Version V1.0
 **/
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
