package OOP;

/**
 * Created by ejogi on 31.01.16.
 */
public class Zelda {
    private int elud;

    public Zelda(int elusid) {
        elud = elusid;
    }

    public void kaklusKolliga(int kollilElusid) {
        elud = elud - kollilElusid;
    }

    public void prindiMituEluAlles() {
        System.out.println(Integer.toString(elud));
    }

    public void prindiKasOnElus() {
        if (elud>0){
            System.out.println("elus");;
        } else {
            System.out.println("Ei ole elus");
        }
    }
}
