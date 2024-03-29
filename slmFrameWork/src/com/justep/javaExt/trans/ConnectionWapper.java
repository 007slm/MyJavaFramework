package com.justep.javaExt.trans;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

class ConnectionWapper implements Connection {
	Connection conn=null;
	
	public ConnectionWapper(Connection conn) {
		this.conn=conn;
	}
	
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		if(iface==Connection.class){
			return true;
		}
		conn.isWrapperFor(iface);
		return false;
	}

	public Statement createStatement() throws SQLException {
		return conn.createStatement();
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}

	public CallableStatement prepareCall(String sql) throws SQLException {
		return conn.prepareCall(sql);
	}

	public String nativeSQL(String sql) throws SQLException {
		return conn.nativeSQL(sql);
	}

	public void setAutoCommit(boolean autoCommit) throws SQLException {
		
		conn.setAutoCommit(autoCommit);
	}

	public boolean getAutoCommit() throws SQLException {
		
		
		return conn.getAutoCommit();
	}

	public void commit() throws SQLException {
		
		conn.commit();
	}

	public void rollback() throws SQLException {
		
		conn.rollback();
	}

	public void close() throws SQLException {
		
		conn.close();
	}

	public boolean isClosed() throws SQLException {
		
		return conn.isClosed();
	}

	public DatabaseMetaData getMetaData() throws SQLException {
		
		return conn.getMetaData();
	}

	public void setReadOnly(boolean readOnly) throws SQLException {
		conn.setReadOnly(readOnly);
		
	}

	public boolean isReadOnly() throws SQLException {
		
		return conn.isReadOnly();
	}

	public void setCatalog(String catalog) throws SQLException {
		conn.setCatalog(catalog);
		
	}

	public String getCatalog() throws SQLException {
		
		return conn.getCatalog();
	}

	public void setTransactionIsolation(int level) throws SQLException {
		conn.setTransactionIsolation(level);
		
	}

	public int getTransactionIsolation() throws SQLException {
		
		return conn.getTransactionIsolation();
	}

	
	public SQLWarning getWarnings() throws SQLException {
		
		return conn.getWarnings();
	}

	
	public void clearWarnings() throws SQLException {
		conn.clearWarnings();
		
	}

	
	public Statement createStatement(int resultSetType, int resultSetConcurrency)
			throws SQLException {
		
		return conn.createStatement(resultSetType,resultSetConcurrency);
	}

	
	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		
		return conn.prepareStatement(sql,resultSetType,resultSetConcurrency);
	}

	
	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		
		return conn.prepareCall(sql, resultSetType, resultSetConcurrency);
	}

	
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		
		return conn.getTypeMap();
	}

	
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		
		conn.setTypeMap(map);
	}

	
	public void setHoldability(int holdability) throws SQLException {
		conn.setHoldability(holdability);
		
	}

	
	public int getHoldability() throws SQLException {
		
		return conn.getHoldability();
	}

	
	public Savepoint setSavepoint() throws SQLException {
		
		return conn.setSavepoint();
	}

	
	public Savepoint setSavepoint(String name) throws SQLException {
		
		return conn.setSavepoint();
	}

	
	public void rollback(Savepoint savepoint) throws SQLException {
		
		conn.rollback(savepoint);
	}

	
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		conn.releaseSavepoint(savepoint);
		
	}

	
	public Statement createStatement(int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		
		return conn.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	
	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		
		return conn.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	
	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		
		return conn.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
			throws SQLException {
		
		return conn.prepareStatement(sql, autoGeneratedKeys);
	}

	
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
			throws SQLException {
		
		return conn.prepareStatement(sql, columnIndexes);
	}

	
	public PreparedStatement prepareStatement(String sql, String[] columnNames)
			throws SQLException {
		
		return conn.prepareStatement(sql, columnNames);
	}

	
	public Clob createClob() throws SQLException {
		
		return conn.createClob();
	}

	
	public Blob createBlob() throws SQLException {
		
		return conn.createBlob();
	}

	
	public NClob createNClob() throws SQLException {
		
		return conn.createNClob();
	}

	
	public SQLXML createSQLXML() throws SQLException {
		
		return conn.createSQLXML();
	}

	
	public boolean isValid(int timeout) throws SQLException {
		
		return conn.isValid(timeout);
	}

	
	public void setClientInfo(String name, String value)
			throws SQLClientInfoException {
		conn.setClientInfo(name, value);
		
	}

	
	public void setClientInfo(Properties properties)
			throws SQLClientInfoException {
		
		conn.setClientInfo(properties);
	}

	
	public String getClientInfo(String name) throws SQLException {
		
		return conn.getClientInfo(name);
	}

	
	public Properties getClientInfo() throws SQLException {
		
		return conn.getClientInfo();
	}

	
	public Array createArrayOf(String typeName, Object[] elements)
			throws SQLException {
		
		return conn.createArrayOf(typeName, elements);
	}

	
	public Struct createStruct(String typeName, Object[] attributes)
			throws SQLException {
		
		return conn.createStruct(typeName, attributes);
	}

	
	public <T> T unwrap(Class<T> iface) throws SQLException {
		
		return conn.unwrap(iface);
	}

	public void setSchema(String schema) throws SQLException {
		// TODO Auto-generated method stub
	}

	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void abort(Executor executor) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
