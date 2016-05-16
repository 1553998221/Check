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
		File daAn = new File("D:\\答案.txt");
		System.out.format("判断答案文件是否存在：%b%n", daAn.exists());
		//读答案文件，生成一个集合
		BufferedReader reader = new BufferedReader(new FileReader(daAn));
		 ArrayList<String> keys = new ArrayList<String>();
		while ((tempString = reader.readLine()) != null) {
			keys.add(tempString);
		}
		System.out.println("答案是："+keys);
		//遍历学生文件夹，生成数组
		File stus = new File("D:\\学生");
		String[] stuName = stus.list();
		for (String sName : stuName) {
			System.out.println(sName);
		}
		//读第一个学生，生成一个集合
		int n = 0;
		BufferedReader reader1 = new BufferedReader(new FileReader("D:\\学生\\"+stuName[n]));
		ArrayList<String> stuKey = new ArrayList<String>();
		String tempString1 = null;
		while ((tempString1  = reader1.readLine()) != null) {
			stuKey.add(tempString1);
		}
		System.out.println(stuKey);
		
		
	}

}
