public class largestDigit {
  public static void main(String[] args) {
    int num =12345;
    int largest = 0;
    while(num>0){
      int rem = num%10;
      if(rem>largest){
        largest = rem;
      }
      num = num/10;
    }
    System.out.println("Largest digit in the number is: " + largest);

  }
}
