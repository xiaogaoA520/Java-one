package com.xiaogao;
//枚举法，耗时高
public class One {
	static int get_max_divisor(int a,int b){
		int c=1;//定义最小公约数
		for(int i=2;i<=a;i++){//遍历每种可能性
			if(a%i==0&&b%i==0)//从小到大公约数替换直到最大公约数
				c=i;
		}
		return c;
		
	}
	public static void main(String[] args){
	int	result=get_max_divisor(36,16);
		System.out.println("最大公约数为："+result);
	}
}
