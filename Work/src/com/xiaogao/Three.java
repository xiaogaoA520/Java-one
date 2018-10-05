package com.xiaogao;
//辗转相除法
public class Three {
	static int gcd(int a,int b){
		int min=a>b?b:a;//取较大数
		int max=a>b?a:b;//取较小数
			if(max%min==0){//两数能整除取的最大公约数
				return min;
			}else{//不能则用大除小后再自调用
				return gcd(min,max%min);
			}
	}
	public static void main(String[] args) {
		int result=gcd(550,700);
		System.out.println("最大公约数："+result);
	}

}
