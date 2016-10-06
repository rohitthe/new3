package com.psl.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginDAO {
	
	public static boolean validateFields(String username,String password){
		

		String regexpChars = "^[a-zA-Z0-9]{1,}$";
		Matcher matcher,matcher1;
		
		if(username.length()<1 || username.equals("")){
			return false;
		}
		if(password.length()<1 || password.equals("")){
			return false;
		}
		
		// to be uncommented for Special Character handling
		Pattern pattern = Pattern.compile(regexpChars);
		matcher = pattern.matcher(username);
		matcher1 = pattern.matcher(password);
		if(!matcher.matches() || !matcher1.matches())
		{
		   return false;
		}
		return true;
	}
}
