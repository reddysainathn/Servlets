import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//This class is created to handle the events(it is a Listener)
public class BookXMLHandlerSAX extends DefaultHandler {

	BookStore bookStore = new BookStore();

	Book book = new Book();

	String elementName = "";

	public BookStore getBookStore() {
		return bookStore;
	}

	// Starts reading the document calling startDocument method
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();

		System.out.println("****Start Document reading****");
	}

	// When parser comes across startDocument() is called,next it calls
	// startElement()
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);

		if (qName.equals("book")) {

			// System.out.println("Book details");
		}

		switch (qName) {
		case "title":
			// System.out.println("Title  :" );

			elementName = "title";

			break;
		case "author":
			// System.out.println("Author :" );

			elementName = "author";

			break;
		case "year":
			// System.out.println("Year   :" );

			elementName = "year";
			break;
		case "price":
			// System.out.println("Price  :" );

			elementName = "price";
			break;

		default:
			break;
		}
	}

	// when parser comes across test,it is called
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);

		String str = new String(ch, start, length);
		if (elementName != null) {
			switch (elementName) {
			case "title":
				book.setTitle(str);
				break;
			case "author":
				book.setAuthor(str);
				break;
			case "year":
				book.setYear(str);
				break;
			case "price":
				book.setPrice(str);
				break;

			default:
				break;
			}
		}
	}

	// When parser comes across startElement() is called,next it calls
	// endElement()
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		elementName="";
		if (qName.equals("book")) {
			// System.out.println("  End book");

			bookStore.getBooks().add(book);
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}

}
