import java.util.*;
import java.io.*;
public class Zombie{
  public static boolean contain(long[] a, long k){
    for (int i = 0;i<a.length ; i++) {
      if(a[i] == k){
        return true;
      }
    }
    return false;
  }
  public static int containP(long[] a, long k){
    for (int i = 0;i<a.length ; i++) {
      if(a[i] == k){
        return i;
      }
    }
    return 0;
  }
  public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
    int n ;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    for(int i = 0 ; i< testCase ;i++){
      n = Integer.parseInt(br.readLine());
      long[] c = new long[n+1];
      long[] h = new long[n+1];
      long[] res = new long[n+1];
      String s = br.readLine();
      String[] tokens = s.split(" ");
      String s1 = br.readLine();
      String[] tokens1 = s1.split(" ");
      for(int j = 1;j<= n ; j++){
        c[j] = Long.parseLong(tokens[j-1]);
        h[j] = Long.parseLong(tokens1[j-1]);
        res[j] =0;
      }

      for(int a = 1 ; a<=n ; a++){
        for(int b = 1;b<=a;b++ ){
          if(Long.valueOf(a) - c[b] > 0  ){
            res[a - (int) c[b]]++;
          }
          if(Long.valueOf(a) + c[b] <= n  ){
            res[a + (int) c[b]]++;
          }
        }
        res[a]++;
      }
      int flag = 1;
      for(int j = 1;j<= n ; j++){
        if(contain(h,res[j])){
          h[containP(h,res[j])] = 0;
        }
      }
      // for(int j = 1;j<= n ; j++){
      //   System.out.println(h[j]);
      // }
      // System.out.println();
      // for(int j = 1;j<= n ; j++){
      //   System.out.println(res[j]);
      // }
      for(int j = 1;j<= n ; j++){
        if(h[j]!= 0){
          flag = 0;
        }
      }
      if(flag == 0){
        sb.append("NO\n");
      }
      else{
        sb.append("YES\n");
      }
    }
    System.out.println(sb.toString());
  }
}
