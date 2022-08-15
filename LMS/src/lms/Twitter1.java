package lms;

import java.util.HashMap;

public class Twitter1 {
	public static int  perfectTeam(String skills){
		HashMap<Character,Integer>hm=new HashMap<>();
		char ch[]=skills.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(hm.containsKey(ch[i]))
				hm.put(ch[i],hm.get(ch[i])+1);
			else
				hm.put(ch[i],1);
			
		}
		
		int count =hm.get('p');
		if(hm.get('c')==count && hm.get('m')==count && hm.get('b')==count && hm.get('z')==count)
			return count;
		else {
			int x=Math.min(count,hm.get('c') );
			x=Math.min(x,hm.get('m') );
			x=Math.min(x,hm.get('b') );
			x=Math.min(x,hm.get('z') );
			return x;
			
		}
		
		
		/*
		 * String pat="pcmbz"; int M = pat.length(); int N = skills.length(); int lps[]
		 * = new int[M]; int j = 0; computeLPSArray(pat,M,lps);
		 * 
		 * int i = 0; int res = 0; int next_i = 0;
		 * 
		 * while (i < N) { if (pat.charAt(j) == skills.charAt(i)) { j++; i++; } if (j ==
		 * M) {
		 * 
		 * j = lps[j-1]; res++;
		 * 
		 * if (lps[j]!=0) i = ++next_i; j = 0; } else if (i < N && pat.charAt(j) !=
		 * skills.charAt(i)) {
		 * 
		 * if (j != 0) j = lps[j-1]; else i = i+1; } } return res;
		 */
    }
	static void computeLPSArray(String pat, int M, int lps[])
    {
       
        int len = 0;
        int i = 1;
        lps[0] = 0; 
 
        while (i < M)
        {
            if (pat.charAt(i) == pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0)
                {
                    len = lps[len-1];
 
                  
                }
                else 
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
	public static long   getIdealNums(long low ,long high){
	    if (low == 1)
	        low++;
	 
	    long count = 0;
	 
	    for (long i = low; i <= high; i++) {
	        long num = i;
	 
	       
	        while (num % 3 == 0)
	            num /= 3;
	 
	       
	        while (num % 5 == 0)
	            num /= 5;
	        if (num == 1)
	            count++;
	    }
	 
	    return count;    
	}
	     
	
	
	public static void main(String[] args) {
		
		System.out.println(perfectTeam("pcmpcmbbbzz"));
	//	System.out.println(getIdealNums(2,20));
		
	}
	

}
