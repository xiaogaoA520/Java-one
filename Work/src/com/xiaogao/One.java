package com.xiaogao;
//ö�ٷ�����ʱ��
public class One {
	static int get_max_divisor(int a,int b){
		int c=1;//������С��Լ��
		for(int i=2;i<=a;i++){//����ÿ�ֿ�����
			if(a%i==0&&b%i==0)//��С����Լ���滻ֱ�����Լ��
				c=i;
		}
		return c;
		
	}
	public static void main(String[] args){
	int	result=get_max_divisor(36,16);
		System.out.println("���Լ��Ϊ��"+result);
	}
}
