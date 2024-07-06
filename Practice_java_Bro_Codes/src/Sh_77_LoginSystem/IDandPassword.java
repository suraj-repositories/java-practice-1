package Sh_77_LoginSystem;

import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword(){
		logininfo.put("Shubham","Shubham@123");
		logininfo.put("Suraj", "Suraj@123");
		logininfo.put("Tushar","Tushar@123");
		
		
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
