package com.xiaogao10;
//Ѱ�ҹ�������1
//���⣺����һ�����飬�����ڵ���������ͬ��ֻ��һ�����ǹ����ģ������ķ�ʽ�ҳ��������
public class One {
	public static void main(String[] args) {
		int[] array={1, 2, 3, 2, 3, 1, 4, 7, 6, 4, 7};
		int is_single=0;
		for(int i=0;i<array.length;i++){
			int num=1;//�ж��Ƿ���ֵ�Ƿ��ظ���һ��ʼ���ظ�(1�����ظ�)
			for(int j=0;j<array.length;j++){
				if(j!=i && array[i]==array[j]){//i��j��ͬ��Ϊ���������������ٽ��бȽ�
					num=2;
					break;
				}
			}
			if(num==1){
				is_single=array[i];
				System.out.println("��������Ϊ��"+is_single);
				break;
			}
			
		}
	}

}
