package com.chen;

public class SimpleBean {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SimpleBean() {
		System.out.println("==========一个新的实例对象的产生==========");
		//System.out.println("=========测试第二次==========");
	}

}
