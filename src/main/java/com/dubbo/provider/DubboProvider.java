package com.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DubboProvider {

	public static void main(String[] args) {
		 /*使用自带的Main方法启动provider*/
//		com.alibaba.dubbo.container.Main.main(args); 
		
		
		//使用jar包形式启动

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:dubbo-provider.xml");
		
			context.start();
		} catch (Exception e) {
			System.out.println("== DubboProvider context start error:");
			e.printStackTrace();
		}
		synchronized (DubboProvider.class) {
			while (true) {
				try {
					DubboProvider.class.wait();
				} catch (InterruptedException e) {
					System.out.println("== synchronized error:");
				}
			}
		}
	}
}
