package com.Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysToListToArray {
public static void main(String[] args) {
	ArrayList<Integer>  arraylist=new ArrayList<>();
	for(int x=0;x<4;x++){
		arraylist.add(x);
	}
	System.out.println(arraylist);
	
	Object[] oo=arraylist.toArray();
	for(int a=0;a<4;a++){
	System.out.print(oo[a]);
	}
	System.out.println();
	Integer[] poa=new Integer[4];
	poa=arraylist.toArray(poa);
	for(int a=0;a<4;a++){
	System.out.print(poa[a]);
	}
	
	
}
}
