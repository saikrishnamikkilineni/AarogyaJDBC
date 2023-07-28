package com.abc.Hospital.dao;

import java.util.List;

import com.abc.Hospital.model.Patient;

public interface DaoInterface {

	
	
	public boolean addPatient(Patient pt);
	public List<Patient> viewAllPatients();
	public Patient getPatientByAadhar(Long Aadhar_num);
	public Patient getPatientByCity(String city);
	public Patient getPatientByAge(int minAge, int maxAge);
	public boolean deletePatient ( Long Aadhar_num);

	
}
