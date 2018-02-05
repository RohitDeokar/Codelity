//Prob1_Solution
public class OneSwapSortArray {
	public boolean oneSwap(int N[])
	{
		int i,j,count=0,temp=0;
		int newarr[]= new int[N.length];
		for(i=0;i<N.length;i++)
		{
			newarr[i]=N[i];
		}
		for(i=0;i<newarr.length;i++)
		{
			for(j=1;j<newarr.length;j++)
			{
				if(newarr[i]>=newarr[j])
				{
					temp=newarr[i];
					newarr[i]=newarr[j];
					newarr[j]=temp;
				}
			}
		}
		for(i=0;i<N.length;i++)
		{
			if(N[i]!=newarr[i])
			{
				count++;
			}
		}
		if(count>2)
			return true;
		else
		return false;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N[]={1,5,3,2,1};
		OneSwapSortArray s=new OneSwapSortArray();
		System.out.print(s.oneSwap(N));
	}

}
