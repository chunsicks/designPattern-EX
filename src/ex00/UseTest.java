package ex00;

import java.sql.SQLOutput;

class Test {
    private int num;

    public Test(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
public class UseTest{
    int n1 = 100;
    int n2 = 100;


    public static void main(String[] args) {
        Test test = new Test(100);
        System.out.println(test.getNum());

        Test t2 = test;
        System.out.println(t2.getNum());
        t2.setNum(200);

        System.out.println(test.getNum());
        System.out.println(t2.getNum());
        UseTest useTest = new UseTest();
        useTest.n2 = 99;
        System.out.println(useTest.n2);



    }
}
