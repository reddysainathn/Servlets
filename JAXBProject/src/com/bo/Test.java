package com.bo;

import java.io.File;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.bo.Items.Item;

public class Test {
	
	public static	XMLGregorianCalendar getGregorianCalendarNow() throws  DatatypeConfigurationException{
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		
		XMLGregorianCalendar  now  = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		
		return now;
	}

	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException {

		// JAXBContext acts as factory object for marshaller and unmarsheller
		// Objects
		JAXBContext jaxbContext = JAXBContext.newInstance("com.bo");
		// ///////marshaler Code

		Marshaller marshaller = jaxbContext.createMarshaller();

		USAddress usAddress = new USAddress();

		usAddress.setName("Jaine");
		usAddress.setStreet("Brook St 1234");
		usAddress.setCity("Lonos");
		usAddress.setState("CA");
		usAddress.setCountry("USA");

		Items items = new Items();

		Item item = new Item();

		item.setProductName("Mobile");
		item.setPartNum("0944");
		item.setQuantity(4);
		item.setUSPrice(new BigDecimal(600));

		Item item2 = new Item();

		item.setProductName("Computer");
		item.setPartNum("0945");
		item.setQuantity(3);
		item.setUSPrice(new BigDecimal(900));
		
		items.getItem().add(item);
		
		items.getItem().add(item2);
		
		PurchaseOrderType purchaseOrderType = new PurchaseOrderType();
		
		purchaseOrderType.setBillTo(usAddress);
		purchaseOrderType.setShipTo(usAddress);
		
		purchaseOrderType.setItems(items);
		
		purchaseOrderType.setComment("Urget delivery");
		
		//GragorianCalender is very easy to convert to XML
		
		purchaseOrderType.setOrderDate(getGregorianCalendarNow());
		
		//It will give JAXB_formatted_Outpur
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(purchaseOrderType, new  File(" sample.xml"));
		
		System.out.println("Marshalling Done Successfully");

		// ///////Unmarshaller code
		// Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		//
		// JAXBElement<PurchaseOrderType> jaxbElement =
		// (JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new
		// File("po.xml"));
		//
		// PurchaseOrderType purchaseOrderType = jaxbElement.getValue();
		//
		// System.out.println("Comments :"+purchaseOrderType.getComment());
		//
		// System.out.println("Date :"+purchaseOrderType.getOrderDate());
		//
		// USAddress shipTo = purchaseOrderType.getBillTo();
		//
		// USAddress billTo = purchaseOrderType.getShipTo();
		//
		// System.out.println();
		// System.out.println("Shipping Details");
		// System.out.println("Name: "+shipTo.getName());
		// System.out.println("City :" +shipTo.getCity());
		//
		// System.out.println();
		//
		// Items items = purchaseOrderType.getItems();
		//
		// List<Item> itemList = items.getItem();
		//
		// for (Item item : itemList) {
		// System.out.println();
		//
		// System.out.println("Item name:" +item.getProductName());
		// System.out.println("Item Part Number:"+item.getPartNum());
		// System.out.println("Item Qunatity :"+item.getQuantity());
		// System.out.println();
		// }
		//
		//
		//
		// }
	}

}
