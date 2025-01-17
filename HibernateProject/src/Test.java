import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.entity.Product;
import com.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactroy();
		// We can obtain a sessionFactroy using openSession()
		Session session = sessionFactory.openSession();
		
		
		//Using Aggregate functions in Criteria
		Criteria criteria=session.createCriteria(Product.class);
		
		ProjectionList projectionList = Projections.projectionList();
		
		projectionList.add(Projections.max("price"));
		
		criteria.setProjection(projectionList);
		
		float maxPrice = (float) criteria.uniqueResult();
		
		System.out.println("Max Price:"+maxPrice);
	
		/*
		//Partial Records are called Projections
		//Fetch only Product name and price
		Criteria criteria=session.createCriteria(Product.class);
		
		Criterion criterion =Restrictions.gt("id", 3);
		Criterion criterion2 = Restrictions.like("name","G%" );
		
		LogicalExpression logicalExpression= Restrictions.and(criterion,criterion2);
		
		criteria.add(logicalExpression);
		//using projectionlist() in Projection,we can filter the records in Criteria
		ProjectionList projectionList = Projections.projectionList();
	
		projectionList.add(Projections.property("name"));
    	projectionList.add(Projections.property("price"));
	

    	criteria.setProjection(projectionList);
    	
    	
    	List<Object[]> objectArrayList = criteria.list();
    	
    	for (Object[] objects : objectArrayList) {
			
    		
    		System.out.println("Product Name :"+objects[0]);
    		System.out.println("Product price :"+objects[1]);
    		
		}*/
		
/*		//Using methods we create Queries using Criteria
		Criteria criteria=session.createCriteria(Product.class);
		
		
		//Criterians are the conditions used for the record
		
		Criterion criterion =Restrictions.gt("id", 3);
		Criterion criterion2 = Restrictions.like("name","G%" );
		
//		criteria.add(criterion);
//		criteria.add(criterion2);
		//It returns a object called as Logical Expression
		//using Restrictions.or() ,we get all records which satisfy anyone conditions
		//using Restrictions.and() ,we get all records which satisfy all conditions
		LogicalExpression logicalExpression= Restrictions.and(criterion,criterion2);
		
		criteria.add(logicalExpression);
		
		List<Product> productList = criteria.list();
		
		for (Product product : productList) {
			System.out.println("Id :"+product.getId());
			System.out.println("Name :"+product.getName());
			System.out.println("Description :"+product.getDescription());
			System.out.println("Price :"+product.getPrice());
			System.out.println();
		}
		*/
		/*//using Joins(inner-Join)
		//Query query = session.createQuery("SELECT p,s FROM Product p inner join p.supplier s");
		
		//using Joins(left-Outer-Join)
		Query query = session.createQuery("SELECT p,s FROM Product p left outer join p.supplier s");
		
		List<Object[]> lisfOfArrays=query.list();
		
		for (Object[] objects : lisfOfArrays) {
			
			
			Product product = (Product) objects[0];
			Supplier supplier = (Supplier) objects[1];
			
			
			System.out.println("Id :"+product.getId());
			System.out.println("Name :"+product.getName());
			System.out.println("Description :"+product.getDescription());
			System.out.println("Price :"+product.getPrice());
			System.out.println();
			System.out.println("Supplier Id :"+supplier.getId());
			System.out.println("Supplier Name :"+supplier.getName());
			System.out.println();
			System.out.println();
		}
		*/
		
		
//		//Using Aggrigate Functions---AVG,MIN etc
//		
//		
//		Query query =session.createQuery("select max(b.bidAmount) from Bid b");
//		
//		float maxPrice = (float) query.uniqueResult();
//		
//		System.out.println("Maximim Price is::"+maxPrice);
		
	/*	//If we want only two rows of the table
		//This type of queries are called Projections
		Query query =session.createQuery("select c.name,c.countrycode from City c where c.id> :cid and c.name like :cname");
		
		query.setInteger("cid", 4079);
		query.setString("cname", "L%");
		
		List<Object[]> objectArrayList = query.list();
		
		for (Object[] objects : objectArrayList) {
			
			System.out.println("Name :"+objects[0]);
			System.out.println("CountryCode :"+objects[1]);
			System.out.println();

		}*/
		
		
		/*// HQL Query
		//All city Records from City Table Using City class
		//Method -1 
		//Query query =session.createQuery("from City");
		//method-2(c refers to City class type)(Best-Way)
		//It is hard-coded with values
		//Query query =session.createQuery("select c from City c where c.id>4079 and c.name like 'L%'");
		
		
		//Reusable Query (using Positional Binding parameters)
																		//0					//1
		//Query query =session.createQuery("select c from City c where c.id> ? and c.name like ?");
		
		
		//query.setInteger(0, 4079);
		//query.setString(1, "L%");
		
		//Reusable Query (using named Binding parameters)
																		//cid and cname are Named Bind Parameters
		Query query =session.createQuery("select c from City c where c.id> :cid and c.name like :cname");
		
		query.setInteger("cid", 4079);
		query.setString("cname", "L%");
		//It will list all records of city table
		List<City> city = query.list();
		
		for (City cities : city) {
			
			//System.out.println("ID         :"+cities.getId());
			System.out.println("Name       :"+cities.getName());
			System.out.println("CountryCode:"+cities.getCountrycode());
			//System.out.println("District   :"+cities.getDistrict());
			//System.out.println("Population :"+cities.getPopulation());
			System.out.println();
		}*/
		
		/*//Many To many Relation(Item-Category)
		Item item = (Item) session.get(Item.class, 108);
		System.out.println("Item ID:" + item.getId());
		System.out.println("Item Name:" + item.getName());
		
		Set<Category> categories = item.getCategories();
		
		for (Category category : categories) {
			System.out.println("Category ID:" +category.getId());
			System.out.println("Category Name:" +category.getName());
			System.out.println();
		}*/
		
//		Item item = (Item) session.get(Item.class, 101);
//
//		System.out.println("Item ID:" + item.getId());
//		System.out.println("Item Name" + item.getName());
//
//		// Getting Associated Bid Records with the ID 
//
//		Set<Bid> bids = item.getBids();
//		
//		for (Bid bid : bids) {
//			
//			System.out.println("BidId :"+bid.getId());
//			System.out.println("Bid Amount:"+bid.getBidAmount());
//			System.out.println();
//		}

		/*
		 * //Add a City Record City city = new
		 * City(4080,"London","UK","LDN",435678);
		 * 
		 * //We need a Transaction to use Insert,Update Delete Transaction
		 * transaction = session.getTransaction(); transaction.begin();
		 * 
		 * session.save(city);
		 * 
		 * transaction.commit();
		 * 
		 * session.close();
		 */

		// //getting record by ID
		// City city =(City)session.get(City.class, 102);
		//
		// System.out.println("ID         :"+city.getId());
		// System.out.println("Name       :"+city.getName());
		// System.out.println("CountryCode:"+city.getCountrycode());
		// System.out.println("District   :"+city.getDistrict());
		// System.out.println("Population :"+city.getPopulation());
	}
}
