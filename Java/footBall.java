import java.util.*;
import java.io.*;
public class footBall{
  public static void main(String[] args) throws IOException {
    int testCase,n;
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    testCase = Integer.parseInt(obj.readLine());
    StringBuilder sb = new StringBuilder();
    for (int j = 0;j<testCase ;j++ ) {
    n = Integer.parseInt(obj.readLine());
    Integer a[] = new Integer[n];
    Integer b[] = new Integer[n];
    String s = obj.readLine();
    String[] token = s.split(" ");
    for (int i = 0;i<n ; i++) {
      a[i] = Integer.parseInt(token[i]);
      a[i] = a[i]*20;
    }
    s = obj.readLine();
    token = s.split(" ");
    for (int i = 0;i<n ; i++) {
      b[i] = Integer.parseInt(token[i]);
      b[i] = b[i]*10;
      a[i] = a[i] - b[i];
      if(a[i] < b[i]){
        a[i] = 0;
      }
    }
    int score = Collections.max(Arrays.asList(a));
    sb.append(score);
    sb.append("\n");
  }
  System.out.println(sb.toString());
  }
}
