package extend;

import org.springframework.asm.ClassReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.NestedIOException;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.type.classreading.AnnotationMetadataReadingVisitor;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.io.*;

/**
 * Created by Administrator on 2017/8/3.
 */
@Service
public class A extends C  implements E {
    public A(String name) {
        this.name = name;
    }

    @Value("${girl}")
    private String gilr;

    public A() {
    }

    @Override
    public  void sayHi(){
        System.out.println(gilr+"A:hi B&C");
    }

    private String name;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file=new File("D:\\idea-app\\spring-guid\\springioc\\target\\classes\\extend\\B.class");
        InputStream is = new FileInputStream(file);
        ClassReader classReader = null;
        try {
            classReader = new ClassReader(is);
        }
        catch (IllegalArgumentException ex) {
            throw new NestedIOException("ASM ClassReader failed to parse class file - " +
                    "probably due to a new Java class file version that isn't supported yet: " + file, ex);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            is.close();
        }

        AnnotationMetadataReadingVisitor visitor = new AnnotationMetadataReadingVisitor(DefaultResourceLoader.class.getClassLoader());
        classReader.accept(visitor, ClassReader.SKIP_DEBUG);

        System.out.println(visitor.getAnnotationTypes());
        System.out.println(visitor.getClassName());
        String className=visitor.getClassName();
        Class clazz=Class.forName(className);
        System.out.println(clazz.getMethods().length);






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
        System.out.println(gilr);
        b.sayHi();

    }

    public void test() {
        System.out.println("我理解粉丝滤镜粉丝滤镜发啥了");
    }














}
