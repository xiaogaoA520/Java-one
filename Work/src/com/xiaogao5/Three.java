package com.xiaogao5;
//求素数问题3
public class Three {

	public static void main(String[] args) {
		int i,j,count=0;
		for(i=2;i<1000;i++){
			int is_prime=0;
			for(j=2;j<=Math.sqrt(i);j++){//只需要除到根号i
				if(i%j==0){//判断是否是素数，不是就跳出
					is_prime++;
					break;
				}
			}
			if(is_prime==0){	//素数进入
				 System.out.print(i+"\t");
				 count++;
			}
		}
		System.out.print("\n1000以内的素数一共有"+count+"个");
	}

}
