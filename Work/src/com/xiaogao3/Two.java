package com.xiaogao3;
//����ˮ����2
public class Two {

	public static void main(String[] args) {
		int num=1000;
		int drink_num=0;
		int empty_num=0;
		while(num>0){//û����ˮ������ѭ��
			drink_num+=num;//����������ˮ
			empty_num+=num;//��ƿ��=һ��ʼ������ˮ��֮��ȵ���
			num=(int)empty_num/3;//���п�ƿ�ӻ���ˮ��ǿת���ͣ�
			empty_num-=num*3; //���ζһ�ʣ��Ŀ�ƿ������
			
		}
		System.out.println("�ܹ��ܺ�"+drink_num+"ƿ��ˮ�����ʣ��"+empty_num+"����ƿ��");

	}

}
