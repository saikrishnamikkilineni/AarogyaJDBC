package com.abc.Hospital;

import java.util.List;
import java.util.Scanner;

import com.abc.Demo.model.Student;
import com.abc.Hospital.dao.DaoImpl;
import com.abc.Hospital.dao.DaoInterface;
import com.abc.Hospital.model.Patient;


import java.sql.*;

public class App 
{
   
    	DaoInterface dao=new DaoImpl();
  	  static Scanner sc=new Scanner(System.in);
  	   
  	    //Add -s
  	  
  	  public  void add() {
  	     Patient pt=new Patient();

  	    
  	   
  	   System.out.println("Enter age");
  	    pt.setAge(sc.nextInt()); 
  	  System.out.println("Enter patient name :");
      pt.setName(sc.next());
      System.out.println("Enter patient address :");
      pt.setAddress(sc.next());
      System.out.println("Enter Guardian name :");
      pt.setGuardian_name(sc.next());
      System.out.println("Enter Guardian address :");
      pt.setGuardian_address(sc.next());
      System.out.println("Enter patient city :");
      pt.setCity(sc.next());
      System.out.println("Enter patient Gender :");
      pt.setGender(sc.next());
      System.out.println("Enter Aadhar Number :");
      pt.setAadhar_num(sc.nextLong());
      System.out.println("Enter Contact Number :");
      pt.setContact_num(sc.nextLong());
      System.out.println("Enter Guardian Number :");
      pt.setGuardian_num(sc.nextLong()); 
      
    boolean b=dao.addPatient( pt);
	

	    if(b) {

	        System.out.println("student record added successfully");

	    }

	    else {

	        System.out.println("fail");

	    }
	      
  	  }
  	  
  	  //view All -s
  	  
  	  public void all() {
  		List<Patient> pst=dao.viewAllPatients();
  		
  	  for (Patient p : pst) {
	  
  		  System.out.println("Patient Age: " + p.getAge());
  	      System.out.println("Patient Name: "+p.getName());
  	      System.out.println("Address :"+p.getAddress());
  	      System.out.println("Guardian_name :"+p.getGuardian_name());
  	      System.out.println("Guardian_address :"+p.getGuardian_address());
  	      System.out.println("City :"+p.getCity());
  	      System.out.println("Gender :"+p.getGender());
  	      System.out.println("Aadhar Number :"+p.getAadhar_num());
  	      System.out.println("Contact Number :"+p.getContact_num());
  	      System.out.println("Guardian_Number :"+p.getGuardian_num());
  	  
  	  }
  	  }

  	    //Get details by Aadhar number -s
  	  public void id() {
  		System.out.println("Enter Aadhar number to get details of patient :");
	    Long aadhar_num=sc.nextLong();
	    Patient rs=dao.getPatientByAadhar(aadhar_num);
	    System.out.println("patient name: "+rs.getName());
	    System.out.println("Address :"+rs.getAddress());
	      System.out.println("Guardian_name :"+rs.getGuardian_name());
	      System.out.println("Guardian_address :"+rs.getGuardian_address());
	      System.out.println("City :"+rs.getCity());
	      System.out.println("Gender :"+rs.getGender());
	      System.out.println("Aadhar Number :"+rs.getAadhar_num());
	      System.out.println("Contact Number :"+rs.getContact_num());
	      System.out.println("Guardian_Number :"+rs.getGuardian_num());
  	  }

  	  //Get details by City -s 
  	  public void city() {
  		  System.out.println("Enter city to get details of patient :");
  		  String city=sc.next();
  		  Patient rs=dao.getPatientByCity(city);
  		System.out.println("patient name: "+rs.getName());
	    System.out.println("Address :"+rs.getAddress());
	      System.out.println("Guardian_name :"+rs.getGuardian_name());
	      System.out.println("Guardian_address :"+rs.getGuardian_address());
	      System.out.println("Gender :"+rs.getGender());
	      System.out.println("Aadhar Number :"+rs.getAadhar_num());
	      System.out.println("Contact Number :"+rs.getContact_num());
	      System.out.println("Guardian_Number :"+rs.getGuardian_num());
  	  }
  	  
  	  // Get by between age
  	  public void age() {
  		  System.out.println("Enter age1 :");
  		  int minAge=sc.nextInt();
  		  System.out.println("Enter age2 :");
  		  int maxAge=sc.nextInt();
  		  Patient rs=dao.getPatientByAge( minAge, maxAge);
  		System.out.println("patient name: "+rs.getName());
	    System.out.println("Address :"+rs.getAddress());
	      System.out.println("Guardian_name :"+rs.getGuardian_name());
	      System.out.println("Guardian_address :"+rs.getGuardian_address());
	      System.out.println("Gender :"+rs.getGender());
	      System.out.println("Aadhar Number :"+rs.getAadhar_num());
	      System.out.println("Contact Number :"+rs.getContact_num());
	      System.out.println("Guardian_Number :"+rs.getGuardian_num());
  	  }
  	  
  	  
  	  //Delete patient details -s
  	  public void delete() {
  		  System.out.println("Enter the Aadhar number :");
  		  Long aadhar_num=sc.nextLong();
  		 boolean b=dao.deletePatient(aadhar_num); 
  		 if(b) {

 	        System.out.println("student record Deleted successfully");

 	    }

 	    else {

 	        System.out.println("fail");

 	    } 
  	  }
  	  
  	  
  	  
  	  
  	 public void viewOptions() {
    	 int option = 0;
         
         do {
        	 System.out.println("1.Add patient details");
        	 System.out.println("2.view all patient details");
        	 System.out.println("3.Get patient details by Aadhar number");
        	 System.out.println("4.Get patient details by city");
        	 System.out.println("5.Get patient details by group Age");
        	 System.out.println("6.Delete patient details by Aadhar number");
        	 System.out.println("6.Exit");
         
              System.out.println("Enter the option: ");
        	  option=sc.nextInt();
        	  if(option==1) {
        		  add();
        	  }
        
  	 
        	  else if(option==2) {
        		  all();
        	  }
        	  else if(option==3) {
        		  id();
        	  }
        	  else if(option==4) {
        		  city();
        	  }
        	  
        	  else if(option==5) {
        		  age();
        	  }
        	  
        	  else if(option==6) {
        		  delete();
        	  }
  	 } while(option!=7);
  	 }
        	  
  	    
  	  
  	 public static void main( String[] args )
     {
  	  
  	  App obj=new App();
  	obj.viewOptions();
  	  
    }
}
