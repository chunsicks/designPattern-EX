package ex02;

public class DoormanProxy {
    //상속해도 컴퍼지션 둘 다 해도 된다!

    private Doorman doorman;

    public DoormanProxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal a) {
        System.out.println("안녕~~~~");
        doorman.쫓아내(a);

    }
}
