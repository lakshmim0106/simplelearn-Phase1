package com.dell.stringdemos;

public class StringExample3 {
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("Johnn");
		
		for(int i=0;i<200001 ;i++) {
			sb.append("Smith");
		}
		double timeTaken = System.currentTimeMillis() - startTime;
		System.out.println("Time taken for StringBuffer: "+ timeTaken);

		double startTime1 = System.currentTimeMillis();
		
		StringBuilder sb1 = new StringBuilder("Johnn");
		
		for(int i=0;i<20000 ;i++) {
			sb1.append("Smith");
		}
		double timeTaken1 = System.currentTimeMillis() - startTime1;
		System.out.println("Time taken: "+ timeTaken1);
	}
}
