package ex00;
//추상화

import org.w3c.dom.ls.LSOutput;

class Car{
   void a (){
        System.out.println("hi");
    }
}

class Sonata extends Car{
  void run (){
        System.out.println("sonata  달린다");
    }
}

class Genesis extends Car{
    void run2 (){
        System.out.println("genesis 달린다");
    }
}
//instanceof  -> 타입검사
public class Mem02 {

    static  void 레이싱(Car s1){
        System.out.println("소나타 달림");
    }
    /*
    static  void 레이싱(Genesis s1){
        System.out.println("제네시스 달림");
    }
    static  void 레이싱(Car s1){
       if(s1 instanceof Sonata){

       }else if (s1 instanceof Genesis){

       }
    }
     */
    public static void main(String[] args) {
        Sonata s1 = new Sonata();
        Genesis g1 = new Genesis();
        s1.a();
        Mem02 m = new Mem02();
        m.레이싱(s1);

        g1.a();
    }
}
