package com.xiaogao2;
//百元百鸡问题二
public class Two {

	public static void main(String[] args) {
		System.out.println("购买方式如下");
		for(int i=0;i<34;i++){//100/3<34(母鸡价格3元)
			for(int j=0;j<26;j++){//同上
				int k=100-i-j;//小计数=100-母鸡和公鸡
				if(3*i+4*j+0.5*k==100&& i+j+k==100){
					System.out.println("母鸡的数量为："+i+",公鸡的数量为："+j+"，小鸡的数量为："+k);
				}
			}
		}

	}

}
