package com.netmind.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDao {

	Session session = null;

	public ClienteDao() {

		this.session = HibernateUtil.getSessionFactory().getCurrentSession();

	}

	public Cliente addCliente(Cliente cliente) throws HibernateException {

		try {
			session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		return cliente;
	}
	
	
	public List<Cliente> getClientes() throws HibernateException{
		
		List<Cliente> listaClientes = null;		
		
		try {
			session.beginTransaction();
			Query query = session.createQuery("from Cliente");
			listaClientes = (List<Cliente>) query.list();
						
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		
		return listaClientes;
		
	}
	
	
	public void modifyCliente(Cliente cliente) throws Exception{
		
		
		
		
	}
		
	
	
	
}
