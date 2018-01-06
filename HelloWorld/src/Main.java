public class Main {

    //public określa dostępnośc metody - private protected
    //static
    //void określa co metoda zwraca

    int liczba2globalnazmienna = 10;

    public static void main(String[] args){
        String str = "dziś jests 2017 rok";
        //deklaracja - stworzenie
        int liczba = 3;
        double liczba_z_przecinkiem = 3.3;
        boolean prawd_lub_falsz= true;

        Main main = new Main();


        main.metoda_która_zmienia_wartośc_zmiennej();
        System.out.println("liczba to "+liczba);



    }


    public void metoda_która_zmienia_wartośc_zmiennej (){
        liczba2globalnazmienna = 25;

        System.out.println("liczba2 to "+liczba2globalnazmienna);

    }
}
