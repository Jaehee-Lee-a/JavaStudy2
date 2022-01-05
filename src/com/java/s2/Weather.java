package com.java.s2;

public class Weather {
	//지역번호, 도시명, 기온, 습도, 상태(날씨), 미세먼지 농도
	//  2    서울  -2.5  40%   흐림    좋음/나쁨/매우나쁨
	// 지역번호 0 제외 032 -> 32    02 -> 2
	int number; //지역번호 
	String city; //도시명
	double temperature; //기온
	int humidity; //습도
	String state; //상태(날씨)
	String dust; //미세먼지 농도
}
