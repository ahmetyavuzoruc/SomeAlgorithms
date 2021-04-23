package com.Interview.mix.Algoritma.findNumberInArray;

public class SecondBigNumber {

	public static void findSecondValue(int array[])
    { 
        int first, second;
        first = second = array[0];

        for (int i = 0; i < array.length ; i++)
        { 
          
            if (array[i] > first) 
            { 
                second = first;
                first = array[i]; 
            }
            else {
                second = array[i];
            }

        } 
        
        System.out.print("The second largest element"+ 
                " is "+ second); 
          
    } 
      
    public static void main(String[] args)  
    { 
            int array[] = {12, 67, 1, 55, 34, 1,2,3,4,5,566,67,78,8,12222};
            findSecondValue(array);
            
    } 

}
