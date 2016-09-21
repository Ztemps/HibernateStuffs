package com.netmind.dao.test;

import org.junit.Test; 
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;

import com.netmind.dao.annotations.Cliente;
import com.netmind.dao.annotations.ClienteDao;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClienteDaoTest {

	ClienteDao clienteDao = new ClienteDao();

	@Test
	public void test1add() {

		Cliente cliente = new Cliente("Javi", "Casado", "12312Q");

		assertNotNull(clienteDao.addCliente(cliente) != null);

	}

	@Test
	public void test2get() {

		assertTrue(clienteDao.getClientes().size() > 0);

	}

	@Test
	public void test3modify() {

		Cliente cliente = new Cliente("Paco", "Paquito", "007");

		assertNotNull(clienteDao.modifyCliente(cliente));

	}

	@Test
	public void test4remove() {

		Cliente cliente = new Cliente("Javi", "Casado", "12312Q");
	
	}

}
