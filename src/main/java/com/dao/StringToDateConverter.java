package com.dao;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wufeifei on 2016/12/21.
 */
public class StringToDateConverter implements Converter<String,Date> {
    private String datePattern;

    public StringToDateConverter(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String s) {
        try {
            SimpleDateFormat format=new SimpleDateFormat(datePattern);
            format.setLenient(false);
            return format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
