package pl.sii.excersise.generic1;

public class MainDemko {
    public static void main(String[] args) {
        Demko demko=new Demko();
        System.out.println(demko.<String,Integer>getData("Napis",20));
        System.out.println(demko.<Integer,Integer>getData(2,10));
    }
}
