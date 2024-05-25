package com.jdy.ch6_04exer03;

public class MemberService {
	boolean login(String id, String pw) {
		if ((id.equals("hong")) && (pw.equals("12345"))) {
			return true;
		} else {
			return false;
		}
		
	}
	void logout(String id) {
		System.out.println("로그라웃되었습니다.");;
	}
}
