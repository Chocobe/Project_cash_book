package com.cash_book.model.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class DBConnection {
	private static OracleDataSource dataSource;
	private static Connection connection;
	
	private final static String URL;
	private final static String USER;
	private final static String PW;
	
	static {
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		USER = "cashBook";
		PW = "tiger";
		
		initConnector();
	}
	
	
// ������
	private DBConnection() { }
	
	
// Connection �ʱ�ȭ
	private static void initConnector() {
		try {
			dataSource = new OracleDataSource();
			dataSource.setURL(URL);
			dataSource.setUser(USER);
			dataSource.setPassword(PW);
			
			connection = dataSource.getConnection();
			
			System.out.println("** " + USER + " ���� ���� �Ϸ� **");
			
		} catch(SQLException e) {
			System.out.println("���ӿ��� : " + e.getMessage());
		}
	}
	
	
	
// Connection getter
	public static Connection getConnection() {
		return connection;
	}
	
	
// Connection ����
	public static void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Connection ���� �Ϸ�");
				
			} catch(SQLException e) {
				System.out.println("Connection ���� ���� : " + e.getMessage());
			}
		}
	}
	
// Statement ����
	public static void close(Statement statement) {
		if(statement != null) {
			try {
				statement.close();
				System.out.println("Statement ���� �Ϸ�");
				
			} catch(SQLException e) {
				System.out.println("Statement ���� ���� : " + e.getMessage());
			}
		}
	}
	
// PreparedStatement ����
	public static void close(PreparedStatement preparedStatement) {
		if(preparedStatement != null) {
			try {
				preparedStatement.close();
				System.out.println("PreparedStatement ���� �Ϸ�");
				
			} catch(SQLException e) {
				System.out.println("PreparedStatement ���� ���� : " + e.getMessage());
			}
		}
	}
	
// ResultSet ����
	public static void close(ResultSet resultSet) {
		if(resultSet != null) {
			try {
				resultSet.close();
				System.out.println("ResultSet ���� �Ϸ�");
				
			} catch(SQLException e) {
				System.out.println("ResultSet ���� ���� : " + e.getMessage());
			}
		}
	}
}
