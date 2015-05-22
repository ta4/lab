package members;
import interfaces.Operators;

/**
 * Created by Yuri on 06.02.2015.
 */
public class OperatorClass implements Operators{
    public float sum(float a, float b){
        return a+b;
    }
    public float del(float a, float b){
        if(b==0){throw new Error("На ноль делить нельзя");}
        return a/b;
    }
    public float mult(float a, float b){
        return a*b;
    }
    public float diff(float a, float b){
        return a-b;
    }
    public float result(float a, float b, char op){
        float result = 0;
        switch(op){
            case '+':
                result = sum(a,b);
                break;
            case '-':
                result = diff(a,b);
                break;
            case '*':
                result = mult(a,b);
                break;
            case '/':
                result = del(a,b);
                break;
            default: throw new Error("Нет такого оператора");
        }
    return result;
    }
}
