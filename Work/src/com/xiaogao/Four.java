package com.xiaogao;

public class Four {
	
	static int gcd(int a,int b){
		int min=a>b?b:a;
		int max=a>b?a:b;
		if(a==b){//两数想同则最大公约数为本身
			return a;
		}else{//反之则用较大数减去较小数
			return gcd(max-min,min);
		}
	}
	public static void main(String[] args) {
		int result=gcd(65,26);
		System.out.println("最大公约数："+result);
	}

}
