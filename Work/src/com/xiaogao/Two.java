package com.xiaogao;
//穷举法，耗时低
public class Two {

	public static void main(String[] args) {
		int a=55,b=10;
		int result=1;//定义最小公约数
		int min=a>b?b:a;//选中两个数中较小的
		for(int i=min;i>=1;i--){//从大到小遍历
			if(a%i==0 && b%i==0){//第一个公约数就是最大的
				result=i;
				break;
			}	
		}
		System.out.println("最大公约数："+result);
	}

}
