package com.xiaogao5;
//����������2
public class Two {

	public static void main(String[] args) {
		int i,j,count=0;
		for(i=2;i<1000;i++){
			int is_prime=0;
			for(j=2;j<=i/2;j++){//ֻ��Ҫ����i��һ��
				if(i%j==0){//�ж��Ƿ������������Ǿ�����
					is_prime++;
					break;
				}
			}
			if(is_prime==0){	//��������
				 System.out.print(i+"\t");
				 count++;
			}
		}
		System.out.print("\n1000���ڵ�����һ����"+count+"��");
	}

}
