package com.xiaogao4;
//水仙花数1
public class One {

	public static void main(String args[])
	{
		int i,j,k; //百位，十位，个位
		System.out.println("水仙花数如下");
		for(i=1;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				for(k=0;k<10;k++)
				{
					if(i*i*i+j*j*j+k*k*k==i*100+j*10+k)
					System.out.println(i*100+j*10+k);
				}	
			}
		}
	}

}
