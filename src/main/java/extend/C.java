package extend;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/3.
 */
@Component
public class C {
    public void sayHi(){
        System.out.println("C:hi A&B");

    }

    public final  void say(){
        sayHi();
    }
    public  C (){
        System.out.println("远近高低各不同"+this);
        System.out.println("搜狗拼音如书法，臭河的用吧 ");

    }

}
