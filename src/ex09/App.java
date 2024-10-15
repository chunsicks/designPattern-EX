package ex09;

public class App {
    //Person이라는 애가 있을 때 초기화 안됨
    //  Person p1 = new Person();
    public static void main(String[] args) {
       //스태틱 이기 때문에 builder사용가능
        Person p1 = Person.builder().id(1).name("홍길동").email("ckddbsdbs123@naver.com");
        // 안됨 Person p1  = new Person();
        System.out.println(p1.getAge());
    }

}
