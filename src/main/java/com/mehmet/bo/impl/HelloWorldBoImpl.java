package com.mehmet.bo.impl;

import com.mehmet.bo.HelloWorldBo;
 
public class HelloWorldBoImpl implements HelloWorldBo{
 
	@Override
	public String getKelime(String a, String b) {
		 
		return a+" "+b;
	}

	@Override
	public String getHelloWorld() {
		return "JAX-WS + Spring!";
	}
	
}