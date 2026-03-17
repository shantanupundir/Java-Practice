public class smallestDigit {
  public static void main(String[] args) {
    int num =12345;
    int smallest = num%10;
    while(num>0){
      int rem = num%10;
      if(rem<smallest){
        smallest = rem;
      }
      num = num/10;
    }
    System.out.println("Smallest digit in the number is: " + smallest);

  }
}
