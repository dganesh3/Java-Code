package com.test;
import java.util.*;
public class Alphsbet_or_not 
{
	     public static boolean alphabet(char q)
	     {
	    	 if(q>='a'&& q<='z' || q>='A' && q<='Z')
	    	 {
	    		 System.out.println("It's an alphabet="+q);
	    		 return true;
	    	 }
	    	 else
	    	 {
	    	     System.out.println("It's not alphabet="+q);
	    		 return false;
	    		 
	    	 }
	    	 
	     }
	     public static void main(String[] args) {
	    //	 for(int i=0;i<=10;i++)
	    	 while(true)
	    	 { 
			Scanner sc=new  Scanner(System.in);
			System.out.println("enter character");
			char a=sc.nextLine().charAt(0);
			System.out.println(alphabet(a));
			sc.close();
	         } 
		}
	}

