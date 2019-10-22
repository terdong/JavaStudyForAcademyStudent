package day13.abstract_calc;

public class Multiply extends Calc1 {

    public Multiply(int a, int b){
        this.a = a;
        this.b = b;
        this.op = '*';
    }

    @Override
    void answer() {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    @Override
    void answerV2(){
        super.answerV2();
        System.out.println(a * b);
    }
}
