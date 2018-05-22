package com.cn.cls;
public class Discern {

	private String prop = "外部类的实力变量";
	private class InClass{
		
		private String prop = "内部类的实例变量";
		
		public void info(){
			String prop= "局部变量";
			System.out.println(Discern.this.prop);
			System.out.println(this.prop);
			System.out.println(prop);
		}
	}
	
	public void test(){
		InClass in = new InClass();
		in.info();
	}
	
	public static void main(String[] args){
		
		new Discern().test();
		
	}
}
