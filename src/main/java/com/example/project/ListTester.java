package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
      
     if ( list.empty() || n < 1) return;
    	 for (int i = 0; i < n; i++) {
    		   list.findFirst();
    		   T copy = list.retrieve();
    		   while(!list.last()) {
    		   list.findNext();
    		   }
    	        list.insert(copy);
    		 	list.findFirst();
    	        list.remove();
    	      
    	    }
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
    	if (l1.empty()) return;
    	       l1.findFirst();

    	while(!l1.last()) {
    		l1.findNext();
    	}
    	l2.insert(l1.retrieve());
    	while(!l1.first()) {
    		l1.findPrevious();
    		l2.insert(l1.retrieve());
    	}
    	
    }
}
