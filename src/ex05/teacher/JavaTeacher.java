package ex05.teacher;

public class JavaTeacher extends Teacher {
    //원래는 상태가 있어야 하는대 행위만 가지고 해볼게요..

    //이게 구체적인것 추상적으로 때리는 것
    /*
    public void 수업하기(){
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    public void 입장하기(){
        System.out.println("입장하기");
    }

    public void 출석부르기(){
        System.out.println("출석부르기");
    }

     */

    public void 강의하기(){
        System.out.println("자바강의하기");
    }
/*
    public void 퇴장하기(){
        System.out.println("퇴장하기");
    }

 */
}
