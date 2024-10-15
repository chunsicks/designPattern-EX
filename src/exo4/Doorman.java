package exo4;

public class Doorman {

    public static Doorman instance = new Doorman();
    //private static Doorman instance = new Doorman();

    public static Doorman getInstance(){
        return instance;
    }


    private Doorman(){}
    //책임줄거다  쥐 출입금지
    public void 쫓아내(Animal m){
        System.out.println(m.getName()+"쫓아내");
    }
}
