package com.cn.test;

public class enumTestClass {
	
	public void judge(SeasonEnum s){
		
		switch (s) {
		case SPRING:
			System.out.println("春");
			break;
		case SUMMER:
			System.out.println("夏");
			break;
		case FALL:
			System.out.println("秋");
			break;
		case WINTE:
			System.out.println("冬");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (SeasonEnum season : SeasonEnum.values()) {
			System.out.println(season);
		}
		new enumTestClass().judge(SeasonEnum.SPRING);
		
	}

}
