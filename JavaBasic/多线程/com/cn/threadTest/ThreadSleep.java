package com.cn.threadTest;

public class ThreadSleep {

	public static void main(String[] args) {
		
		//守护线程
		Thread t1 = new Thread(){
		
			public void run() {
				
				for (int i = 0; i < 2; i++) {
					
					System.out.println(getName()+ " a ********");
				}
			}
		};
		
		
		Thread t2 = new Thread(){
			
			public void run() {
				
				for (int i = 0; i < 50; i++) {
					
					System.out.println(getName()+ " b ********");
				}
			}
		};
		
		//当为true时 设置为守护线程 
		t2.setDaemon(true);
		t1.start();
		t2.start();
		//设置t2为守护线程t1执行完毕之后t2线程也结束
	}
	
	public static void Demo02_sleep() {
		
		
	}
	
	
	public static void Demo_01Sleep() {
		
		for (int i = 20; i >= 0; i--) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("倒计时第：" + i + "秒");
		}
	}
}
