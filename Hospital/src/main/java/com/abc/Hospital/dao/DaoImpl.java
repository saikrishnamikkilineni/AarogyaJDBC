package com.abc.Hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.abc.Demo.model.Student;
import com.abc.Hospital.model.Patient;

public class DaoImpl implements DaoInterface{

	
	

    Connection con=null;

    public DaoImpl() {

        

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");

        }

        catch(Exception e) {

            System.out.println(e);

        }

    }

    //Add patient details
    public boolean addPatient(Patient pt)  {

        

	       boolean b=false;

	       try {

	       PreparedStatement pstmt=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?)");

	       pstmt.setInt(1, pt.getAge());

	       pstmt.setString(2, pt.getName());

	       pstmt.setString(3, pt.getAddress());

	       pstmt.setString(4, pt.getGuardian_name());
	       pstmt.setString(5, pt.getGuardian_address());
	       pstmt.setString(6,pt.getCity());
	       pstmt.setString(7,pt.getGender());
	       pstmt.setLong(8,pt.getAadhar_num());
	       pstmt.setLong(9,pt.getContact_num());
	       pstmt.setLong(10,pt.getGuardian_num());
	       
	       
	       

	       int i=pstmt.executeUpdate();

	       if(i>0) {

	           b=true;

	       }

	       }

	       catch(Exception e) {

	           System.out.println(e);

	       }

	        return b;

	    }

 // View all patient details
	public List<Patient> viewAllPatients() {
		ArrayList<Patient> pst = new ArrayList<Patient>();
		Patient patient=null;
		try {
    		PreparedStatement pstmt=con.prepareStatement("select * from patient");
    		ResultSet rs=pstmt.executeQuery();
    		//patient =new Patient();
    		
    		while(rs.next()) {
    			Patient p=new Patient();
    			p.setAge(rs.getInt("age"));
    			p.setName(rs.getString("name"));
    			p.setAddress(rs.getString("address"));
    			p.setGuardian_name(rs.getString("guardian_name"));
    			p.setGuardian_address(rs.getString("guardian_address"));
    			p.setCity(rs.getString("city"));
    			p.setGender(rs.getString("gender"));
    			p.setAadhar_num(rs.getLong("aadhar_num"));
    			p.setContact_num(rs.getLong("contact_num"));
    			p.setGuardian_num(rs.getLong("guardian_num"));
   			 pst.add(p);
    		}
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
		return pst;
    	
    }

	//By Aadhar number
	public Patient getPatientByAadhar(Long Aadhar_num) {
		
		Patient patient=null; 
		try {
			PreparedStatement pstmt=con.prepareStatement("select * from patient where Aadhar_num=? ");
			pstmt.setLong(1, Aadhar_num);
		
			ResultSet rs=pstmt.executeQuery();
			patient=new Patient();
			while(rs.next()) {
				patient.setAge(rs.getInt("age"));
				patient.setName(rs.getString("name"));
				patient.setAddress(rs.getString("address"));
				patient.setGuardian_name(rs.getString("guardian_name"));
				patient.setGuardian_address(rs.getString("guardian_address"));
				patient.setCity(rs.getString("city"));
				patient.setGender(rs.getString("gender"));
				patient.setAadhar_num(rs.getLong("aadhar_num"));
				patient.setContact_num(rs.getLong("contact_num"));
				patient.setGuardian_num(rs.getLong("guardian_num"));
              }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return patient;
	}

	//By city
	public Patient getPatientByCity(String city) {
		Patient patient=null; 
		try {
			PreparedStatement pstmt=con.prepareStatement("select * from patient where city=? ");
			pstmt.setString(1, city);
		
			ResultSet rs=pstmt.executeQuery();
			patient=new Patient();
			while(rs.next()) {
				patient.setAge(rs.getInt("age"));
				patient.setName(rs.getString("name"));
				patient.setAddress(rs.getString("address"));
				patient.setGuardian_name(rs.getString("guardian_name"));
				patient.setGuardian_address(rs.getString("guardian_address"));
				patient.setGender(rs.getString("gender"));
				patient.setAadhar_num(rs.getLong("aadhar_num"));
				patient.setContact_num(rs.getLong("contact_num"));
				patient.setGuardian_num(rs.getLong("guardian_num"));
              }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return patient;
		
	}

	// By group range age
	public Patient getPatientByAge(int minAge, int maxAge) {
		
		Patient patient=null; 
		try {
			PreparedStatement pstmt=con.prepareStatement("select * from patient where age between ? and ? ");
			pstmt.setInt(1, minAge);
			pstmt.setInt(2,maxAge);
		
		
			ResultSet rs=pstmt.executeQuery();
			patient=new Patient();
			while(rs.next()) {
				patient.setAge(rs.getInt("age"));
				patient.setName(rs.getString("name"));
				patient.setAddress(rs.getString("address"));
				patient.setGuardian_name(rs.getString("guardian_name"));
				patient.setGuardian_address(rs.getString("guardian_address"));
				patient.setGender(rs.getString("gender"));
				patient.setAadhar_num(rs.getLong("aadhar_num"));
				patient.setContact_num(rs.getLong("contact_num"));
				patient.setGuardian_num(rs.getLong("guardian_num"));
              }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return patient;
		
	}

	//Delete patient details
	public boolean deletePatient(Long Aadhar_num) {
		boolean b=false; 
		try {
			PreparedStatement pstmt=con.prepareStatement("delete from patient where Aadhar_num=? ");
			pstmt.setLong(1, Aadhar_num);
			
			int i=pstmt.executeUpdate();
	    	
	    	if(i>0) {
	    		b=true;
	    	}		
	    	
    	
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	return b;
	}
	
    
    
	    
	
	
	
	
	
}
