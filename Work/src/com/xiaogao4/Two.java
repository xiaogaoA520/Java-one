package com.xiaogao4;
//水仙花数2
public class Two {

	public static void main(String[] args) {
		int a,b,c;//个位，十位，百位
		for(int i=100;i<1000;i++){
			a=i%10;
			b=(int)(i/10)%10;
			c=(int)i/100;
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.println("水仙花数为："+i);
			}
		}
		
	}

}
