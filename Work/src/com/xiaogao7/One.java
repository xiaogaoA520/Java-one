package com.xiaogao7;
//歌手打分
/*
 * 问题：在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，
 * 然后剩余的8位评委的分数进行平均，就是该选手的最终得分。如果已知每个评委的评分，求该选手的得分。
 */
public class One {

	public static void main(String[] args) {
		int[] score={90,78,90,96,67,86,78,92,79,85};
		for(int i=0;i<score.length-1;i++){//冒牌排序，从左到右，从小到大
			for(int j=0;j<score.length-1-i;j++){
				if(score[j]>score[j+1]){
					int tmp=score[j];
					score[j]=score[j+1];
					score[j+1]=tmp;
				}
			}
		}
		int avg=0;
		for(int i=1;i<score.length-1;i++){//去掉左右两头（最小值和最大值）
			avg+=score[i];
		}
		System.out.println("该选手的得分:"+avg/8);
	}

}
