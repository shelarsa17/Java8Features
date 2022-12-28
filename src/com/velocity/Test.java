package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(7);
		list.add(11);
		
		List<Integer> list2=list.stream().filter(i->i<=10).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
