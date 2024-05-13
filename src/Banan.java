public class Banan extends Ovoce{
    private String stat;
    public Banan(String druh, int pocet,String stat) {
        super(druh, pocet);
        this.stat=stat;
    }
    @Override
    public void vypisinfo(){
        System.out.println("Banan a jeho název druhu je "+getDruh()+" a ovoce v pocet  skladu je "+getPocet()+" Odkud pochází "+stat);
    }
}
