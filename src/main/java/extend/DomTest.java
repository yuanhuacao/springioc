package extend;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class DomTest {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        InputStream inputStream=DomTest.class.getResourceAsStream("/applicationContext.xml");
//        InputStream inputStream=DomTest.class.getResourceAsStream("/Books.xml");
        Document document=builder.parse(inputStream);



        // 一级
        Element element=document.getDocumentElement();
        NamedNodeMap namedNodeMap=element.getAttributes();
        System.out.println("根标签名称"+element.getTagName());
        for (int j=0;j<namedNodeMap.getLength();j++){
            Node  node=namedNodeMap.item(j);
            System.out.println( "一级标签属性：  "+node.getNodeName()  );
            System.out.println("一级标签的属性内容:" +node.getTextContent());
        }
        // 二级
        NodeList nodeList=element.getChildNodes();
        System.out.println(nodeList.getLength());
        for (int k=0;k<nodeList.getLength();k++){

            Node node=nodeList.item(k);
            if (node instanceof  Element) {
            System.out.println("二级名称"+node.getNodeName());
            System.out.println("二级内容"+node.getTextContent().trim());
            System.out.println("二级属性");

                NamedNodeMap namedNodeMap1 = node.getAttributes();
                for (int n = 0; n < namedNodeMap1.getLength(); n++) {
                    Node node1 = namedNodeMap1.item(n);
                    System.out.println("二级标签属性：  " + node1.getNodeName());
                    System.out.println("二级标签的属性内容:" + node1.getTextContent().trim());
                }
                System.out.println("--------------");
            }

        }









    }

}
