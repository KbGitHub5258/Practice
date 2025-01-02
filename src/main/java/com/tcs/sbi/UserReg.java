package com.tcs.sbi;

import in.practice.security.PwdSecurityService;

public class UserReg {
	
	public static void main(String[] args) {
		
		PwdSecurityService pss = new PwdSecurityService();
		
		String encode = pss.encode("Kamlesh");
		System.out.println(encode);
	}

}
