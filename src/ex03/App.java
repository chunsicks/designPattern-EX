package ex03;
//App은 메인 의미

import ex03.lib.OuterRabbit;

/*
    animal 생성(abstract)
    타입 일치(다형성) = 쥐(동물), 호랑이(동물)
    문지기한테 dip만 지켜주면 된다.
 */
public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Tiger t1 = new Tiger();
        Doorman d1 = new Doorman();

        d1.쫓아내(t1);
        d1.쫓아내(m1);

        RabbitAdapter rabbit = new RabbitAdapter(new OuterRabbit());
        d1.쫓아내(rabbit);
/*
        OuterRabbit r1 = new OuterRabbit();
        d1.쫓아내(r1);

 */
    }
}
