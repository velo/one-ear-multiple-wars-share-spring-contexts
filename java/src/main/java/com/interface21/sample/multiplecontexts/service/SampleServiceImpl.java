package com.interface21.sample.multiplecontexts.service;

public class SampleServiceImpl implements SampleService {

	private String simpleProp;
	private int count;
	
	public SampleServiceImpl() {
		System.out.println("\n\n+++++++++++++++ inside SampleServiceImpl constructor ++++++++++++++++++++++\n\n");
		System.out.println(getClass());
		System.out.println(getClass().getClassLoader());
	}
	
	public String sayHello(String from) {
		return "Hello from " + from + " - " + ++count;
	}

	public String getSimpleProp() {
		return simpleProp;
	}

	public void setSimpleProp(String simpleProp) {
		this.simpleProp = simpleProp;
	}

}
