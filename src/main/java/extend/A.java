package extend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/3.
 */
@Service
public class A extends C  implements E {
    public A(String name) {
        this.name = name;
    }

    private A() {
    }

    @Override
    public  void sayHi(){
        System.out.println("A:hi B&C");
    }

    private String name;

    public static void main(String[] args) {

    }
    @Autowired
    private B b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  sayHello(){
        b.sayHi();

    }

    @Override
    public void test() {
        System.out.println("我理解粉丝滤镜粉丝滤镜发啥了");
    }
}
