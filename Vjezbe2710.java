import java.util.Scanner;

public class niz {
    public static void main(String[] args) {
        int n = 15;
        n += 3;
        System.out.println("Nova vrijednost: " + n);
        int br, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi velicinu polja:");
        br = sc.nextInt();
        int []polje = new int[br];
        for (int i = 0; i < br; i++) {
            System.out.println("Upisi novi broj u nizu. ");
            polje[i] = sc.nextInt();
            suma += polje[i];
        }
        System.out.println("Suma elemenata je: " + suma);
        
    }
}

//-----------------------------------------------------------------------------

import java.util.Scanner;

public class znakovni_niz {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Unesi recenicu: ");
        String unos = sc.next();
        System.out.println(unos);
    }
}

//----------------------------------------------------------------------------

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class datoteka {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream("datoteka.txt");
        PrintStream p = new PrintStream(out);
        p.println("Ovo se ispisuje u datoteku.");
        p.println("Ovo se ispisuje u datoteku 2.");
        p.println("Ovo se ispisuje u datoteku 3.");
    }
}

//------------------------------------------------------------------------

import java.io.*;
import java.nio.channels.Pipe;

public class datoteka_upis {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("datoteka.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(in));
        String linija;
        int i = 0;
        String []polje = new String[30];
        while((linija = b.readLine()) != null) {
            polje[i] = linija;
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(polje[j]);
        }

        b.close();
    }
}

//-----------------------------------------------------------------------

