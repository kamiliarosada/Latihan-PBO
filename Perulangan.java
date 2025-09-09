package ForLoop;
 
public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
    
        System.out.println("Perulangan while: ");
        int j = 1;
        while (j <= 5) {
            System.out.println("Perulangan ke-" + j);
            j++;
        }

        System.out.println("\nPerulangan do-while:");
        int k = 1;
        do {
            System.out.println("Iterasi ke-" + k);
            k++;
        } while (k <= 5);
    }
}
    

