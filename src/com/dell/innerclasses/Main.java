package com.dell.innerclasses;

import com.dell.innerclasses.OuterClass.InnerClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.InnerClass inObj = new OuterClass().new InnerClass();
		inObj.showData();
		inObj.showPrice();
	}

}
