package log;

import java.io.FileInputStream;
import java.util.Properties;

public class App {
	public boolean userlogin(String userName,String password) {
		Properties prop= new Properties();
		try {
			prop.load(new FileInputStream("src/main/resource/crd.propert"));
			
		}catch(Exception E) {
			System.out.println("Erro with File reading");
		}
		
		String un=prop.getProperty("user");
		String pwd=prop.getProperty("password");
		
		if (userName.equals(un) && password.equals(pwd)) {
			return true;
		}
			else {
				return false;
		}
			
	}
}
