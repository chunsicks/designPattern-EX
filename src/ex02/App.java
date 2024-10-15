package ex02;
//App은 메인 의미

/*
    animal 생성(abstract)
    타입 일치(다형성) = 쥐(동물), 호랑이(동물)
    문지기한테 dip만 지켜주면 된다.
 */
public class App {
    public static void main(String[] args) {
      Mouse m = new Mouse(); //-> mouse, animal  heap주소를 전달하는 것임   뭐를 가르키든 Animal a해서 상관없다.
      DoormanProxy doormanProxy = new DoormanProxy(new Doorman());
      //왜 animal 안해도 괜찮은가? m
      doormanProxy.쫓아내(m);
      
      /*
      Mouse m1 = new Mouse();
      Animal a =m1;  //이 말과 같다 매개변수가 타입 받을 때 알아서 바꾼다


      */
    }
}
