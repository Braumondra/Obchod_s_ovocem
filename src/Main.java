import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Jablka
        System.out.println("Zadáváte do jablka");
                                System.out.println("Kolik je chcete aby bylo ve skladu ");
                                int pocet=sc.nextInt();
                                sc.nextLine();
                                System.out.println("Druh Jablka");
                                String druh =sc.nextLine();
                                System.out.println("Název Stromu");
                               String strom =sc.nextLine();
                                Jablko jablko =new Jablko(druh,pocet,strom);
                                jablko.vypisinfo();
        System.out.println("Kolik chcete přidat ovoce");
        int dodavka =sc.nextInt();
        sc.nextLine();
        jablko.dodavka_ovoce(dodavka);
        System.out.println("Kolik chcete koupit");
        int koupit= sc.nextInt();
        jablko.nakup_ovoce(koupit);
        jablko.vypisinfo();
        //Jablka
// Hruska
        System.out.println("Zadáváte do Hrušky");
        System.out.println("Kolik je chcete aby bylo ve skladu ");
         pocet=sc.nextInt();
        sc.nextLine();
        System.out.println("Druh Hrušky");
         druh =sc.nextLine();
        System.out.println("Název ovoce");
        String nazev =sc.nextLine();
        Hruska hruska =new Hruska(druh,pocet,nazev);
        hruska.vypisinfo();
        System.out.println("Kolik chcete koupit");
         koupit= sc.nextInt();
        hruska.nakup_ovoce(koupit);
        System.out.println("Kolik chcete přidat ovoce");
         dodavka =sc.nextInt();
        sc.nextLine();
        hruska.dodavka_ovoce(dodavka);
        hruska.vypisinfo();
        // Hruska
        //Banan
        System.out.println("Zadáváte do Banánu");
        System.out.println("Kolik je chcete aby bylo ve skladu ");
        pocet=sc.nextInt();
        sc.nextLine();
        System.out.println("Druh  banánu ");
        druh =sc.nextLine();
        System.out.println("Odkud pochází ");
        String stat =sc.nextLine();
        Banan banan =new Banan(druh,pocet,stat);
        banan.vypisinfo();
        System.out.println("Kolik chcete koupit");
        koupit= sc.nextInt();
        banan.nakup_ovoce(koupit);
        System.out.println("Kolik chcete přidat ovoce");
        dodavka =sc.nextInt();
        sc.nextLine();
        banan.dodavka_ovoce(dodavka);
        banan.vypisinfo();
        //Banan

        //Pomeranc
        System.out.println("Zadáváte do Pomeranču");
        System.out.println("Kolik je chcete aby bylo ve skladu ");
        pocet=sc.nextInt();
        sc.nextLine();
        System.out.println("Druh  Pomeranče");
        druh =sc.nextLine();
        System.out.println("Kolik stojí jeden banán");
        int cena =sc.nextInt();
        Pomeranc pomeranc =new Pomeranc(druh,pocet,cena);
        pomeranc.vypisinfo();
        System.out.println("Kolik chcete koupit");
        koupit= sc.nextInt();
        pomeranc.nakup_ovoce(koupit);
        System.out.println("Kolik chcete přidat ovoce");
        dodavka =sc.nextInt();
        sc.nextLine();
        pomeranc.dodavka_ovoce(dodavka);
        pomeranc.vypisinfo();
        //Pomeranc
    }
}