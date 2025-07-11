package com.nt.entity;

import java.io.Serializable;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="OTM_PHONE_NUMBER")
//@Setter
//@Getter
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class PhoneNumber implements Serializable {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "REG_NO_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	@Column(length=20)
	@NonNull
	private Long mobileNo;
	@Column(length=20)
	@NonNull
	private  String provider;
	@Column(length=20)
	@NonNull
	private String numberType;
	@ManyToOne(targetEntity=Person.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="PERSON_ID",referencedColumnName="PID")
	private Person PersonInfo;
	
	public PhoneNumber()
	{
	 System.out.println("PhoneNumber::0-param Constructor");
	}
	public String toString() {
		return "PhoneNumber[regNo="+regNo+",mobileNo="+mobileNo+",provider="+provider+",numberType="+numberType+"]";
	}
	
	  public void setPersonInfo(Person per) { // TODO Auto-generated method stub
	  
	  } public String getMobileNo() { // TODO Auto-generated method stub 
		  return null; }
	 

}
