package com.jdy.ch6_04exer03;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12645");
		
		if (result == true) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 혹은 pw가 올바르지 않습니다.");
		}		
	}

}
