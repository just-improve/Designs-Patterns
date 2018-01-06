import java.util.Scanner;

public class ScaningClass {

    Scanner scanner;

    public  String TakeMemberName(){
        System.out.println("podaj imie");
        String name = scanner.next();
        return name;
    }


    public int TakeMemberAge(){

        System.out.println("podaj wiek");
        int age = scanner.nextInt();
        return age;
    }

    public boolean MenuOrExit(){
        System.out.println("Inserting Data = Y ;;  Exit = E");
        scanner = new Scanner(System.in);

        boolean torf = false;
        String exitOrInsertingData = scanner.next();

        if (exitOrInsertingData.equalsIgnoreCase("y")){
            torf =true;
        }


        return torf;
    }

    //tutaj trzeba by stworzyć menu z którego by się startowało
    //po dodaniu kogoś trzeba by stworzyć 3 opcję powrót do menu, dodanie kolejnego, dodanie obecności, edycja uczestnika i ogólnie w menu trzeba by stworzyć te wszystkie opcje



}
