package com.xiaogao9;
//选择排序
public class One {

	public static void main(String[] args) {
		int[] array={5, 8, 9, 3, 4, 7, 2, 4, 1};
		int i,j,t;
		for(i=0;i<array.length;i++){//从左到右遍历
			for(j=i+1;j<array.length;j++){
				if(array[i]<array[j]){
					t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}
		System.out.println("则从大到小排序如下：");
		for(i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		
	}

}
