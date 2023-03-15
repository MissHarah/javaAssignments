package chapterEight;

public class ConstructorOverload {


    private String name;
    private String location;

    public int balance;

    public ConstructorOverload(String name) {

        this.name = name;
    }

    public ConstructorOverload(String name, int balance) {
        this.balance = balance;
        this.name = name;
    }

   public ConstructorOverload(String name,String location,int balance) {
        this.name = name;
        this.balance = balance;
        this.location = location;
    }
    public ConstructorOverload(){

    }

    public void setName(String neefah) {
        this.name = neefah;
    }



    public static void main(String[] args) {


        ConstructorOverload bgo = new ConstructorOverload();


        bgo.setName("bone");

    }


    public String getName() {
        return name;
    }

    public String setLocation(String Aguda) {
        this.location = Aguda;
        return location;
    }
}
