package com.xiaogao;

public class Four {
	
	static int gcd(int a,int b){
		int min=a>b?b:a;
		int max=a>b?a:b;
		if(a==b){//������ͬ�����Լ��Ϊ����
			return a;
		}else{//��֮���ýϴ�����ȥ��С��
			return gcd(max-min,min);
		}
	}
	public static void main(String[] args) {
		int result=gcd(65,26);
		System.out.println("���Լ����"+result);
	}

}
