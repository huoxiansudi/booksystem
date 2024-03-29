package com.hxsd.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @author Administrator
 *
 *123456 =ba61ce8fa1e3725876e6363c76043c8d
 */
public class CryptographyUtil {
	
	public static void main(String[] args) throws Exception {
		System.out.println(md5("123456", "java"));
	}
	
	/**
	 * Md5加密  加盐
	 * 
	 * @param pwd
	 *            加密的内容
	 * @param salt
	 *            盐值
	 */
	public static String md5(String pwd, String salt) {
		return new Md5Hash(pwd, salt).toString();
	}


}
