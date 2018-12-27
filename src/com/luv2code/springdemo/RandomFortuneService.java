package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*3);
		System.out.println(n);
		String[]fortunes=new String[]{"Good fortune","Average fortune","Bad fortune"};
		return fortunes[n];
	}

}
