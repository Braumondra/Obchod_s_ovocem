public class Hruska extends Ovoce{
    private String nazev;

    public Hruska(String druh, int pocet,String nazev) {
        super(druh, pocet);
        this.nazev=nazev;
    }
    @Override
    public void vypisinfo(){
        System.out.println("Hruška a jeho název druhu je "+getDruh()+" a ovoce v pocet  skladu je "+getPocet()+" Název "+nazev);
    }
}
