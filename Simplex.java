import java.util.*;

public class Simplex{
   public static int highSimplex(int x){
      return x;
   }
   public static int longSimplex(int y){
       return y;
   }
   public static int ArSimplex(int x, int y){
       return x*y;
   }
   public static int CalcSimplex(int x){
       return x/2;
   }

   public static void main(String [] args){
       System.out.println("put your array high");
       Scanner input = new Scanner(System.in);
       int x  = input.nextInt();
       highSimplex(x);
       System.out.println("put your array long");
       Scanner input2 = new Scanner(System.in);
       int y  = input.nextInt();
       longSimplex(y);
       System.out.println("this is your array dimension "  + ArSimplex(x , y) + " , confirm ? 1 = yes | 0 = no " );
       Scanner input3 = new Scanner(System.in);
       int c  = input.nextInt();
       if (c == 1){
           System.out.println("perfect, lets go!");
           int t = 0;
           int h = x; 
           while (t < h){
               int s = 0;
               int l = y;
               while (s < l){
                System.out.println("put your element here");
                Scanner input4 = new Scanner(System.in);
                int p  = input.nextInt();
                CalcSimplex(p);
                  s++;
               }
             t++;
           }
           System.out.println("3cceedcfc12212a1a1e99109313bac60");
           System.out.println("use an MD5 converter for discover the results");
       }else{
         System.out.println("oh, no, lets do this again!");
       }
   
   }
    
}
