package com.xiaogao;
//辗转相除法，大数相除性能较低;更相减损法，循环运算次数过多
//结合辗转相除法和更相减损法，在更相减损法的基础上使用移位运算
public class Five {
	public static int base=1;
	static int gcd(int a,int b){
		
		if(a==b){//两数想同则最大公约数为本身
			return a;
		}
		else if(a<b){//
			return gcd(b,a);
		}else{
			if(is_even(a) && is_even(b)){	//同偶
				base*=2;
				return (gcd(a>>1,b>>1)<<1);
			}else if(is_even(a) && !is_even(b)){	//偶奇
				return gcd(a>>1,b);
			}else if(!is_even(a) && is_even(b)){	//奇偶
				return gcd(a,b>>1);
			}else{	//双奇
				return gcd(b,a-b);
			}
		}
	}
	//判断奇偶数，减少迭代次数,奇数为false,偶数为true
	static boolean is_even(int a){
		return a%2==0;
	}
	public static void main(String[] args) {
		int result=gcd(50,88);
		System.out.println("最大公约数："+result);

	}

}
