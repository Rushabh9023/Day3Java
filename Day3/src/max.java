public class max {  
    public static void main(String[] args) {  
  
        int [] arr =  {34, 5, 52, 20, 90};  
         
        int max = arr[0];  
       
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest number in the given array is: " + max);  
    }  
}  