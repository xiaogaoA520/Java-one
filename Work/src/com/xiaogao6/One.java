package com.xiaogao6;
//输出数列
//输出1 1 2 3 5 8 13……这样的数列，输出该数列的前20个数字。

public class One {

	public static void main(String[] args) {
		int[] res=new int[20];
		res[0]=1;
		res[1]=1;
		for(int i=0;i<res.length-2;i++){
			res[i+2]=res[i]+res[i+1];//前后两数想加得出之后的数（1，1，1+1=2）
		}
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
		
	}

}
