package com.xiaogao5;
//����������3
public class Three {

	public static void main(String[] args) {
		int i,j,count=0;
		for(i=2;i<1000;i++){
			int is_prime=0;
			for(j=2;j<=Math.sqrt(i);j++){//ֻ��Ҫ��������i
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
