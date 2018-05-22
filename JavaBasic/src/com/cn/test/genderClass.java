package com.cn.test;
public class genderClass {
	
	public static void main(String[] args) {
		
		gender g = Enum.valueOf(gender.class, "FEMALE");
//		g.name = "女";
//		g.setName("女");
		g.info();
		
		System.out.println(g +"代表" +g.getName());
		
		Operation op = Enum.valueOf(Operation.class, "PLUS");
		System.out.println(op.eval(3, 2));
		
		//两中强制系统垃圾回收的方法；
		//程序只能控制一个对象何时不再被任何引用变量引用不能控制它何时被回收
		//强制垃圾回收后会有一些效果，但是否回收仍不确定
//		System.gc();
//		Runtime.getRuntime().gc();
	}

}
