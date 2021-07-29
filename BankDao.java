package com.jsp.crud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.crud.dto.BankDto;
import com.jsp.crud.util.HibernateUtil;

public class BankDao {
	SessionFactory  sf = HibernateUtil.getSessionFactory();

	public void createBank(BankDto dto) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
	}
	public BankDto getBank(int id) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		//BankDto dto = session.get(BankDto.class, id);
		BankDto dto = session.load(BankDto.class, id);
		System.out.println("Bank Name "+dto.getBankname());
		tx.commit();
		session.close();
		return dto;

	}

	public void updateBank(BankDto dto) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(dto);
		tx.commit();
		session.close();
	}
	
	
	
	public void deletaBank(BankDto dto) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(dto);
		tx.commit();
		session.close();
	}



}
