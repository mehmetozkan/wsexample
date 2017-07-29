package com.mehmet.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.mehmet.bo.HelloWorldBo;

//@WebService(name="HelloWorldTest",serviceName="HelloWorldWS", portName = "HelloWorldPort")
//@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@WebService
public class HelloWorldWS{

	//DI via Spring
	HelloWorldBo helloWorldBo;

	@WebMethod(exclude=true)
	public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
		this.helloWorldBo = helloWorldBo;
	}

	@WebMethod(operationName="getHelloWorld")
	public String getHelloWorld() {
		
		return helloWorldBo.getHelloWorld();
		
	}
	@WebMethod(operationName="getKelime")
	public String getKelime(@WebParam(name="name") String a,@WebParam(name="surname") String b) {
		
		return helloWorldBo.getKelime(a, b);
		
	}
}