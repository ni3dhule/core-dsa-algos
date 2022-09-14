package com.code.dsa;

import com.code.util.MathMaxUtil;

public class MainApplicationLoad {
	
	public static void init() {
		System.out.println("Main Application Loading Started ");
		int iFirst = 10;
		int iSecond = 30;
		int iMax = MathMaxUtil.findMax(iFirst, iSecond);
		System.out.println("Maximum Number is : "+iMax);
		
		int iMin = MathMaxUtil.findMin(iFirst, iSecond);
		System.out.println("Minimum Number is : "+iMin);
	}

}
