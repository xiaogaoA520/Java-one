package com.xiaogao;
//շת�����
public class Three {
	static int gcd(int a,int b){
		int min=a>b?b:a;//ȡ�ϴ���
		int max=a>b?a:b;//ȡ��С��
			if(max%min==0){//����������ȡ�����Լ��
				return min;
			}else{//�������ô��С�����Ե���
				return gcd(min,max%min);
			}
	}
	public static void main(String[] args) {
		int result=gcd(550,700);
		System.out.println("���Լ����"+result);
	}

}
