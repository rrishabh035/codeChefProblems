import java.util.*;
import java.io.*;
public class AppleHire{
  public static boolean retBool(long n , long k){
    if((n/k)%k < k && (n/k)%k != 0 ){
      return false;
    }
    else{
      return true;
    }
  }
  public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(obj.readLine());
    for (int i = 0;i<testCase ;i++ ) {
      String s = obj.readLine();
      String[] token = s.split(" ");
      long n = Long.parseLong(token[0]);
      long k = Long.parseLong(token[1]);
      if(k == 1){
        sb.append("NO\n");
      }
      else if(retBool(n,k)){
        sb.append("NO\n");
      }
      else{
        sb.append("YES\n");
      }
    }
    System.out.println(sb.toString());
  }
}
