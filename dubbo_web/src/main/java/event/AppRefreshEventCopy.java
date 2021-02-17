package event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppRefreshEventCopy implements ApplicationListener<ContextRefreshedEvent> {


    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(this.getClass()+"监听dubbo_web refresh回调监听");
    }


//    public AppStartEvent(Object source) {
//        super(source);
//        System.out.println("程序启动后回调监听");
//    }
}
