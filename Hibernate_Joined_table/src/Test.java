import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Address;
import com.entity.Bid;
import com.entity.Buyer;
import com.entity.Item;
import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();

		
		Transaction transaction = session.getTransaction();	
		
		
		 Buyer buyer = new Buyer();
		 buyer.setUserId(101);
		 buyer.setFirstName("Raj");
		 buyer.setLastName("J");
		 buyer.setFavouriteCategory("Mobiles");
		
		 Bid bid1 = new Bid(99901,300);
		 Bid bid2 = new Bid(99902,300);
		
		 Item item1 = new Item(11111,"XYZ");
		 Item item2 = new Item(11112,"ABC");
		
		 bid1.setItem(item1);
		 bid2.setItem(item2);
		
		 HashSet<Bid> bids = new HashSet<>();
		 bids.add(bid1);
		 bids.add(bid2);
		
		 buyer.setBids(bids);
		
		 Address address = new Address(101,"Hyd","TG");
		
		 buyer.setAddress(address);
		 
		 transaction.begin();
		
		 	session.save(buyer);
		
		
		
		 transaction.commit();
		
		 session.close();


		
//		Criteria criteria = session.createCriteria(Product.class);
//		
//		ProjectionList projectionList = Projections.projectionList();
//		
//		projectionList.add(Projections.max("price"));
//		
//		
//		criteria.setProjection(projectionList);
//		
//		Float maxPrice = (Float)criteria.uniqueResult();
//		
//		System.out.println("MaxPrice : "+maxPrice);
		
//		Criteria criteria = session.createCriteria(Product.class);
//		
//		Criterion criterion = Restrictions.gt("id", 5000);
//		
//		Criterion criterion2 = Restrictions.like("name", "L%");		
//		
//		LogicalExpression logicalExpression = Restrictions.or(criterion,criterion2);
//		
//		criteria.add(logicalExpression);
//		
//		
//		
//		ProjectionList projectionList = Projections.projectionList();
//		
//		projectionList.add(Projections.property("name"));
//		projectionList.add(Projections.property("price"));
//		
//		criteria.setProjection(projectionList);
//		
//		List<Object[]> objectsArrList = criteria.list();
//		
//		for (Object[] objects : objectsArrList) {
//			
//			System.out.println("Name  : "+objects[0]);
//			System.out.println("Price : "+objects[1]);
//			System.out.println();
//		}
//		
//		List<Product> productList = criteria.list();
//		
//		for (Product product : productList) {
//			
//			System.out.println("Id    : "+product.getId());
//			System.out.println("Name  : "+product.getName());
//			System.out.println("Price : "+product.getPrice());
//			System.out.println("Description : "+product.getDescription());
//			System.out.println();
//
//		}
		
//		Query query = session.createQuery("select p,s from Product p left outer join p.supplier s");
//		
//		List<Object[]> listOfArrays = query.list();
//		
//		for (Object[] objects : listOfArrays) {
//			
//			Product product =(Product)objects[0];
//			Supplier supplier = (Supplier)objects[1];
//			
//			System.out.println("Id    : "+product.getId());
//			System.out.println("Name  : "+product.getName());
//			System.out.println("Price : "+product.getPrice());
//			System.out.println("Description : "+product.getDescription());
//			System.out.println();
//			
//			if(supplier!=null){
//				System.out.println("Supplier Id   : "+supplier.getId());
//				System.out.println("Supplier Name : "+supplier.getName());
//			}
//			System.out.println();
//			System.out.println();
//		}
		
//		Query query = session.createQuery("select max(p.price) from Product p");
//		
//		Float maxPrice = (Float)query.uniqueResult();
//		
//		System.out.println("MaxPrice : "+maxPrice);
		                                                                      //0               //1
		//Query query = session.createQuery("select p from Product p where p.id > ? and p.name like ?" );
//		Query query = session.createQuery("select p.name,p.price from Product p where p.id > :pid and p.name like :pname" );
//		
//		query.setInteger("pid", 6000);
//		query.setString("pname","L%");
//
//		List<Object[]> objectsArrList = query.list();
//		
//		for (Object[] objects : objectsArrList) {
//			
//			System.out.println("Name  : "+objects[0]);
//			System.out.println("Price : "+objects[1]);
//			System.out.println();
//		}
		
//		List<Product> products = query.list();
//		
//		for (Product product : products) {
//
//			System.out.println("Id    : "+product.getId());
//			System.out.println("Name  : "+product.getName());
//			System.out.println("Price : "+product.getPrice());
//			System.out.println("Description : "+product.getDescription());
//			System.out.println();
//			
//		}
		
//		Item item = (Item)session.get(Item.class,101);
//		
//		System.out.println("ItemId   : "+item.getId());
//		System.out.println("ItemName : "+item.getName());
//		
//		Set<Category> categories = item.getCategories();
//		
//		for (Category category : categories) {
//			System.out.println("CategoryId   : "+category.getId());
//			System.out.println("CategoryName : "+category.getName());
//			System.out.println();
//		}
//		
//		
//		
//		Set<Bid> bids = item.getBids();
//		
//		for (Bid bid : bids) {			
//			System.out.println("BidId : "+bid.getId());
//			System.out.println("BidAmount : "+bid.getBidAmount());
//			System.out.println();
//		}
		
//		Product product = new Product(77732,"Xperia E4g","Mobile", 11000);
//		
//		Transaction transaction = session.getTransaction();
//		
//		transaction.begin();
//			
//			session.save(product);
//			
//		transaction.commit();
//		
//		session.close();
		
//		Product product = (Product)session.get(Product.class, 102);
//		
//		System.out.println("Id    : "+product.getId());
//		System.out.println("Name  : "+product.getName());
//		System.out.println("Price : "+product.getPrice());
//		System.out.println("Description : "+product.getDescription());
		

	}

}
