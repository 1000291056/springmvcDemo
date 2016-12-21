package com.dao;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Created by wufeifei on 2016/12/21.
 */
public class MyRegister implements FormatterRegistrar {
    private String datePattern;
    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry) {

    }

    public MyRegister(String datePattern) {
        this.datePattern = datePattern;
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
