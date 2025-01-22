package com.gautam.chaurasia.leetcode.linkedkist;

public class ListNode {
	static int c=0;
	int val;
	ListNode next;
	
	int carry=0;
    
    static ListNode n ;
    static ListNode t=n ;
    
	ListNode() {
	}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        sum(l1,l2);
        return t;
    }

    public void sum(ListNode l1, ListNode l2) 
    {
        if(l1 == null && l2==null)
          return;

        else
        {	
        	
        	int sum= (l1!=null ? l1.val : 0)+(l2!=null ? l2.val : 0)+carry;
            carry=sum/10;
            
            if(t==null)
            {
                n=new ListNode(sum%10);
                t=n;
            }
            else
            {
                n.next=new ListNode(sum%10);
                n=n.next;
            }
            
        	if(l1!=null  && l2 != null )
                sum(l1.next ,l2.next);

            else if(l1==null && l2!=null)
                     sum(null ,l2.next);
            else
                 sum(l1.next ,null);
                
            
            

        }
    }

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	 public static  int pairSum(ListNode head) {
	        
	        ListNode temp = head;
	        ListNode rev=rev(head);
	        int i=1;
	        int max=0;
	        while(i<=c/2)
	        {
	            max=Math.max(max, (temp.val+rev.val));
	            temp=temp.next;
	            rev=rev.next;
	            i++;
	        }
	        return max;
	    }

	 public static  ListNode rev(ListNode head) {
		 ListNode reversedHead = null;

	        while (head != null) {
	            ListNode newNode = new ListNode(head.val);
	            
	            newNode.next = reversedHead;
	            
	            reversedHead = newNode;

	            head = head.next;
	            c++;
	        }

	        // Return the reversed list head
	        return reversedHead;
	    }
	    
	 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

	        if(list1!=null && list2!=null){
	        if(list1.val<list2.val){
	            list1.next=mergeTwoLists(list1.next,list2);
	            return list1;
	            }
	            else{
	                list2.next=mergeTwoLists(list1,list2.next);
	                return list2;
	        }
	        }
	        if(list1==null)
	            return list2;
	        return list1;
	    }
}
