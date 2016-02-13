package com.mavict.utils;

import java.util.Random;

/**
 * 
 * 
 * @author 沧海软件(北京)有限公司
 * @date 2016年2月9日 上午9:48:27
 */
public class RandomUtils {

	public static String getRandom(int min, int max){
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return String.valueOf(s);
	}

}
