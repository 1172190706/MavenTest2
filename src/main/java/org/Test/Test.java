package org.Test;

public class Test {

	@org.junit.Test
	public void name() {
	  System.out.println("123");
	    int i =Integer.MAX_VALUE;
	  int j=i+1;
	  System.out.println(i);
	  System.out.println(j);
	}
	
	@org.junit.Test
	public void name1() {
	  StringBuffer sb = new StringBuffer("hello TRS");
	          sb.reverse();
	  System.out.println("sb:"+sb.toString());
	  
	  
	  String a = "hello TRS";
	     String b= "";
	     char[] cs = a.toCharArray();
	          for (int m=cs.length-1;m>=0;m--) {
				b=b+cs[m];
			}
	          System.out.println("b:"+b);
	}
	
	@org.junit.Test
	public void name2() {
		int x = 5;
	     int i = x+=1;
	 System.out.println(i);
	}
	
}
