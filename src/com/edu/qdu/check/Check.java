package com.edu.qdu.check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Check {
	public static void main(String[] args) throws IOException {
		String tempString = null;
		File daAn = new File("D:\\��.txt");
		System.out.format("�жϴ��ļ��Ƿ���ڣ�%b%n", daAn.exists());
		//�����ļ�������һ������
		BufferedReader reader = new BufferedReader(new FileReader(daAn));
		 ArrayList<String> keys = new ArrayList<String>();
		while ((tempString = reader.readLine()) != null) {
			keys.add(tempString);
		}
		System.out.println("���ǣ�"+keys);
		//����ѧ���ļ��У���������
		File stus = new File("D:\\ѧ��");
		String[] stuName = stus.list();
		for (String sName : stuName) {
			System.out.println(sName);
		}
		//����һ��ѧ��������һ������
		int n = 0;
		BufferedReader reader1 = new BufferedReader(new FileReader("D:\\ѧ��\\"+stuName[n]));
		ArrayList<String> stuKey = new ArrayList<String>();
		String tempString1 = null;
		while ((tempString1  = reader1.readLine()) != null) {
			stuKey.add(tempString1);
		}
		System.out.println(stuKey);
		
		
	}

}
