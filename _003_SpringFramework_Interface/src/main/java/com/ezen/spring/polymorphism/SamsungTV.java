package com.ezen.spring.polymorphism;

public class SamsungTV implements TV {

	@Override
	public String turnOn() {
		return "SumsungTV --- 전원 켜기";
	}

	@Override
	public String turnOff() {
		return "SumsungTV --- 전원 끄기";
	}

	@Override
	public String volumeUp() {
		return "SumsungTV --- 소리 증가";
	}

	@Override
	public String volumeDown() {
		return "SumsungTV --- 소리 감소";
	}

}
