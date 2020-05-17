package findNumberInArray;

public class SecondBigNumber {

	public static void findSecond(int array[],int arr_size) 
    { 
        int i, first, second; 
       
        
      
       
        first = second = array[0];
        
        for (i = 0; i < arr_size ; i++) 
        { 
          
            if (array[i] > first) 
            { 
                second = first; 
                first = array[i]; 
            } 
       
            
            else if (array[i] > second && array[i] != first) 
                second = array[i]; 
        } 
        
        System.out.print("The second largest element"+ 
                " is "+ second); 
          
    } 
      
    public static void main(String[] args)  
    { 
            int array[] = {12, 35, 1, 10, 34, 1}; 
            int n = array.length; 
            findSecond(array, n); 
            
    } 

}
