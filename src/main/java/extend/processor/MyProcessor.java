package extend.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor  implements BeanPostProcessor{
//    @Nullable
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("这是一个。。。。。。。。");
//        return null;
//    }
//
//    @Nullable
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("这是两个。。。。。。。。");
//        return null;
//    }
}
