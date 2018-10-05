package com.xiaogao2;
//百元百鸡问题一
public class One {
//每只母鸡3元，每只公鸡4元，每只小鸡0.5元，如果花100元钱买100只鸡
	public static void main(String[] args) {
		System.out.println("购买方式如下");
		for(int i=0;i<100;i++){//定义母鸡数的数量，最大值为100只
			for(int j=0;j<100;j++){//同上
				for(int k=0;k<100;k++){//同上
					if(3*i+4*j+0.5*k==100&& i+j+k==100){
						System.out.println("母鸡的数量为："+i+",公鸡的数量为："+j+"，小鸡的数量为："+k);
					}
				}
			}
		}

	}

}
