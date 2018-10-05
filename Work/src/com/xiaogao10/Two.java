package com.xiaogao10;
//寻找孤立数字2
public class Two {

	public static void main(String[] args) {
		int[] array={1, 2, 3, 2, 3, 1, 4, 7, 6, 4, 7};
		int is_single=array[0];
		for(int i=1;i<array.length;i++){
			is_single^=array[i];//(^)代表不相同，for全部遍历等式成立就是独立数
		}
		System.out.println("孤立数字为："+is_single);
	}

}
