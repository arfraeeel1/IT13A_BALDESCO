
package Prelim;


public class Act1_Arithmetic_Operators {
     public static void main(String[] org){
             
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3; 
        
        
        
        int baldeco1 = numb1 * numb3 + numb2;
        int depends1 = numb1 - numb3;
        int baldeco2 = depends1 % numb2;
        int depends2 = numb1 + numb3 + numb2;
        int baldeco3 = depends2 / numb4;
        int depends3 = numb3 * numb3;
        int baldeco4 = numb1 * numb2 - depends3;
        
          System.out.println("10 * 4 + 6 ="+ baldeco1);
         System.out.println("(10-4) % 6 = "+ baldeco2);
            System.out.println("(10 + 4 + 6)/3 = "+ baldeco3);
               System.out.println("10 * 6 -(4 * 4 ) = "+ baldeco4);
               
     }
}
