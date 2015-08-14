package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vo.City;

public class CityDAO extends BaseDAO implements ICityDAO {

	@Override
	public void addCity(City city) {

		Connection connection = null;
		String insertQuery = "INSERT INTO city (id, name, countrycode, district,population) VALUES(?,?,?,?,?)";
		try{
		PreparedStatement statement = connection.prepareStatement(insertQuery);
		statement.setInt(1,city.getId() );
		statement.setString(2, city.getName());
		statement.setString(3,city.getCountryCode() );
		statement.setString(4, city.getDistrict());
		statement.setInt(5,city.getPoulation() );
		
		//Step 4:Execute Query
		//When we execute non-select statement ,we use executeUpdate Method,and for select we use executeQuery stmt
		int i=statement.executeUpdate();
		
		if(i ==1){
			System.out.println("Record Added Successfully");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	@Override
	public City getCityById(int id) {
		
		String query = "select * from city where id =? ";
		
		Connection connection = null;
		
		City city = null;
		
		try {
			 connection= getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("query");
			
			preparedStatement.setInt(1, id);
			
			//ResultSet helps to read the record and fetch the record
			ResultSet resultset =preparedStatement.executeQuery();

			if(resultset.next() ){
				
				city =new City();
				System.out.println("\n");
				city.setId(resultset.getInt("id"));
				city.setName(resultset.getString("name"));
				city.setCountryCode(resultset.getString("countrycode"));
				city.setDistrict(resultset.getString("district"));
				city.setPoulation(resultset.getInt("population"));
				System.out.println();
			}
			
			resultset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return city;
	}

	@Override
	public ArrayList<City> getCitys() {

		ArrayList<City> cityList = new ArrayList<City>();
		
		String query = "select * from city ";
		
		try {
			Connection connection= getConnection();
			
			Statement stmt = connection.createStatement();
			
			//ResultSet helps to read the record and fetch the record
			ResultSet resultset =stmt.executeQuery(query);
			
			
			
			
			while(resultset.next() ){
				
				City city =new City();
				System.out.println("\n");
				city.setId(resultset.getInt("id"));
				city.setName(resultset.getString("name"));
				city.setCountryCode(resultset.getString("countrycode"));
				city.setDistrict(resultset.getString("district"));
				city.setPoulation(resultset.getInt("population"));
				System.out.println();
				
				cityList.add(city);
			}
			
			resultset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return cityList;
		
	}
public City getCityByName(String name) {
		
		String query = "select * from city where id =? ";
		
		Connection connection = null;
		
		City city = null;
		
		try {
			 connection= getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("query");
			
			preparedStatement.setString(1, name);
			
			//ResultSet helps to read the record and fetch the record
			ResultSet resultset =preparedStatement.executeQuery();

			if(resultset.next() ){
				
				city =new City();
				System.out.println("\n");
				city.setId(resultset.getInt("id"));
				city.setName(resultset.getString("name"));
				city.setCountryCode(resultset.getString("countrycode"));
				city.setDistrict(resultset.getString("district"));
				city.setPoulation(resultset.getInt("population"));
				System.out.println();
			}
			
			resultset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return city;
	}
	@Override
	public void updateCity(City city) {

		
	}

	@Override
	public void deleteCity(int id) {

		
	}

}
