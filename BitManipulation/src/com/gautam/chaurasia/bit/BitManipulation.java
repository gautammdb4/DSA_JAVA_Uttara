package com.gautam.chaurasia.bit;

import java.util.List;

public class BitManipulation {

	
	public static String toBinary(int a)
	{
		if (a == 0) {
	        return "0";
	    }
		
		StringBuffer binary = new StringBuffer();
		
		  while (a > 0) {
		        binary.insert(0, a % 2); 
		        a /= 2; // Divide the number by 2 for the next iteration
		    }
//		  binary.insert(0, 0); 
		
		return binary.toString();
	}
	
	public static int toDecimal(String s)
	{
		int n=s.length();
		int ans=0;
		char[] ch=s.toCharArray();
		
		for(int i=0 ,j=n-1; j>=0;j--,i++ )
		{
			int a=(int) Math.pow(2, i);
			int b=(int)ch[j]-48;
			ans= (ans+ a * b);
			
		}
		
		return ans;
		
	}
	
	
	
		public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        String [] s = new String[nums.size()] ;
        int [] count = new int [s.length] ;

        int ans=0;
        for(int i=0; i<s.length ; i++)
        {
            s[i]=toBinary(nums.get(i));
            count[i]=countBitSet(s[i]);

            if(count[i]==k)
            ans+=nums.get(i);
        }

      return ans; 
    }

    public static int countBitSet(String s)
    {
        int c=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='1')
                c++;
        }
        return c;
    }
    
}
