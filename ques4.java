public class ques4 {
  public static void main(String[] args) {
    int arr[]={2, 4, 3, 5, 7, 8};
    int n=arr.length;
    int target = 7;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==target){
          System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
        }
      }
    }
  }
}
