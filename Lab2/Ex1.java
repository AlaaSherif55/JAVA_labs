import java.util.Random;
class Lab2_1 {
    public static void main(String args[]) {
  // First create a array of 1000 element of random values
    int array[]=new int[1000];
    Random r=new Random();
    for(int i=0;i<1000;i++){
     array[i]=r.nextInt(1000);
    }
   long start = System.nanoTime();
   int minValue = min(array);
   int maxValue = max(array);
   long end = System.nanoTime();
   long total_time = end - start;

   total_time = total_time ;

   System.out.println("This is the minimum value: "+minValue);
   System.out.println("This is the maximum value: "+maxValue);
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
  
  
}
