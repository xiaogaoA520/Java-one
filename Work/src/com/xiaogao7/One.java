package com.xiaogao7;
//���ִ��
/*
 * ���⣺�ڸ質�����У�����10λ��ί���д�֣��ڼ�����ֵ÷�ʱ��ȥ��һ����߷֣�ȥ��һ����ͷ֣�
 * Ȼ��ʣ���8λ��ί�ķ�������ƽ�������Ǹ�ѡ�ֵ����յ÷֡������֪ÿ����ί�����֣����ѡ�ֵĵ÷֡�
 */
public class One {

	public static void main(String[] args) {
		int[] score={90,78,90,96,67,86,78,92,79,85};
		for(int i=0;i<score.length-1;i++){//ð�����򣬴����ң���С����
			for(int j=0;j<score.length-1-i;j++){
				if(score[j]>score[j+1]){
					int tmp=score[j];
					score[j]=score[j+1];
					score[j+1]=tmp;
				}
			}
		}
		int avg=0;
		for(int i=1;i<score.length-1;i++){//ȥ��������ͷ����Сֵ�����ֵ��
			avg+=score[i];
		}
		System.out.println("��ѡ�ֵĵ÷�:"+avg/8);
	}

}
