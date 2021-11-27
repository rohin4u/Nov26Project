package com.spiderscrawl.work;

public class Test {

	public static void main(String[] args)throws Exception {
		
		int num = Integer.parseInt(args[0]);
		if(num<20) {
			throw new TooYoungException("You are too Young, Please wait for the right time");
		}
		else if(num>50) {
			throw new TooOldException("Your time is over, Now Die");
		}
		else {
			System.out.println("We have taken your request, Will call you soon");
		}
		

	}
	


}
