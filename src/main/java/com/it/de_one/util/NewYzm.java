package com.it.de_one.util;

public class NewYzm {
    public static String getYzm(){
        String yzm="";
        for(int i=1;i<=6;i++){
            yzm+=(int) Math.random()*10;

        }
        return yzm;
    }
}
