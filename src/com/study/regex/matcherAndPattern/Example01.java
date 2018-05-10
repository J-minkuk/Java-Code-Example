package com.study.regex.matcherAndPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 {

  public static void main(String[] args) {
    String s = "Telephone: 032-431-2323 010-5533-2299 02-555-3388 010-222-5678";
    String regex = "010-[0-9]{3,4}-[0-9]{4}";

    Pattern pattern = Pattern.compile(regex);	// 정규식을 찾기 위한 Pattern 객체 생성
    Matcher matcher = pattern.matcher(s);		  // 비교할 문자열에서 정규식과 일치하는 부분을 찾기 위한 Matcher 객체 생성

//        if(matcher.find())
//        	System.out.println(matcher.group(0));

    while(matcher.find())
      System.out.println(matcher.group(0));


  }

}