package hw;
import java.util.*;

public class HelloWorld {
  
  
  public static List<String> getFizzBuzzList(int n){
    
     // int n = 17;
        
        //for(int i = 1; i<n; i++){
            //if (i%15 == 0){
                //System.out.println("FizzBuzz");
            //}
           // else if(i%5 == 0){
                //System.out.println("Buzz");
            //}
            //else if(i%3 == 0){
                //System.out.println("Fizz");
           // }
            //else{
               // System.out.println(String.valueOf(int(i));
           // }
       
   //Object[] array;
    //array = new Object[n];
    
    //for(int i = 1; i <= array.length; i++){
      //if (i%15 == 0){
        //array[i-1] = "FizzBuzz";
      //}
      //else if(i%5 == 0){
        //array[i-1] = "Buzz";
      //}
      //else if(i%3 == 0){
        //array[i-1] = "Fizz";
      //}
      //else{
        //array[i-1] = i;
      //}
    //}
    //return array;
    
    //Object[] array;
    //array = new Object[n];
    
    //for(int i = 1; i <= array.length; i++){
      //if (i%15 == 0){
        //array[i-1] = "FizzBuzz";
      //}
      //else if(i%5 == 0){
        //array[i-1] = "Buzz";
      //}
      //else if(i%3 == 0){
        //array[i-1] = "Fizz";
      //}
      //else{
        //array[i-1] = i;
      //}
    //}
    //return array;
  
    List<String> list = new arrayList<String>(n);
    
    for(int i = 1; i <= list.length; i++){
      if (i%15 == 0){
        list[i-1] = "FizzBuzz";
      }
      else if(i%5 == 0){
        list[i-1] = "Buzz";
      }
      else if(i%3 == 0){
        list[i-1] = "Fizz";
      }
      else{
        list[i-1] = i;
      }
    }
    return list;
    
    
  }
}

  //public String getMessage() {
    //return "hello world";
  //}

  //public int getYear() {
    //return 2008;
  //}
//}
