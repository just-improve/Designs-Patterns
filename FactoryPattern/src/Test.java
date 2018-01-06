import PCar.Ferrari;
import PCar.Maluch;

public class Test {

    public static void main (String []args){

        Factory factory = new Factory();
        Ferrari ferrari1 = (Ferrari) factory.getCar("ferrari");

        Maluch maluch  = (Maluch) factory.getCar("maluch");

        int speedFerrari = ferrari1.GetFast();

        int speedOfMaluch = maluch.GetFast();

        System.out.println(speedFerrari);
        System.out.println(speedOfMaluch);

    }
}
