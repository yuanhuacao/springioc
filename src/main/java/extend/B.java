package extend;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/3.
 */
@Component
public class B extends C {

    private  String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHi() {
        System.out.println("B:hi A&C");
    }
}


