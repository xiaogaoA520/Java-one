package com.xiaogao3;
//喝汽水问题2
public class Two {

	public static void main(String[] args) {
		int num=1000;
		int drink_num=0;
		int empty_num=0;
		while(num>0){//没有汽水则跳出循环
			drink_num+=num;//喝完所有汽水
			empty_num+=num;//空瓶子=一开始所有汽水和之后喝掉的
			num=(int)empty_num/3;//所有空瓶子换汽水（强转整型）
			empty_num-=num*3; //本次兑换剩余的空瓶子数量
			
		}
		System.out.println("总共能喝"+drink_num+"瓶汽水，最后还剩余"+empty_num+"个空瓶子");

	}

}
