package com.cn.formart;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatTest {
	public static void main(String[] args)  throws Exception{ 
		
		double db = 1234000.567;
		
		Locale[] locales = {Locale.CHINA, Locale.JAPAN,Locale.GERMAN,Locale.US};
		
		NumberFormat[] nFormat = new NumberFormat[12];
		
		for (int i = 0; i < locales.length; i++) {
			
			nFormat[i*3] = NumberFormat.getNumberInstance(locales[i]);
			nFormat[i*3+1] = NumberFormat.getPercentInstance(locales[i]);
			nFormat[i*3+2] = NumberFormat.getCurrencyInstance(locales[i]);
		}
		
		for (int i = 0; i < locales.length; i++) {
			
			String tip = i == 0 ? "---china----":i==1?"------japan------": i==2?"----german-----":"-----us----";
			System.out.println(tip);
			
			System.out.println("通用数值格式："+nFormat[i*3].format(db));
			System.out.println("百分比数值格式："+nFormat[i*3+1].format(db));
			System.out.println("货币数值格式："+nFormat[i*3+2].format(db));
		}
		
		
//		DateTimeFormatter
//		SimpleDateFormat
//		DateFormat 
		/*
		DateTimeFormatter[] formatters = new DateTimeFormatter[]{
				
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
				
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				
				DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};
		
		LocalDateTime dateTime = LocalDateTime.now();
		for (int i = 0; i < formatters.length; i++) {
			
			System.out.println(dateTime.format(formatters[i]));
			System.out.println(formatters[i].format(dateTime));
		}
		*/
		
		//日期转换为字符串  
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm a");  
        String nowStr = now .format(format);  
        System.out.println(nowStr); 
		
		String dateString = "2018-07-09 08时09分02秒";
		DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH时mm分ss秒");
		LocalDateTime dt1 = LocalDateTime.parse(dateString, fomatter1);
		System.out.println(dt1.toString());
	}

}
