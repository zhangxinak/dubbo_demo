package event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppStartEvent implements ApplicationListener<ContextStartedEvent> {


    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("程序dubbo_congig start回调监听");
    }


}
