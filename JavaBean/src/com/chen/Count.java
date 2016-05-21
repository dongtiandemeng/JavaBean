package com.chen;

public class Count {
	private int count = 0;
	public Count() {
		System.out.println("==========一个新的对象的产生=============");
	}
	public int getCount(){
		return ++this.count;
	}
}
