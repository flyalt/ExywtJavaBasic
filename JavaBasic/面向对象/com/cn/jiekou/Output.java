package com.cn.jiekou;

public interface Output {

	int Max_Cache_Line = 10;
	void out();
	void getData(String str);
	
	default void print(String... msgs){
		for(String msg:msgs){
			System.out.println(msg);
		}
	}
	
	
	default void test(){
		System.out.println("默认的test方法");
	}
	
	static String staticTest(){	
		return "接口中的类方法";
	}
}
