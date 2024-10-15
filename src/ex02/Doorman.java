package ex02;

public class Doorman {

    //책임줄거다  쥐 출입금지
    public void 쫓아내(Animal m){ // OCP할거임
        System.out.println(m.getName()+"쫓아내");
    }
}
