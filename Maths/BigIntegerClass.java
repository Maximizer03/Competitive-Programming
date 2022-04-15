// Big Integer class in Java || Powerful lot of builtin functions
/*
Modular Arithmetic 
GCD Calculation 
Base Conversion 
Power Conversion 
Bitwise Operation 
Prime Calculation 
*/
import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    static void playWithBigInt(){
        
        Scanner sc= new Scanner(System.in);
        
        String s1=sc.next();
        
        BigInteger b1= new BigInteger(s1);
        BigInteger b2= new BigInteger("5");
        
        // b1=b1.add(b2);
        
        b1= b1.multiply(b2);
        System.out.println(b1);
        
        // Bit Counts  - Total set bits
        System.out.println(b1.bitCount());
        
        // total no of bits
        System.out.println(b1.bitLength());
        
        // Integer to BigInteger
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a+b);
        
        BigInteger b3= BigInteger.valueOf(a);
        BigInteger b4= BigInteger.valueOf(b);
        
        // print their GCD
        System.out.println(b3.gcd(b4));
        
        // Base Conversion -> interpret the number in the given base
        BigInteger b5= new BigInteger("10101",2);
        System.out.println(b5);
        
        // power of a number
        System.out.println(b3.pow(30));
    }
    public static void main(String args[]){
        playWithBigInt();
    }
}
