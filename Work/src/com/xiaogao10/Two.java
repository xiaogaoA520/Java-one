package com.xiaogao10;
//Ѱ�ҹ�������2
public class Two {

	public static void main(String[] args) {
		int[] array={1, 2, 3, 2, 3, 1, 4, 7, 6, 4, 7};
		int is_single=array[0];
		for(int i=1;i<array.length;i++){
			is_single^=array[i];//(^)������ͬ��forȫ��������ʽ�������Ƕ�����
		}
		System.out.println("��������Ϊ��"+is_single);
	}

}
