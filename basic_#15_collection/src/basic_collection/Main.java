package basic_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	//@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String> ();
		
		list.add("홍길자자");
		list.add("홍길동");
		list.add("가나다라 마바사");
		
		String str = list.get(0);
		System.out.println("str result: " + str);
		
		list.remove(0);
		list.remove("홍길동");
		
		for(String str2 : list){
			System.out.println("str2 result: " + str2);
		}
		
		
		List<String> arrayList = new ArrayList<String> ();
		List<String> linkedList = new LinkedList<String> ();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++){
			arrayList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList time: " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++){
			linkedList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList time: " + (endTime - startTime) + " ns");
	}

}
