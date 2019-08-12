import java.util.*;
import java.io.*;
public class ExOr{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int a =0;a< testCase ;a++ ) {
      int count = 0;
      int n = Integer.parseInt(br.readLine());
      int[] z = new int[n];
      String s = br.readLine();
      String[] token = s.split(" ");
      for(int j = 0 ;j<n ; j++){
        z[j] = Integer.parseInt(token[j]);
      }
      for(int i = 0 ; i<n ;i ++){
        for(int j = 0 ;j<n ; j++){
          for(int k = 0 ; k<n ;k++){
            // if( (i+1>=n)|| (j-1)<=0 || (j+1) >= n ){
            //   continue;
            // }
            // else{
            try {
              if( (z[i]^z[i+1]^z[j-1]) == (z[j]^z[j+1]^z[k]) ){
                count ++;
              // }
            }
          }
            catch(Exception e) {}
          }
        }
      }
      sb.append(count);
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
