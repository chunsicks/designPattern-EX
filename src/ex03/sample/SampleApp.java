package ex03.sample;

interface 나이프{
    default void attack() {}

    default void cook(){}
}
class 백종원 implements 나이프 {
    @Override
    public void cook() {
        System.out.println("김치찌개 만들기");
    }
}

public class SampleApp {
    public static void main(String[] args) {

    }
}
