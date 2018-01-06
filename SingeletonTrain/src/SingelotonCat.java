public class SingelotonCat {

    public static SingelotonCat myCat = null;

    private SingelotonCat(){
        System.out.println("obj created");

    }

    public static SingelotonCat ObjCreation(){
        if (myCat == null){

        myCat = new SingelotonCat();
            System.out.println(" new keyword - weszło w if");


        }

        return myCat;


    }

    public void PrintM (){
        System.out.println("now is morning");
    }


    public void PrintE (){
        System.out.println("now is evening");
    }



}
