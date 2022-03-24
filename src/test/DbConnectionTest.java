package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import db.DbConnection;

public class DbConnectionTest {
	
	DbConnection con = null;
	@Before
	public void setUp() {
		con = DbConnection.getInstance();
	}

	@Test
	public void wasConnected() {
		assertNotNull("Connected - connection cannot be null", con);
		
		DbConnection.closeConnection();
		boolean wasNullified = DbConnection.instanceIsNull();
		assertTrue("Disconnected - instance set to null", wasNullified);
		
		con = DbConnection.getInstance();
		assertNotNull("Connected - connection cannot be null", con);	
	}
	
	@After
	public void cleanUp() {
		DbConnection.closeConnection();
	}	

}
