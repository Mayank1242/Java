package Recursion_Beg_Adv;
//input=axbcxxd
//output=abcdxxx
public class Q4_Move_all_x_to_end_of_str {
	public static void Move_X(String str,int indx,int count,String newstring) {
		
		if(indx ==str.length()) {
			for(int i=0;i<count;i++) {
				newstring+='x';
			}
			System.out.println(newstring);
			return;
		}
		char currentchar=str.charAt(indx);
		if(currentchar=='x') {
			count++;
			Move_X(str,indx+1,count,newstring);
		}else {
			newstring+=currentchar;
			Move_X(str,indx+1,count,newstring);
		}
		
		
		
	}
	
	
public static void main(String args[]) {
	String str="axbcxxd";
    char ele='x';
	Move_X(str,0,0,"");
}
}
