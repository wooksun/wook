package �÷���;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>(3); //3�� ��Ҹ� ���� �� �ֵ��� ���� ���� ����
		Vector<Integer> v2 = new Vector<Integer>(); //�⺻ 10�� ��Ҹ� ���� �� �ֵ��� ���� ����
		
		//���� v1, v2�� �ʱ� ũ��� �뷮 ���
		System.out.printf("�ʱ� ���� v1 ũ��:%d, �ʱ� ���� v1 �뷮:%d\n", v1.size(), v1.capacity());
		System.out.printf("�ʱ� ���� v2 ũ��:%d, �ʱ� ���� v2 �뷮:%d\n", v2.size(), v2.capacity());
		
		//v1�� ¦�� �ֱ�
		for (int i = 0; i < 10; i += 2) {
			v1.add(i);
			System.out.printf("���� v1 ũ��:%d, ���� v1 �뷮:%d\n", v1.size(), v1.capacity());
			//9�� 44��
		}
	}

}
