import java.util.Scanner;

public abstract class Ovoce {
    static Scanner sc = new Scanner(System.in);
    private String druh;
    private int pocet;

    public Ovoce(String druh, int pocet) {
        this.druh = druh;
        this.pocet = pocet;
    }

    public void vypisinfo(){
        System.out.println("Název druhu je "+druh+" a ovoce v pocet  skladu je "+pocet);
    }
    public void nakup_ovoce(int zadost){
        if (pocet>=0) {
            if (zadost<=pocet){
                System.out.println("Žádost je menší než kolik je jablek");
            }
            else {
                System.out.println("Žádost je větší než kolik je jablek ve skladu a oprav te se");
                zadost =sc.nextInt();

            }
            pocet = pocet - zadost;
            System.out.println("Koupili jste celkem ovoce "+zadost+" a zbylo "+pocet);
        }
        else {
            System.out.println("Není možné koupit ovoce protože došli musí se objednat");
        }
    }
    public void dodavka_ovoce(int dodavka){
        pocet = pocet+dodavka;
        System.out.println("Celkem ve skladu je "+dodavka + " a bylo předtím "+(pocet-dodavka));
    }

    public String getDruh() {
        return druh;
    }

    public int getPocet() {
        return pocet;
    }
}
