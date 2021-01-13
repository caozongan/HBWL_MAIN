package com.hbwl.test;

import com.hbwl.dbc.DB_Pos_170_DAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PGtest {


	public static void main(String[] args) {
		Session session1 = DB_Pos_170_DAO.getSession();
		Transaction tx1 = session1.beginTransaction();
		String hql="SELECT * from public.z100002_promote_sp('2021-01-09','2021-01-11');";
		
		try {
			Query query = session1.createSQLQuery(hql);
			System.out.println(query.list().size());
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}

}
