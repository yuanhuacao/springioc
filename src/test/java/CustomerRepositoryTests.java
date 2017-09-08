/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import extend.A;
import extend.B;
import extend.C;
import extend.E;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerRepositoryTests {


    @Test
    public void testSpring()  {



        BeanFactory applicationContext1 =
                    new ClassPathXmlApplicationContext("applicationContext.xml");

        A a=applicationContext1.getBean(A.class);
        a.sayHello();

//        B b=applicationContext1.getBean(B.class);

//        List list1=new ArrayList();
//        List lis2=new ArrayList();
//        B b=new B();
//        b.setName("小明");
//
//        list1.add(b);
//        lis2.add(b);
//        b.setName("大名");
//
//        B b1=(B)list1.get(0);
//        b1.setName("大名");
//        B b2=(B)lis2.get(0);
//        System.out.println(b2.getName());







//        DefaultResourceLoader resourceLoader=new DefaultResourceLoader();
//        Resource resource =resourceLoader.getResource("classpath:extend/A.class");
//        SimpleMetadataReaderFactory simpleMetadataReaderFactory=new SimpleMetadataReaderFactory();
//        MetadataReader metadataReader=simpleMetadataReaderFactory.getMetadataReader(resource);
//        System.out.println(metadataReader);

            Integer  x =4;
            Integer  y=4;
        System.out.println(x==y);



    }
}
