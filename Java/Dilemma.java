import java.util.*;
import java.io.*;
import java.lang.*;
public class Dilemma{
  public static int matchOne(String s){
    int count = 0;
    for(int j= 0;j< s.length();j++){
      if(s.charAt(j) == '1'){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) throws IOException {
    String s;
    int testCase;
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    testCase = Integer.parseInt(br.readLine());
    for(int i = 0; i< testCase ; i++){
      s = br.readLine();
      int k = matchOne(s);
      if(k % 2 != 0){
        sb.append("WIN\n");
      }
      else{
        sb.append("LOSE\n");
      }
    }
    System.out.println(sb.toString());

  }
}
