package com.it.de_one.controller;

import com.it.de_one.util.FaSongYzmUtil;
import com.it.de_one.util.NewYzm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendSmsController {

    @RequestMapping(value ="/sendSms",method = {RequestMethod.POST})
    public String sendSms(String phone,int flag){
        String yzm= NewYzm.getYzm();
        boolean re=FaSongYzmUtil.faSong(phone,yzm,flag);
        if (re){
            return yzm;
        }else {
            return "";
        }
    }
}
