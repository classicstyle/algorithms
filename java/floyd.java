import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class floyd {


	public static void main(String[] args)throws Exception
	{
		int n, i, j, k ;
		int MAXINT=100000000;
		Scanner in = new Scanner(new File("input2.txt"));
		PrintWriter out = new PrintWriter(new File("output2.txt"));
	    n=in.nextInt();
	    int p=in.nextInt();
		int a[][]=new int[n+1][n+1];

		for(i=1; i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
		a[i][j]=in.nextInt();
		if(a[i][j]== -1) a[i][j]=MAXINT;
			}
		}
		for (k = 0; k < n; k++) {

			for (i = 1; i <= n; ++i)
				for (j = 1; j <= n; ++j)
					/* Esli i & j raznye uzly &
						esli mejdu i<->k & k<->j
						suwestvuet sv9z`, to alg  */
					if ((a[i][k] * a[k][j] != 0) && (i != j))

						if ((a[i][k] + a[k][j] < a[i][j]) ||
							(a[i][j] == 0) && (a[i][p]== a[p][j]))
							a[i][j] = a[i][k] + a[k][j];
		}
		for(i=1; i<=n;i++)
		{
			for(j=1;j<=n;j++)	if(a[i][p]== a[p][j])
			{
		out.print(p+":");
		out.println(a[p][j]);
			}
			//out.print("\n");
			break;
		}
		out.close();

	}

}
