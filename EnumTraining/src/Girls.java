public enum Girls implements GirlsI{


    luiza("black",23) {
        @Override
        public void Fucking() {

        }
    },
    klaudia("black", 20) {
        @Override
        public void Fucking() {

        }
    };

    String hair;
    int age;

    void PrintingGirsl(PrintingI printingI){
        printingI.Print();
    }

    Girls(String hair, int age){
        this.hair = hair;
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
