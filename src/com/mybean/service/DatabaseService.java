package com.mybean.service;


public interface DatabaseService {
	
	public void backup(String backupPath, String dbName);//备份
	public void restore(String restoreFile, String dbName);//还原

}
