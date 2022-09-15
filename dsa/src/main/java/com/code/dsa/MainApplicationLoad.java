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
		
		double x = -83.76;  
        // find the closest int for the double  
        System.out.println("Round of "+x+" is : "+Math.round(x)); 
        
        x = 28;    
        double y = 4;  
        
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y)); 
        System.out.println("Power of x and y is: " + Math.pow(x, y));
	}

}
