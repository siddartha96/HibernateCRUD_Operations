package com.jsp.crud.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.crud.dao.BankDao;
import com.jsp.crud.dto.BankDto;
import com.jsp.crud.util.HibernateUtil;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		 		BankDao dao = new BankDao();
				
				//BankDto dto = new BankDto(6 ,"HDFC","Jalalli","HDFC0021","988030000");
		 		BankDto dto = new BankDto(4 ,"CNB","rajajiNagar updated","CNB0020","9877478398");
		 		
				// dao.createBank(dto);
				//dao.updateBank(dto);
				// dao.deletaBank(dto);
				//dto =  dao.getBank(3);
		 		
		 		System.out.println("Bank Name "+dto.getBankname());
//
//		BankDao dao = new BankDao();
		 		
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		BankDto dto = session.load(BankDto.class, 3);
//		System.out.println(" After load");
//		
//		tx.commit();
//		
//		session.close();
//		System.out.println("After thread");
//		System.out.println("Bank Name: "+dto.getBankname());


	}

}
