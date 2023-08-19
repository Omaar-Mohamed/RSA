/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

/**
 *
 * @author Lenovo
 */
public class Rsa {

    public static double GCD (double fsnum, double secnum){
        double a,b = 0,r,q;
        
        if(fsnum>secnum){
                a=fsnum;
                b=secnum;
                }else{
                b=fsnum;
                a=secnum;
            
                }
        
        if (b==0){
            return a;
        }else{
        return GCD(b,a%b);
        }  
    }
    public static double MI(double fsnum,double secnum){
        
            double a,b,r = 0,t1=0,t2=1,t0,t = 0;
            double q;
                if(fsnum>secnum){
                a=fsnum;
                b=secnum;
                }else{
                b=fsnum;
                a=secnum;
                }
              
                
                
                while(r!=1){
               q=(int) (a/b);
               r= a%b;
               t=t1-t2*q;
//               System.out.println(t1);

                   a=b;
                   b=r;
                   t1=t2;
                   t2=t;
               }
            
    return t2;
    }
    
//    public static int modInverse(int A, int M)
//    {
//        for (int X = 1; X < M; X++)
//            if (((A % M) * (X % M)) % M == 1)
//                return X;
//        return 1;
//    }

    public static int totian(double n){
        double x;
        int counter=0;
        for (double i=n-1;i>0;i--){
            x=GCD(n,i);
            if(x==1){
            counter++;
            }
            
        }
        return counter;
    }
    static boolean checkForPrime(int inputNumber)
{
        boolean isItPrime = true;

        if(inputNumber <= 1) 
        {
        isItPrime = false;

        return isItPrime;
        }
        else
        {
        for (int i = 2; i<= inputNumber/2; i++) 
        {
        if ((inputNumber % i) == 0)
        {
        isItPrime = false;

        break;
        }
        }

        return isItPrime;
        }
}

    public static double RSAencryption(double p , double q , double e ,double m ){
        double n,fi,c = 0;
        n=p*q;
        fi = (p-1)*(q-1);
//        System.out.println(fi);
//                System.out.println(n);

        c =Math.pow(m, e)% n ; 
        return c;
    }
    
    public static int RSAdecryption(int p , int q , int e ,int c ){
           int m ,fi, d = 0,n,k;
           n=(int) (p*q);
           fi = (p-1)*(q-1);
         d = (int) MI(e,fi);
//         System.out.println("e = " + e);
//                  System.out.println("fi = " + fi);
//System.out.println(d);
          

        
           
           m= (int) (Math.pow(c, d)%n);
           return m;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out. println(MI(3,5));
////        System.out.println(MI(11,13));
////
//       System.out. println(RSAencryption(3,2,4,5));
//        System.out.println(RSAdecryption(13,7,5,61));
               System.out.println(Math.pow(123456, 29));
               BigIngeger.
//y        System.out.println(RSAdecryption(3,11,7,29));


    }
    
}
