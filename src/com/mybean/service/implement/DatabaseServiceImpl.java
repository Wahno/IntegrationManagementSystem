package com.mybean.service.implement;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.mybean.service.DatabaseService;
@Service
public class DatabaseServiceImpl implements DatabaseService {

	@Override
	public void backup(String backupPath, String dbName) {
		// TODO �Զ����ɵķ������
		String com = "mysqldump -uroot -p123456 -P3306 "+dbName+" > "+ backupPath;
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(com);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	@Override
	public void restore(String restoreFile, String dbName) {
		// TODO �Զ����ɵķ������
		String com ="mysql -uroot -p123456  "+dbName+" < "+restoreFile;
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(com);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
