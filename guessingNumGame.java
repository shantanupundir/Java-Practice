import java.util.Scanner;

public class guessingNumGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = (int)(Math.random()*100) + 1;
    int k=5;
    System.out.println("chose a number between 1 and 100.");
    System.out.println("You have " + k + " chances to guess the number."  );
    for(int i=0; i<k; i++){
      int guess = sc.nextInt();
      if(guess == num){
        System.out.println("Congratulations! You guessed the number.");
        return;
      }else if(guess < num){
        System.out.println("Too low! Try again.");
      }else{
        System.out.println("Too high! Try again.");
      }
    }
    System.out.println("Sorry! You have used all your chances. The number was " + num);
  }
}
