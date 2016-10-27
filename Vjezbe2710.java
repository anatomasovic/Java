import java.util.Scanner;

public class niz {
    public static void main(String[] args) {
        int n = 15;
        n += 3;
        System.out.print("Nova vrijednost: " + n);
        int br, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi velicinu polja:");
        br = sc.nextInt();
        int []polje = new int[br];
        for (int i = 0; i < br; i++) {
            System.out.println("Upisi novi broj u nizu. ");
            polje[i] = sc.nextInt();
        }
    }
}
