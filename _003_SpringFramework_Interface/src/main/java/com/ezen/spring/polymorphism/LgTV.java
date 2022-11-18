package com.ezen.spring.polymorphism;

public class LgTV implements TV{

	@Override
	public String turnOn() {
		return "LgTV --- 전원 켜기";
	}

	@Override
	public String turnOff() {
		return "LgTV --- 전원 끄기";
	}

	@Override
	public String volumeUp() {
		return "LgTV --- 소리 증가";
	}

	@Override
	public String volumeDown() {
		return "LgTV --- 소리 감소";
	}

}
