package com.cn.threadTest;

public class Threadyield {

	public static void main(String[] args) {
		
			new MyThread_Demo().start();
			new MyThread_Demo().start();
		
	}
}


class MyThread_Demo extends Thread{
	
	public void run() {

		for (int i = 0; i <= 1000; i++) {

			if (i % 10 == 0) {
				// 让出cpu
				Thread.yield();
			}
			System.out.println(getName() + "........." + i);

		}
	}
}
