package Recursion_Beg_Adv;

public class Q3_Find_1st_Last_occurence_of_element_String {
	public static int first=-1;
    public static int last=-1;
   public static void findaccurence(String str,int indx,char ch) {
	   if(indx==str.length()) {
		   System.out.println(first);
		   System.out.println(last);
		   return;
	   }
	   char currentchar=str.charAt(indx);

	   if(currentchar==ch) {
		   if(first==-1) {
			   first=indx;
		   }else {
			   last=indx;
		   }
	   }
	    
	   findaccurence( str, indx+1,ch) ;
   }
	
	
	
	public static void main(String args[]) {
		String str="mayank";
		findaccurence(str,0,'a');
		
		
	}
	
	
	
	
}
