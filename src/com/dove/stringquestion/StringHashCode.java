/**
 * 
 */
package com.dove.stringquestion;


/**
 * @author dove.zhang
 *
 */
public class StringHashCode {
	
	
	public static void main(String[] args) {
		String userId = "683514079";
	    System.out.println(Integer.MAX_VALUE);
		System.out.println(userId.hashCode());
		
		int userIdHash = userId.hashCode();
        int percent = 1000;
        percent = (percent < 0 || percent > 1000) ? 1000 : percent;
        if (userIdHash % 1000 > percent) {
           System.out.println(Boolean.FALSE);
        }else{
           System.out.println(Boolean.TRUE);
        }
        
        System.out.println(((-12356)%1000));
	}

	
}
