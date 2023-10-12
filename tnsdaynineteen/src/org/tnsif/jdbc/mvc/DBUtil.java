package org.tnsif.jdbc.mvc;

import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.File;
import java.io.FileInputStream;

public class DBUtil {
	static Connection cn;
	static {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src\\db.properties"));
			class.forName(prop.getProperty("driver_name"));
			//establish connection with database
			Connection cn = DriverManager.getConnection(prop.getProperty("A18042002"));
			
			
		}
		
	}
	

}

