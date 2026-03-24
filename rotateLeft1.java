public class rotateLeft1 {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int left1 = 1;
    for(int i =0; i<left1;i++){
      int temp = arr[0];
      for(int j=0; j<arr.length-1;j++){
        arr[j] = arr[j+1];
      }
      arr[arr.length-1] = temp;
    }
    for(int i : arr){
      System.out.print(i+ " ");
    }
  }
}
