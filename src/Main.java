import java.util.Scanner;

class ProfilUtilizator {
    String nume;
    String prenume;
    String email;
    String numarTelefon;
    int dataNasterii;
    String gen;
    public void initializeazaProfil(Scanner scanner) {
        // TODO
        this.nume = scanner.nextLine();
        this.prenume = scanner.nextLine();
        this.email = scanner.nextLine();
        this.numarTelefon = scanner.nextLine();
        this.dataNasterii = scanner.nextInt();
        scanner.nextLine();
        this.gen = scanner.nextLine();
    }

    public void actualizareEmail(String email) {
        // TODO
        this.email = email;

    }

    public void actualizareNumarTelefon(String numarDeTelefon) {
        // TODO
        this.numarTelefon = numarDeTelefon;
    }

    public void afisareVarsta(int an) {
        // TODO
        int varsta = an - this.dataNasterii;
        System.out.println(varsta);

    }

    public void afisareStareInterna() {
        // TODO
        System.out.println("Nume: " + this.nume);
        System.out.println("Prenume: " + this.prenume);
        System.out.println("Email: " + this.email);
        System.out.println("Numar de telefon: " + this.numarTelefon);
        System.out.println("Data nasterii: " + this.dataNasterii);
        System.out.println("Gen: " + this.gen);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProfilUtilizator profilUtilizator = new ProfilUtilizator();

        profilUtilizator.initializeazaProfil(scanner);
        profilUtilizator.afisareStareInterna();
        System.out.println();

        String newEmail = scanner.nextLine();
        profilUtilizator.actualizareEmail(newEmail);

        String newPhone = scanner.nextLine();
        profilUtilizator.actualizareNumarTelefon(newPhone);

        int year = scanner.nextInt();
        profilUtilizator.afisareVarsta(year);
        System.out.println();

        profilUtilizator.afisareStareInterna();
    }
}