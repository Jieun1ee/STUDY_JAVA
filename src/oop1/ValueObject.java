package oop1;

public class ValueObject {
    int value;


    //static 사용하지 않음
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
