package com.gautam.chaurasia.hashset;

public class HashSet {

	private int INITIAL_CAPACITY = 16;
	
	private double LOAD_FACTOR = 0.75;

	private Node [] arr;
	
	private int size =0;
	
	public HashSet()
	{
		arr=new Node[INITIAL_CAPACITY];
	}
	
	public int getSize() {
		return size;
	}

	//hashFuction 
	private int getIndex(int value)
	{
		return Math.abs(value%10);
	}
	
	private boolean contain(int key) {
		int index=getIndex(key);
		Node current=arr[index];
		
		while(current!=null)
		{
			if(current.getData()==key)
				return true;
			
			current=current.getNext();
		}
		return false;
	}

	
	public void add(int key) {
		
		if(!contain(key))
		{
			int index =getIndex(key);
			Node newN = new Node(key);
			if(arr[index]==null)
				arr[index]=newN;
			else {
				Node current=arr[index];
				while(current.getNext()!=null)
				{
					current=current.getNext();
				}
				current.setNext(newN);
			}
			size = getSize() + 1;
		}
		 if ((double) size / arr.length > LOAD_FACTOR) {
             resize();
         }
	}

	

	
	private void resize() {
		// TODO Auto-generated method stub
		Node [] oldArr = arr;
		arr = new Node[oldArr.length*2];
		
		size=0;
		
		for (Node node : oldArr) 
		{
			 Node current = node;
			 while(current!=null)
			 {
				 add(current.getData());
				 
				 current=current.getNext();
			 }
				
		}
				
		
	}

	public void remove(int key) {
        int index = getIndex(key);
        Node current = arr[index];
        Node prev = null;
        while (current != null) {
            if (current.getData() == key) {
                if (prev == null) {
                    arr[index] = current.getNext();
                } else {
                    prev.setNext( current.getNext());
                }
                size--;
                return;
            }
            prev = current;
            current = current.getNext();
        }
    }

	public void print() {
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			Node current=arr[i];
			while(current!=null)
			{
				System.out.print(current.getData()+", ");
				current=current.getNext();
			}
			
		}
		System.out.print("]");
		System.out.println();
	}
}
