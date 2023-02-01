package com.test.architect.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandleProperties {

	private static Properties properties;
	private static FileInputStream in;
	private static String value;

	public static String readProperties(String filePath, String key) {
		properties = new Properties();
		try {
			in = new FileInputStream(filePath);
			properties.load(in);
			value = properties.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}