package com.xiaogao;
//շת�����������������ܽϵ�;������𷨣�ѭ�������������
//���շת������͸�����𷨣��ڸ�����𷨵Ļ�����ʹ����λ����
public class Five {
	public static int base=1;
	static int gcd(int a,int b){
		
		if(a==b){//������ͬ�����Լ��Ϊ����
			return a;
		}
		else if(a<b){//
			return gcd(b,a);
		}else{
			if(is_even(a) && is_even(b)){	//ͬż
				base*=2;
				return (gcd(a>>1,b>>1)<<1);
			}else if(is_even(a) && !is_even(b)){	//ż��
				return gcd(a>>1,b);
			}else if(!is_even(a) && is_even(b)){	//��ż
				return gcd(a,b>>1);
			}else{	//˫��
				return gcd(b,a-b);
			}
		}
	}
	//�ж���ż�������ٵ�������,����Ϊfalse,ż��Ϊtrue
	static boolean is_even(int a){
		return a%2==0;
	}
	public static void main(String[] args) {
		int result=gcd(50,88);
		System.out.println("���Լ����"+result);

	}

}
