package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Entity
public class House {
	@Id
	private int houseNum;
	private String street;
	private String name;
	private String phone;
	
	public House() {
		super();
		this.name = "Bob";
	}

	public House(String name) {
		super();
		this.name = name;
	}

	public House(String street, String name, String phone) {
		super();
		this.street = street;
		this.name = name;
		this.phone = phone;
	}

	public House(int houseNum, String street, String name, String phone) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.name = name;
		this.phone = phone;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "House [houseNum=" + houseNum + ", street=" + street + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
