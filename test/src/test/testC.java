package test;

import java.util.Vector;

public class testC {

	public static void main(String[] args) {
		//�߼����� �����ϴ� ���͸� ����� 1���� 20���� ���� �����غ���
		//���� �����ϴ� �������� size(), capacity()�� Ȯ��
		Vector<Integer> v = new Vector<Integer>(20);
		
		//���� �ʱ� ���� ���
		System.out.println("v�� size:" + v.size());
		System.out.println("v�� capacity:" + v.capacity());
		
		for(int i = 1; i <= 20; ++i) {
			v.add(i); //�ڵ� �ڽ�
			System.out.println("v�� size:" + v.size());
			System.out.println("v�� capacity:" + v.capacity());
			
		}
		
		//v���� 10��° ��Ҹ� ��������
		Integer i = v.elementAt(10);
		System.out.println(i.intValue());
		
		int j = v.elementAt(10);
		System.out.println(j);
	}

}
	