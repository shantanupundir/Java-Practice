import java.util.HashMap;

public class ques5 {
  public static void main(String[] args){
    HashMap<String, Integer> map = new HashMap<>();
    String str = "aaabcccccd";
    //first non repeating character
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(map.containsKey(String.valueOf(ch))){
        map.put(String.valueOf(ch), map.get(String.valueOf(ch))+1);
      }else{
        map.put(String.valueOf(ch), 1);
      }
    }
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(map.get(String.valueOf(ch))==1){
        System.out.println("First non-repeating character: " + ch);
        break;
      }
    }

  }
}
