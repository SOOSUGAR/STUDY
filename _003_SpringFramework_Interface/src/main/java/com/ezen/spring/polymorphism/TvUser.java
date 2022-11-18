package com.ezen.spring.polymorphism;

public class TvUser {

	public static void main(String[] args) {
		
		TV Tv = new SamsungTV();
		Tv.turnOn();
		Tv.volumeUp();
		Tv.volumeDown();
		Tv.turnOff();
		
		Tv = new LgTV();
		Tv.turnOn();
		Tv.volumeUp();
		Tv.volumeDown();
		Tv.turnOff();
	}

}
