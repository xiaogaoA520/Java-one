package com.xiaogao2;
//��Ԫ�ټ������
public class Two {

	public static void main(String[] args) {
		System.out.println("����ʽ����");
		for(int i=0;i<34;i++){//100/3<34(ĸ���۸�3Ԫ)
			for(int j=0;j<26;j++){//ͬ��
				int k=100-i-j;//С����=100-ĸ���͹���
				if(3*i+4*j+0.5*k==100&& i+j+k==100){
					System.out.println("ĸ��������Ϊ��"+i+",����������Ϊ��"+j+"��С��������Ϊ��"+k);
				}
			}
		}

	}

}
