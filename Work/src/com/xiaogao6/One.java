package com.xiaogao6;
//�������
//���1 1 2 3 5 8 13�������������У���������е�ǰ20�����֡�

public class One {

	public static void main(String[] args) {
		int[] res=new int[20];
		res[0]=1;
		res[1]=1;
		for(int i=0;i<res.length-2;i++){
			res[i+2]=res[i]+res[i+1];//ǰ��������ӵó�֮�������1��1��1+1=2��
		}
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
		
	}

}
