public class Test {

    public static void main (String [] args){
        Girls first = Girls.klaudia;


        first.PrintingGirsl(new Presenter());

        first.PrintingGirsl(new PrintingI() {
            @Override
            public void Print() {
                System.out.println("nadpisana metoda przez new Printing");
            }
        });

    }

}
