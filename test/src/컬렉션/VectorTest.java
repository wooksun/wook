package 컬렉션;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>(3); //3개 요소를 담을 수 있도록 벡터 공간 생성
		Vector<Integer> v2 = new Vector<Integer>(); //기본 10개 요소를 담을 수 있도록 공간 생성
		
		//벡터 v1, v2의 초기 크기와 용량 출력
		System.out.printf("초기 벡터 v1 크기:%d, 초기 벡터 v1 용량:%d\n", v1.size(), v1.capacity());
		System.out.printf("초기 벡터 v2 크기:%d, 초기 벡터 v2 용량:%d\n", v2.size(), v2.capacity());
		
		//v1에 짝수 넣기
		for (int i = 0; i < 10; i += 2) {
			v1.add(i);
			System.out.printf("벡터 v1 크기:%d, 벡터 v1 용량:%d\n", v1.size(), v1.capacity());
			//9분 44초
		}
	}

}
