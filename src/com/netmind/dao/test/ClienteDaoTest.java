package com.netmind.dao.test;

import org.junit.Test;
import static org.junit.Assert.*;
import com.netmind.dao.Cliente;
import com.netmind.dao.ClienteDao;

public class ClienteDaoTest {


	ClienteDao clienteDao = new ClienteDao();
	@Test
	public void add1Cliente (){
		
		Cliente cliente = new Cliente("Javi","Casado","12312Q");

		assertNotNull(clienteDao.addCliente(cliente)!=null);
		
	}
	
	@Test
	public void getAll2 (){

		assertTrue(clienteDao.getClientes().size()>0);

		
	}
	
}
