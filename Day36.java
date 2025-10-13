
package Day36;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.print("masukkan nilai kamu: ") ;
        int nilai =input.nextIn() ;
        
        if (nilai >=80) {
        if (nilai >=90) {
            System.out.println("Nilai kamu A  Sangat baik");
        } else  {
            System.out.println("Nilai kamu B Lulus");
        } else if (nilai >=75) {
            System.out.println("Nilai kamu C Tidak lulus!");
        }
    }
}
