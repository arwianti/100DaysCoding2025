package Day54;
public class main{
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            
            if (i == 3) {
                continue; // melewati angka 3
            }
            
            System.out.println("Angka: " + i);
        }
    }
}
