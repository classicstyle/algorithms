import java.util.*;

public class AlgoritmYablonskogo {

	static Vector<String> p = new Vector<String>();

	static boolean contains(String s1, String s2){
	  if (s1.length()>s2.length()){
	    int c = 0;
	    for (int i=0;i<s1.length();i++){
	      for(int j=0;j<s2.length();j++){
	        if (s1.charAt(i)==s2.charAt(j)){
	          c++;
	        }
	      }
	    }
	    if (c==s2.length()) return true;
	    else return false;
	  }
	  else {
	    int c = 0;
	    for (int i=0;i<s2.length();i++){
	      for(int j=0;j<s1.length();j++){
	        if (s1.charAt(i)==s2.charAt(j)){
	          c++;
	        }
	      }
	    }
	    if (c==s1.length()) return true;
	    else return false;
	  }
	}

	static void rec(int len,String str){
	  if (str.length()==len){
	    boolean k = false;
	    for (int i=0;i<p.size();i++){
	      if (contains(str,p.elementAt(i))){
	        k = true;
	        break;
	      }
	    }
	    if(!k){
	      //System.out.println("ne pravilnye: ");
	      System.out.println(str);
	    }
	  }else if (str.length()>len) return;
	  else{
	    int l = str.charAt(str.length()-1)-'0';
	    for (int i=l+1;i<m;i++){
	      rec(len,str+""+i);
	    }
	  }
	}
	static int m;
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		m = in.nextInt();
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++){
		  for (int j=0;j<m;j++){
		    a[i][j] = in.nextInt();
		  }
		}
		for (int i=0;i<n;i++){
		  for(int j=i+1;j<n;j++){
		    String l = "";
		    for (int k=0;k<m;k++){
		      if (a[i][k]==a[j][k]){
		        l+=k;
		      }
		    }
		    if (l!=""){
		      p.add(l);
		    }
		  }
		}
		for (int i=0;i<p.size();i++){
		  System.out.println(p.elementAt(i));
		}
		System.out.println();
		System.out.println("Pravilnye: ");
		for (int i=0;i<p.size();i++){
		  for(int j=i+1;j<p.size();j++){
		    if(contains(p.elementAt(i),p.elementAt(j))){
		      if(p.elementAt(i).length()>p.elementAt(j).length()){
		        p.remove(j);
		      }else p.remove(i);
		    }
		  }
		}
		int max = 0;
		for (int i=0;i<p.size();i++){
		  if (max<p.elementAt(i).length()) max = p.elementAt(i).length();
		}
		for (int i=2;i<=max;i++){
		  for(int j=0;j<m;j++){
		    String s = ""+j;
		    rec(i,s);
		  }
		}
	}
}