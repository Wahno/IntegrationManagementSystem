package com.mybean.service;


public interface DatabaseService {
	
	public void backup(String backupPath, String dbName);//����
	public void restore(String restoreFile, String dbName);//��ԭ

}
