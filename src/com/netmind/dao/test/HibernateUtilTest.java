package com.netmind.dao.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.netmind.dao.HibernateUtil;;

public class HibernateUtilTest {

	@Test
	public void testGetSessionFactory(){
		assertNotNull(HibernateUtil.getSessionFactory());
	}

}
