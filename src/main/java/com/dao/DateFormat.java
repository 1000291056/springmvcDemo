package com.dao;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by wufeifei on 2016/12/21.
 */
public class DateFormat implements Formatter<Date> {
    private String datePattern;

    public DateFormat(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Date date, Locale locale) {
        return null;
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
