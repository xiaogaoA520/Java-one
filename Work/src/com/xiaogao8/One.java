package com.xiaogao8;
//冒泡排序
public class One {

	public static void main(String[] args) {
		int[] array={5, 8, 9, 3, 4, 7, 2, 4, 1};
		int i,j,t;//定义t为暂空，进行搬运数组
		for(j=array.length-1;j>0;j--){//从右到左放置数值
			for(i=0;i<j;i++){
				if(array[i]>array[i+1]){
					t=array[i];
					array[i]=array[i+1];
					array[i+1]=t;
				}
			}
		}
		System.out.println("则从小到大排序如下：");
		for(i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		
	}

}
