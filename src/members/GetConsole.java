package members;

import java.util.Scanner;

/**
 * Created by Yuri on 06.02.2015.
 */
public class GetConsole {
    public float getCons () {
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();

    }
    public String getConsOperator(){
        Scanner scan = new Scanner(System.in);
        return scan.next().toString();
    }

}
