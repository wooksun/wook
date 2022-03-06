package test;

import java.util.Vector;

public class testC {

	public static void main(String[] args) {
		//중수값을 저장하는 벡터를 만들고 1에서 20까지 값을 지정해보자
		//값을 저장하는 과정에서 size(), capacity()를 확인
		Vector<Integer> v = new Vector<Integer>(20);
		
		//벡터 초기 상태 출력
		System.out.println("v의 size:" + v.size());
		System.out.println("v의 capacity:" + v.capacity());
		
		for(int i = 1; i <= 20; ++i) {
			v.add(i); //자동 박싱
			System.out.println("v의 size:" + v.size());
			System.out.println("v의 capacity:" + v.capacity());
			
		}
		
		//v에서 10번째 요소를 꺼내보자
		Integer i = v.elementAt(10);
		System.out.println(i.intValue());
		
		int j = v.elementAt(10);
		System.out.println(j);
	}

}
	