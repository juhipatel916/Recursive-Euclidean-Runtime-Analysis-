//Name: Juhi Patel 

public class recEuclid {
	
	public static void main(String arg[])
	{
		System.out.println("n   T(n)    Tn/log2(n)   A(n)       A(n)/log2(n)");
		int i=50;
		while(i<=10000)
		{
			int c=0;
			int tn=0;
			int ctemp;
			float an;
			for(int j=0;j<=i;j++)
			{
				ctemp=recEu(i,j);
				if(ctemp>tn)
					tn=ctemp;
				c=c+ctemp;
			}
			an=(float)c/(i+1);
			float logn = (float) (Math.log(i)/Math.log(2));
			float tnlog = (float) tn/logn;
			float anlog = (float) an/logn;
			System.out.print(i+"   "+tn+"      ");
			System.out.printf("%.7f", tnlog);
			System.out.print("    ");
			System.out.printf("%.7f", an);
			System.out.print("    ");
			System.out.printf("%.7f", anlog);
			System.out.println();
			if(i==100)
				i=950;
			else if(i==1000)
				i=9950;
			else
				i++;
		}
		
	}
	
	public static int recEu(int n,int m)
	{
		int r;
		if(n==m || m==0)
			return 1;
		else
			r = n % m;
		return 1+recEu(m,r);
	}

}
