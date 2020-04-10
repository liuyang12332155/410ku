package com.it.de_one.util;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
public class FaSongYzmUtil {

    public static boolean faSong(String phone, String yzm,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fh1HUKfXtTaDhN5nLAu", "jprDM4GXc9tpxueDMkXlQ0NymDT8Q1");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "抛开米");
        request.putQueryParameter("TemplateCode", "SMS_187571033");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+yzm+"\"}");

        if (flag==1) {
            request.putQueryParameter("TemplateCode", "SMS_187571033");
            return true;
        }else{
            request.putQueryParameter("TemplateCode", "SMS_187561114");
        }
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }
}
