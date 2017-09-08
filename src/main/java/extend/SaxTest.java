package extend;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SaxTest {


    public static void main(String[] args) throws Exception {
        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser saxParser=factory.newSAXParser();
        InputStream inputStream=SaxTest.class.getResourceAsStream("/Books.xml");
        SaxParseHandler defaultHandler=new SaxParseHandler();
        saxParser.parse(inputStream,defaultHandler);
        List<Book> bookList=defaultHandler.getBookList();
        for (Book book:bookList){
            System.out.println(book.toString());
        }



    }
}
