package dsa;

public class Linkedlist {
	node head;
	private int size=0;
	
	Linkedlist(){
		size=0;
	}

class node{
	 	String data;
		node next;
		
		  node(String data){
			this.data=data;
			this.next=null;
			size++;
		  }
}


public void addfirst(String data) {
    	node newnode=new node(data);
    	
    	if(head==null) {
    		head=newnode;
    		return;
    	}
    	newnode.next=head;
    	head=newnode;
}


public void printlist() {
	node currentnode =head;
	
	while(currentnode!=null) {
		System.out.print(currentnode.data+ "->");
		currentnode=currentnode.next;
		
	}
}
	
	
	public static void main(String args[]) {
	   Linkedlist list=new Linkedlist();
	   list.addfirst("mayank");
	   list.addfirst("mishra");
	   list.printlist();
	
	
	
	
	}
}
