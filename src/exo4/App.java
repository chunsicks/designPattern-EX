package exo4;
//App은 메인 의미


public class App {
    public static void main(String[] args) {
        //두번째 new하는 것을 막아야 한다
        Doorman d1 = Doorman.instance;
        Doorman d2 = Doorman.instance;

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
