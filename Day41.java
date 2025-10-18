package Day41;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
       Scanner arwi=new Scanner (System.in); 
        
       
        System.out.print(" masukkan angka pertama ");
        int a=arwi.nextInt();
        
        System.out.print(" Masukkan operator +,*,/,-,%; ");
        char operator =arwi.next().charAt(0);
        
        System.out.print("masukkan angka ke dua ");
        int b=arwi.nextInt();
        
        int hasil=0;
        
        if (operator == '+') {
            hasil = a+b;
            System.out.println("hasil = " +hasil);
        }
        
        else if (operator == '*') {
            hasil=a*b;
            System.out.println("hasil = " +hasil);
        }
        
        else if (operator== '/') {
            hasil=a/b;
            System.out.println("hasil=" + hasil);
        }
        
        else if (operator == '-') {
            hasil=a-b;
            System.out.println(" hasil " + hasil);
        }
        else if (operator== '%'){
            hasil=a%b;
            System.out.println(" hasil " + hasil);
        }
            
        else 
            System.out.println(" eror, operator tidak ditemukan ");
        
        
    }
    
    
    
}
