/**
 * 
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Andriis
 *
 */
public class DbConnection {

	private static Connection con = null;
	private static DbConnection dbConnection = null;
	
	//information about the connection to the db
	private static final String dbName = "CSC-CSD-S211_10407531";
	private static final String serverName = "hildur.ucn.dk";
	private static final String instanceName = "SQLEXPRESS";
	private static final String portNumber = "1433";
	
	private DbConnection() {
		String urlString = 
		String.format("jdbc:sqlserver://%s\\%s:%s;databaseName=%s", serverName, instanceName, portNumber, dbName);
		String userName = "CSC-CSD-S211_10407531";
		String password = "Password1!";
		
		try {
			con = DriverManager.getConnection(urlString, userName, password);
            System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("Couldn't connect");
		}
	}
	
	public static DbConnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DbConnection();
		}
		return dbConnection;
	}
	
	public static boolean instanceIsNull()
    {
       return (dbConnection == null);
    }  
	
	public static Connection getConnection() {
		return con;
	}
	
	 public static void closeConnection() {
	    try {
	        con.close();
	        dbConnection = null;
	        System.out.println("The connection is closed");
	    } catch (Exception e){
	        System.out.println("Error trying to close the database " +  e.getMessage());
	    }
	  }
	 
	 public void startTransaction() throws DataAccessException {
		 try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			throw new DataAccessException("Couldn't start transaction", e);
		}
	 }
	 
	 public void commitTransaction() throws DataAccessException {
		 try {
			try {
				con.commit();
			} catch (SQLException e) {
				throw e;
			} finally {
				con.setAutoCommit(true);
			}
		} catch (SQLException e) {
			throw new DataAccessException("Couldn't commit transaction", e);
		}
	 }
	 
	 public void rollbackTransaction() throws DataAccessException {
			try {
				try {
					con.rollback();
				} catch (SQLException e) {
					throw e;
				} finally {
					con.setAutoCommit(true);
				}
			} catch (SQLException e) {
				throw new DataAccessException("Could not rollback transaction", e);
			}
		}
	 
	 public int executeInsertWithIdentity(PreparedStatement ps) throws DataAccessException {
			// requires prepared statement to be created with the additional argument PreparedStatement.RETURN_GENERATED_KEYS  
			int res = -1;
			try {
				res = ps.executeUpdate();
				if (res > 0) {
					ResultSet rs = ps.getGeneratedKeys();
					rs.next();
					res = rs.getInt(1);
				}
			} catch (SQLException e) {
				throw new DataAccessException("Couldn't execute insert", e);
			}
			return res;
		}
}
