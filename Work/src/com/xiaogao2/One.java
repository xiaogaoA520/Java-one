package com.xiaogao2;
//��Ԫ�ټ�����һ
public class One {
//ÿֻĸ��3Ԫ��ÿֻ����4Ԫ��ÿֻС��0.5Ԫ�������100ԪǮ��100ֻ��
	public static void main(String[] args) {
		System.out.println("����ʽ����");
		for(int i=0;i<100;i++){//����ĸ���������������ֵΪ100ֻ
			for(int j=0;j<100;j++){//ͬ��
				for(int k=0;k<100;k++){//ͬ��
					if(3*i+4*j+0.5*k==100&& i+j+k==100){
						System.out.println("ĸ��������Ϊ��"+i+",����������Ϊ��"+j+"��С��������Ϊ��"+k);
					}
				}
			}
		}

	}

}
