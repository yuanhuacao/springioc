package extend.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyAware implements ApplicationEventPublisherAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
    @PostConstruct
    public void isABaby(){
        System.out.println("lilei is a boy");
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        
    }
}
