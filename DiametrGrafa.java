import java.util.*;
import java.io.*;


    public class DiametrGrafa
    {
        public static void main(String[] args) throws Exception
        {
            //System.out.println("Vvedite koli4estvo verwin: ");
            Scanner sc = new Scanner(new File("DiametrIn.txt"));
            PrintWriter out = new PrintWriter(new File("DiametrOut.txt"));
            int n = sc.nextInt();


            int a[][]= new int[n+1][n+1];
            for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++){
					a[i][j] = sc.nextInt();
				}
			}

            //System.out.println();
			int i, j;
            int[] row = new int[n+1];
            int[] col = new int[n+1];

            for (i = 1; i <=n; i++)
            {
                //System.out.println(i + 1 + "\t");
            }
            	//System.out.println();
            for (i = 1; i <=n; i++)
            {
                for (j = 1; j <=n; j++)
                {
                    //System.out.println(a[i][j] + "\t");
                }
                //out.println(i);
            }
            //System.out.println();

            int s = 0;

            for (i = 1; i <=n; i++)
            {
                row[s] = 0;
                col[i] = 0;
                row[i] = 0;
            }

            for (j = 1; j <=n; j++)
            {
                for (i = 1; i <=n; i++)
                {
                    a[s][s] = 0;
                    //System.out.println(a[i][j] + " + ");
                    //System.out.println(Answers2[i] + " < ");
                    //System.out.println(Answers[i] + " ? ");
                    //System.out.println();
                    if (a[i][j] + col[j] > row[i])
                    {
                        row[i] = a[i][j] + col[j];
                        //System.out.println("Да, меньше, в ответы записываем {0}" + Answers[i]);
                        //System.out.println("B в ответы-2 в {0}-ю клетку записываем {1}" + (i + 1) + Answers2[i]);

                    }

                }
            }
            int max = 0;
            //out.println();
            for (i = 1; i <=n; i++)
            {
                if (row[i]>max) max = row[i];
            }

            out.println("Diametr grafa:" + max);

        out.close();
		}
    }

