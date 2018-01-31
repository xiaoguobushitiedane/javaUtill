package com.utill.sort;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	/**
	 * 字符串排序
	 */
	public static void bubbleSort() {
	    int[] array = {6, 2, 5, 3};
	    List <String>list=new ArrayList <String>();
	    list.add("6");
	    list.add("2");
	    list.add("5");
	    list.add("3");
	    System.out.println(list);
	    
	    for (int i = 0; i < list.size() - 1; i++) {// 需要排序的趟数
	      boolean flag = false;// 默认不存在位置交换
	      for (int j = 0; j < list.size() - i - 1; j++) {// 每一趟需要比较的次数
	        if (Integer.parseInt(list.get(j+1)) < Integer.parseInt(list.get(j))) {
	          flag = true;// 存在位置交换，修改flag为true
	          int variable = Integer.parseInt(list.get(j+1));
	          list.set(j+1, list.get(j));
	          list.set(j, String.valueOf(variable));
	        }
	      }
	      if (!flag) {
	        break;// 不存在位置交换 跳出循环
	      }
	    }
	    System.out.println(list);
	  }
	/**
	 * 集合对象
	 */
	public static void objList(){
		List<NumBer> nbs=new ArrayList<NumBer>();
		nbs.add(new NumBer("a", 6));
		nbs.add(new NumBer("c", 2));
		nbs.add(new NumBer("f", 5));
		nbs.add(new NumBer("e", 3));
		nbs.add(new NumBer("d", 1));
		
		 for (int i = 0; i < nbs.size() - 1; i++) {// 需要排序的趟数
		      boolean flag = false;// 默认不存在位置交换
		      for (int j = 0; j < nbs.size() - i - 1; j++) {// 每一趟需要比较的次数
		        if (nbs.get(j+1).getRank() > nbs.get(j).getRank()) {//"<":递增;">":递减
		          flag = true;// 存在位置交换，修改flag为true
		          NumBer variable = nbs.get(j+1);
		          nbs.set(j+1, nbs.get(j));
		          nbs.set(j, variable);
		        }
		      }
		      if (!flag) {
		        break;// 不存在位置交换 跳出循环
		      }
		    }
		 System.out.println(nbs);
	}
	
	
	public static void main(String[] args) {
		//bubbleSort();
		objList();
	}
}
