package com.xiaogao10;
//寻找孤立数字1
//问题：给定一个数组，数组内的数两两相同，只有一个数是孤立的，用最快的方式找出这个数。
public class One {
	public static void main(String[] args) {
		int[] array={1, 2, 3, 2, 3, 1, 4, 7, 6, 4, 7};
		int is_single=0;
		for(int i=0;i<array.length;i++){
			int num=1;//判断是否数值是否重复，一开始不重复(1代表不重复)
			for(int j=0;j<array.length;j++){
				if(j!=i && array[i]==array[j]){//i和j不同则为两个数，两个数再进行比较
					num=2;
					break;
				}
			}
			if(num==1){
				is_single=array[i];
				System.out.println("孤立数字为："+is_single);
				break;
			}
			
		}
	}

}
