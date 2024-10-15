package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.SpringTeacher;

/**
 * 템플릿 : 반복적인 작업을 간판하게 하기 위해 미리 정의된 틀이나 형식
 *
 * 귀찮고 순서가 달라질 수 있다.
 */

public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
       /*
        jt.입장하기();
        jt.출석부르기();
        jt.자바강의하기();
        jt.퇴장하기();


            */
        jt.수업하기(); //이것만으로 가능  만들다 보면 귀찮아 질 때 만들어짐 처음부터 생각하고 구상하지는 않는다.
        //jt.start();

        PythonTeacher pt = new PythonTeacher();
        /*
        pt.입장하기();
        pt.출석부르기();
        pt.파이썬강의하기();
        pt.퇴장하기();

         */
        HtmlTeacher ht = new HtmlTeacher();
        ht.수업하기();

        SpringTeacher st = new SpringTeacher();
        st.수업하기();

    }
}
