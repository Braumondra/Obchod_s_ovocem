public class Pomeranc extends Ovoce{
    private int cena;
    public Pomeranc(String druh, int pocet,int cena) {
        super(druh, pocet);
        this.cena=cena;
    }
@Override
    public void vypisinfo(){
        System.out.println("Pomeranc a jeho název druhu je "+getDruh()+" a ovoce v pocet  skladu je "+getPocet()+" Stojí "+cena);
    }
}
