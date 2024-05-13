public class Jablko extends Ovoce{
    private String strom;
    public Jablko(String druh, int pocet,String strom) {
        super(druh, pocet);
        this.strom=strom;
    }
    @Override
    public void vypisinfo(){
        System.out.println("Jablko a jeho název druhu je "+getDruh()+" a ovoce v pocet  skladu je "+getPocet()+" ze  stromu je  "+strom);
    }

}
