import java.io.*;
import java.util.*;
class CoffeeShop
{ 
    public static void main(String args[]) 
    { 
        int price,discont,;
        int count = 0;
        Scanner in = new Scanner(System.in); 
        String s = in.nextLine(); 
        String[] str = s.split(" ");
        price = str[0];
        discount = str[1];
        price1 = price;
        while(price1!=0){
          discount1 = (price1*discount/100);
          price1= price-discount1;
          count++;
          price = price1;
          
         
       }
        System.out.println(count);
    } 
} 
