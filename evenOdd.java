class check{
  public boolean evenOrNot(int a){
    if(a%2==0){
      return true;
    }
    else{
      return false;
    }
  }
}
public class evenOdd {
  public static void main(String[] args) {
    check obj = new check();
    System.out.println(obj.evenOrNot(13));
  }
  
}
