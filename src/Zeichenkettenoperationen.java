import java.util.Scanner;

public class Zeichenkettenoperationen {
    private Scanner scanner;
    private Tester test;

    public static void main(String[] args) {
        new Zeichenkettenoperationen();
        System.out.println("Herzlich willkommen zuZeichenketten Tester!");

    }

    public Zeichenkettenoperationen() {
        test = new Tester();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Zeichenkette umdrehen");
            System.out.println("[2] Palindromtest");
            System.out.println("[3] Team mit längsten Namen ausgeben");// (" + this.countNewMessages + ")");
            System.out.println("[4] Team mit höchsten Punktestand angeben");
            //System.out.println("[99] Fake Nachricht empfangen");
            //System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {

                this.test.setZEingabe();
                this.test.zeichenketteUmkehren();

            } else if (option == 2) {
                // this.sendMessage();
                System.out.println("Bitte den Namen des neuen Teams angeben.");
                String neuesTeam = scanner.nextLine();
                this.vw.fuegeTeamDerTabelleZu(new Team(neuesTeam));
                this.vw.gibAlleTeamsAus();
            } else if (option == 3) {
                //this.showNotifications();
            } else if (option == 4) {
                //  this.deleteNotifications();
            } else if (option == 0) {
                break;
            } else if (option == 99) {
                // this.receiveFakeMessage();
            }
            System.out.println();
        }
    }



}