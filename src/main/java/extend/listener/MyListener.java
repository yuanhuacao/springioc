package extend.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Method;

@Component
public class MyListener implements  ApplicationListener<ContextRefreshedEvent>  {

    public void onApplicationEvent(ContextRefreshedEvent event) {

        System.out.println(event.getSource() instanceof ApplicationContext);
        System.out.println("--------iam coming----------"
        );
    }
    @PostConstruct
    public void isABaby(){
        System.out.println("lily is a girl-- myListener");
    }

    @PreDestroy
    public void  preDestorys(){
        System.out.println("-----------------什么时候调用我们，mylistener 销毁---------------------");

    }

    public static void main(String[] args) {
        Class clazz=MyListener.class;
        Method[] methods =clazz.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println( method.getName()+method.getAnnotation(PreDestroy.class));

        }

    }
}
