public class armstrongTillN {
  public static void main(String[] args) {
    int n = 1000;
    
    for (int i = 0; i < n; i++){
      String num = Integer.toString(i);
      int len = num.length();
      int result = 0;
      for (char c:num.toCharArray()){
        result += (int)Math.pow(c - '0', len);
      }
      if (result == i){
        System.out.println(i + " is an armstrong number");
      }
    }
  }
}
