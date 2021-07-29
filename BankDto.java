
package com.jsp.crud.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="bank_table")
public class BankDto  implements Serializable {
	
	@Id
	// @GeneratedValue
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="bank_id")
	private int bankId;
	
	@Column(name = "bank_name")
	private String bankname;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "ifsc")
	private String IFSC;
	
	@Column(name = "contact")
	private String contactNo;
	
	
	public BankDto() {
		super();
		
	}

	public BankDto(int bankId, String bankname, String branch, String iFSC, String contactNo) {
		super();
		this.bankId = bankId;
		this.bankname = bankname;
		this.branch = branch;
		IFSC = iFSC;
		this.contactNo = contactNo;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	

}
