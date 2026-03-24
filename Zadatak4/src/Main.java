import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Unesi putanju do originalne datoteke:");
            String sourcePath = input.nextLine();
            File sourceFile = new File(sourcePath);

            if (!sourceFile.exists()) {
                System.out.println("Izvorna datoteka ne postoji!");
                return;
            }

            System.out.println("Unesite putanju i naziv kopije:");
            String destPath = input.nextLine();
            File destFile = new File(destPath);

            if (destFile.exists()) {
                System.out.println("Datoteka vec postoji. Zelite li ju prepisati? (D/N)");
                String odgovor = input.nextLine();

                if (!odgovor.equalsIgnoreCase("D")) {
                    System.out.println("Prekid programa. Odaberite drugo ime.");
                    return;
                }
            }

            // 4. Kopiranje (byte po byte)
            try (FileInputStream fis = new FileInputStream(sourceFile);
                 FileOutputStream fos = new FileOutputStream(destFile)) {

                int byteData;

                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }

                System.out.println("Kopiranje uspjesno zavrseno.");
            }

            if (destFile.exists()) {
                System.out.println("Kopija datoteke uspješno kreirana.");
            } else {
                System.out.println("GreSka: kopija nije pronađena.");
            }

            System.out.println("Zelite li izbrisati kopiju datoteke (D/N)?");
            String odgovor = input.nextLine();

            if (odgovor.equalsIgnoreCase("D")) {

                if (destFile.exists()) {
                    boolean obrisano = destFile.delete();

                    if (obrisano) {
                        System.out.println("Datoteka uspješno obrisana.");
                    } else {
                        System.out.println("Greška pri brisanju datoteke.");
                    }
                } else {
                    System.out.println("Datoteka ne postoji.");
                }
            }

        } catch (IOException e) {
            System.out.println("Dogodila se greska pri radu s datotekama:");
            System.out.println(e.getMessage());
        }

        input.close();
    }
}