package com.xiaogao;
//��ٷ�����ʱ��
public class Two {

	public static void main(String[] args) {
		int a=55,b=10;
		int result=1;//������С��Լ��
		int min=a>b?b:a;//ѡ���������н�С��
		for(int i=min;i>=1;i--){//�Ӵ�С����
			if(a%i==0 && b%i==0){//��һ����Լ����������
				result=i;
				break;
			}	
		}
		System.out.println("���Լ����"+result);
	}

}
