// max input value is till 1e4

import java.math.BigInteger;
import java.util.Scanner;


public class Main{

    static BigInteger fact(int n){
        BigInteger fact= new BigInteger("1");
        for(int i=2;i<=n;i++){
            fact= fact.multiply(BigInteger.valueOf(i));
        }
        return fact;

    }
    public static void main(String args[]){
        int n=10000;
        System.out.println(fact(n));
    }
}
