package extend;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxParseHandler  extends DefaultHandler {

    List<Book> bookList;

    private String startElment;
    private  Book book;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        bookList=new ArrayList<Book>();

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        startElment=qName;
        if (qName.equalsIgnoreCase("book")){
            book=new Book();

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        startElment=null;
        if (qName.equalsIgnoreCase("book")){
            bookList.add(book);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
            String value = new String(ch, start, length);
            super.characters(ch, start, length);
            if ("name".equals(startElment)) {
                book.setName(value);
            } else if ("author".equals(startElment)) {
                book.setAuthor(value);
            } else if ("price".equals(startElment)) {
                book.setPrice(value);
            }
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
//        System.out.println("bookList===="+bookList.size());
//        for (Book book:bookList){
//            System.out.println(book.toString());
//        }
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getStartElment() {
        return startElment;
    }

    public void setStartElment(String startElment) {
        this.startElment = startElment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
