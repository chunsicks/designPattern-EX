package ex00;
class 엘리스{
    private int 목마름;//스테틱 없어서 동적으로 new 해서 heap에 띄워야 한다

    //alt + insert로 만들 수 있다.
    public 엘리스(int 목마름) {
        this.목마름 = 목마름;
    }

    //setter 상태 변경하는 애  의도를 파악할 수 없는 행위기에 세터는 직접 만드는게 좋다

    //이게 의도를 파악하기 쉽다
    //메서드  물마시려면 내부 로직은 아주 복잡하다
    //static에 안 붙어 있기에 무조건 heap에 뜬다  new 할 때 뜬다.@@@@@@@@@@@@
    void 물마시기() {
        목마름 = 0;
    }

    // 이 친구를 getter  상태를 확인하는애
     int 목마름확인하기(){
        return 목마름;
     }
}

public class Mem01 {
    public static void main(String[] args) {

        엘리스 e  = new 엘리스(100);// 8번라인에서 동적할당(heap)
        // 1. 값 변경(행위) 의도한 값이 나온다 0
        e.물마시기();

        // 2. 값 확인
        int 목마름 = e.목마름확인하기();
        System.out.println(목마름);

       // e.목마름 = 100;//상태는 행위로 들어가야 한다 그래서 틀렸다.
        //private을 해줘서 마음대로 못 만든다
        //객체 초기화는 태어날 때 해야함 태어날 때 아버지가 있는거지 20살때부터 아버지가 있는게 아님
        //new 엘리스를 초기화 해줘야 함
    }
}
