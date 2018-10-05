package com.xiaogao3;
//喝汽水问题1
//共有1000瓶汽水，每喝完后一瓶得到的一个空瓶子，每3个空瓶子又能换1瓶汽水，喝掉以后又得到一个空瓶子，问总共能喝多少瓶汽水，最后还剩余多少个空瓶子？

public class One {

	public static void main(String[] args) {
		int num=1000;
		int drink_num=0;
		int empty_num=0;
		while(num>0){//没有汽水则跳出循环
			num--;//循环一次汽水减一
			empty_num++;//空瓶子加一
			drink_num++;//喝掉的汽水数量加一
			if(empty_num==3){//3瓶空的换一瓶汽水(一有3瓶就换)
				num++;
				empty_num=0;//内存清空
			}
		}
		System.out.println("总共能喝"+drink_num+"瓶汽水，最后还剩余"+empty_num+"个空瓶子");

	}

}
