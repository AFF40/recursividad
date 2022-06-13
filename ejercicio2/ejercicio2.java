package n1;

import java.util.Scanner;

public class ejercicio2 {
    public static int mcd1(int m,int n){
        int mcd1=0;

        if (m==n) {
            mcd1=n;

        }else {
            if (m>n){
                mcd1=mcd1(m-n,n);
                //System.out.println(ejercicio2.mcd1(m,n));
            }
            else {
                if (n>m){
                    mcd1=mcd1(m,n-m);
                  //  System.out.println(ejercicio2.mcd1(m,n));
                }
            }
        }

        return mcd1;
    }
}