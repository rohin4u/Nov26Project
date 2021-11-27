package com.spiderscrawl;

import java.io.File;
import java.io.FileNotFoundException;

public class Animal {
	
	public void m1(){
		try {
			System.out.println("hello world");
			
		}catch(IOException e) {
			
		}
		
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.m1();

	}

}
