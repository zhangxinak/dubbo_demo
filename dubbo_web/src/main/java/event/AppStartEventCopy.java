package event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class AppStartEventCopy implements ApplicationListener<ContextStartedEvent> {


    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println(this.getClass()+"监听dubbo_web start回调监听");
    }


}
