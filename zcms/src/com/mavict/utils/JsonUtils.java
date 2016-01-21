package com.mavict.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Json 工具
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2015年12月6日 上午10:39:51
 */
public class JsonUtils {

	/** 通过json网址获得json字符串数据 */
	public static String getGson(String url){
		StringBuilder json = new StringBuilder();  
		try {  
		    URL urlObject = new URL(url);  
		    URLConnection uc = urlObject.openConnection();  
		    BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));  
		    String inputLine = null;  
		    while ( (inputLine = in.readLine()) != null) {  
		        json.append(inputLine);  
		    }  
		    in.close();  
		} catch (MalformedURLException e) {  
		    e.printStackTrace();  
		} catch (IOException e) {  
		    e.printStackTrace();  
		}  
		return json.toString();  
	}
}
