package com.xiaogao3;
//����ˮ����1
//����1000ƿ��ˮ��ÿ�����һƿ�õ���һ����ƿ�ӣ�ÿ3����ƿ�����ܻ�1ƿ��ˮ���ȵ��Ժ��ֵõ�һ����ƿ�ӣ����ܹ��ܺȶ���ƿ��ˮ�����ʣ����ٸ���ƿ�ӣ�

public class One {

	public static void main(String[] args) {
		int num=1000;
		int drink_num=0;
		int empty_num=0;
		while(num>0){//û����ˮ������ѭ��
			num--;//ѭ��һ����ˮ��һ
			empty_num++;//��ƿ�Ӽ�һ
			drink_num++;//�ȵ�����ˮ������һ
			if(empty_num==3){//3ƿ�յĻ�һƿ��ˮ(һ��3ƿ�ͻ�)
				num++;
				empty_num=0;//�ڴ����
			}
		}
		System.out.println("�ܹ��ܺ�"+drink_num+"ƿ��ˮ�����ʣ��"+empty_num+"����ƿ��");

	}

}
