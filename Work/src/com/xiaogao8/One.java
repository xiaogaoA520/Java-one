package com.xiaogao8;
//ð������
public class One {

	public static void main(String[] args) {
		int[] array={5, 8, 9, 3, 4, 7, 2, 4, 1};
		int i,j,t;//����tΪ�ݿգ����а�������
		for(j=array.length-1;j>0;j--){//���ҵ��������ֵ
			for(i=0;i<j;i++){
				if(array[i]>array[i+1]){
					t=array[i];
					array[i]=array[i+1];
					array[i+1]=t;
				}
			}
		}
		System.out.println("���С�����������£�");
		for(i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		
	}

}
