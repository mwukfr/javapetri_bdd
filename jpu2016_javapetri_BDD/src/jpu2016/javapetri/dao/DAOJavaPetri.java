package jpu2016.javapetri.dao;

//import the needed libraries ; we could just :
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import the necessary classes
import jpu2016.javapetri.model.JavaPetri;


public class DAOJavaPetri {
	
	//connection to our database with login info
	private String URL = "jdbc:mysql://localhost:3306/jpu2016_javapetri_bdd?autoReconnect=true&useSSL=false";
	private String LOGIN = "root";
	private String PASSWORD = "";
	//Connection et Statement de nos bibliotheques
	private Connection connection;
	private Statement statement;
	
	//initialisation des attributs
	public DAOJavaPetri() {
		 this.connection = null;
		 this.statement = null;
	}
	
	 public boolean open() {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 this.connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			 this.statement = this.connection.createStatement(); 
		 } 
		 catch (final ClassNotFoundException e) {
			 e.printStackTrace();
			 return false;
		 } 
		 catch (final SQLException e) {
			 e.printStackTrace();
			 return false;
		 }
		 System.out.println("All good");
		 return true;
		 }

	public void close() {
		System.out.println("Not all good");
		//remove void when adding code
	}
	
	public JavaPetri getJavaPetriById(int id) {
		return null; //remove null
	}
	
	
	public void insertJavaPetri(JavaPetri javaPetri) {
		//remove void when adding code
	}
	
	private ResultSet executeQuery(String query) {
		return null; //change return
	}
	
	private int executeUpdate(String query) {
		return 0; //change return
	}
	
}
