package com.xiaogao4;
//ˮ�ɻ���2
public class Two {

	public static void main(String[] args) {
		int a,b,c;//��λ��ʮλ����λ
		for(int i=100;i<1000;i++){
			a=i%10;
			b=(int)(i/10)%10;
			c=(int)i/100;
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.println("ˮ�ɻ���Ϊ��"+i);
			}
		}
		
	}

}
