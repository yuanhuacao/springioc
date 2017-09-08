package extend;

import com.alibaba.fastjson.JSON;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

public class ClassReader {

    public static void readObject(Object object){

        String json=JSON.toJSONString(object);
        Map map =JSON.parseObject(json, HashMap.class);
        MultiValueMap multiValueMap=new LinkedMultiValueMap();
        multiValueMap.setAll(map);

        System.out.println(multiValueMap);

    }

    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.setAge(18);
        boy.setHobby("踢足球");
        boy.setName("王大力");
        ClassReader.readObject(boy);

        Integer a=18;
        System.out.println(a==18);


    }
}
