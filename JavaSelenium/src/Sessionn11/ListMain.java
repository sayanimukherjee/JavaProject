package Sessionn11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(5);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		List<Integer> copyList =  new ArrayList();
		copyList.addAll(alist);
		copyList.add(4);
		System.out.println(copyList);
		System.out.println(alist);
		
		

	}

}
