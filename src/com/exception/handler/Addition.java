package com.exception.handler;

public class Addition {
	
	public double add(double...n){
		int count=n.length;
		double sum=0;
		
		if (count<=0) {
			return 0;
		}
		else
		{
			for(int i=0;i<count;i++){
				sum=sum+n[i];
			}
			return sum;
		}
		
		
		
	}
}
