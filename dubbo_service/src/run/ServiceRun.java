import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.Cache;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceRun {

    public static void main(String[] args) {
        try{
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
            context.start();
            System.out.println("Dubbo service start...");
            System.out.println("--------------------");
//            InvocationHandler zx=(InvocationHandler)context.getBean("zx");
//            Object loginService=(ILogin)context.getBean("loginService");
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
            Cache cache=(Cache)context.getBean("cache");
            cache.setString("loginTime",sdf.format(new Date())) ;
            cache.setString("zhangxinak1232jdsadsavvdasdsa32321rsasddsa",sdf.format(new Date())) ;

            System.out.println( cache.getString("loginTime"));
            System.out.println( cache.getString("zhangxinak1232jdsadsavvdasdsa32321rsasddsa"));
            System.out.println("--------------------");
            synchronized (ServiceRun.class){
                ServiceRun.class.wait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }




}
