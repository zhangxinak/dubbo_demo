package com.impl;

import com.dubbo_demo.api.HelloApi;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("helloApiImpl")
public class HelloApiImpl implements HelloApi {


    private Logger logger= Logger.getLogger(HelloApiImpl.class);


    public String sayHello() {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result="hello zhangxinak " + sdf.format(new Date());
        return result ;
    }
}
