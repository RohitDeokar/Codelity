//finding the deep depth of the Pit triplet(P,Q,R) 
public class Triplet {
	public int findMaxDepthPit(int A[])
	{
		int P=0,Q=0,R=0,i,j,k,maxdepth=-1,depth;
		k=0;
		for(i=0;i<A.length-2;i++)
		{
			j=i+1;
			if(A[i]>A[i+1])
			{
				P=A[i];
				System.out.println("P="+P+" at index="+i);
			
			    j=j+1;
		    	while(j+1<A.length && (A[j]>A[j+1]))
			    {
			    j++;
			    }
			    Q=A[j];
		    	System.out.println("Q="+Q+" at index "+j);
			    k=j+1;
			    while(k+1<A.length&& (A[k]<A[k+1]))
			    {
			        k++;
			    }
		    	if(k>=A.length)
			    {
			     break;
		    	}
				R=A[k];
			    System.out.println("R="+R+" at a Index "+k);
			    depth=Math.min(P-Q,R-Q);
			    System.out.println("depth ="+depth);
			    if(depth>maxdepth)
			    {
				    maxdepth=depth;
			    }

	    	}//endif
		}//end for
		
		return(maxdepth);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={0,1,3,-2,0,1,0,-3,2,3};
		Triplet t=new Triplet();
		System.out.println("Max Depth="+(t.findMaxDepthPit(A)));

	}

}
