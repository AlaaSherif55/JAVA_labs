import java.util.Random;
import java.util.Arrays;
class Lab2_2 {
    public static void main(String args[]) {
  // First create a array of 1000 element of random values
    int array[]=new int[10];
    Random r=new Random();
    for(int i=0;i<10;i++){
     array[i]=r.nextInt(10);
    }
    
    Arrays.sort(array);
    for(int i=0;i<10;i++){
     System.out.println(array[i]);
    }
   long start = System.nanoTime();
   int result=binarySearch(array,Integer.parseInt(args[0]));
   long end = System.nanoTime();
   long total_time = end - start;

   total_time = total_time ;

   if(result!=-1){
   System.out.println("Found in index: "+result+" in array");
   }else{
      System.out.println("Not Found");
   }
   System.out.println("This is total time to get the minumum and maximum(nano seconde) : "+total_time);

  }
  public static int min(int arr[]){
  	int min=arr[0];
  	for(int i=1;i<arr.length;i++){
   		if(min>arr[i]){
      		 min=arr[i];
    		}
  	}
    return min;

  }
  public static int max(int arr[]){
  	int max=arr[0];
  	for(int i=1;i<arr.length;i++){
   		if(max<arr[i]){
      		 max=arr[i];
    		}
  	}
    return max;

  }
  public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
  
  
}
