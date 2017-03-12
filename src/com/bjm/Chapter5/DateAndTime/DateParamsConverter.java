package com.bjm.Chapter5.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bjming on 17-3-12.
 */
//SpringMVC 前端传时间字符串格式
public class DateParamsConverter {
    public Date convert(String source){
        if(source !=null && !"".equals(source)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return sdf.parse(source);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
