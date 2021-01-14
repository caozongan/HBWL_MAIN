package com.hbwl.dbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DB_Mys_147_DAO {
	// 单态，单例设计模式，就是在入口处（构造方法）限制了对象的实例化操作。
	private static Configuration cfg = null;
	private static SessionFactory sf = null;
	// 第一次加载时静态块，且执行一次
	static {
		cfg = new Configuration().configure("hibernate.cfg_Mys_147.xml");
		sf = cfg.buildSessionFactory();
	}

	private DB_Mys_147_DAO() {// 私有化了构造方法，外面无法调用。
	}

	public static Session getSession() {// 静态方法通过类名调用。
		// return sf.getCurrentSession();
		if (sf != null) {
			return sf.openSession();
		} else {
			return null;
		}
	}
}
