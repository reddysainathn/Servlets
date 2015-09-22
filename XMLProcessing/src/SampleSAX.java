import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SampleSAX {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		// First Create SAXParserFactory Object
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		SAXParser saxParser = saxParserFactory.newSAXParser();

		BookXMLHandlerSAX bookXMLHandlerSAX = new BookXMLHandlerSAX();

		saxParser.parse(new File("books.xml"), bookXMLHandlerSAX);

		BookStore bookStore = bookXMLHandlerSAX.getBookStore();

		List<Book> books = bookStore.getBooks();
		for (Book book : books) {

			System.out.println("Title :" + book.getTitle());
			System.out.println("Author :" + book.getAuthor());
			System.out.println("Year :" + book.getYear());
			System.out.println("Price :" + book.getPrice());
			System.out.println();
		}

	}

}
