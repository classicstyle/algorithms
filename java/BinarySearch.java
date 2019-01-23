import java.util.*;

public class BinarySearch {
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for (int i=0;i<n;i++)
      a[i] = in.nextInt();
    Arrays.sort(a);
    int k = in.nextInt();
    int h=0,l=n-1;
    int mid=-1;
    for (int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    while(h<=l){
      mid = h+(l-h)/2;
      if (a[mid]>k){
          l = mid-1;
      }else if (a[mid]<k){
          h = mid+1;
      }else {
		  break;
		}
    }
      /* for(int i=0; i<n; i++) if (a[i]!=k){
					System.out.print("Not found");
					break;

      } else {break;} */
    System.out.println(mid);

  }
}