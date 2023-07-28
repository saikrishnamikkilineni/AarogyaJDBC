package com.abc.Hospital.model;

import java.time.LocalDate;

public class Patient {

	
	int age;
	  String name, address, guardian_name, guardian_address, city, gender;
	  long aadhar_num, contact_num, guardian_num;
	  
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGuardian_name() {
		return guardian_name;
	}
	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}
	public String getGuardian_address() {
		return guardian_address;
	}
	public void setGuardian_address(String guardian_address) {
		this.guardian_address = guardian_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getAadhar_num() {
		return aadhar_num;
	}
	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	public long getGuardian_num() {
		return guardian_num;
	}
	public void setGuardian_num(long guardian_num) {
		this.guardian_num = guardian_num;
	}
}
