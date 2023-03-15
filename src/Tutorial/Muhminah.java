package Tutorial;

public class Muhminah { // Name

    private String gender; //Attribute or Instance Variable
    private String name; //Attribute or Instance Variable
    private boolean decency; //Attribute or Instance Variable
    private String trustworthness; //Attribute or Instance Variable

    private String prayer = "Jazakumullah khyran";


    // Constructor Starts Here
    public Muhminah(String gender, String name, boolean decency, String trustworthness) {
        this.gender = gender;
        this.name = name;
        this.decency = decency;
        this.trustworthness = trustworthness;
    }
    // Constructor Ends Here


    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender; //Method Body
    }

    public String getName() {

        return name; //Return statement
    }

    public void setName(String theName) {

        this.name = theName;
    }

    public boolean isDecency() {

        return decency;
    }

    public void setDecency(boolean decency) {

        this.decency = decency;
    }

    public String getTrustworthness() {

        return trustworthness;
    }

    public void setTrustworthness(String trustworthness) {

        this.trustworthness = trustworthness;
    }

    public String getPrayer() {
        return prayer;
    }

    public void setPrayer(String prayer) {
        this.prayer = prayer;
    }

    public String pray(){
//        String prayer = "Jazakhum lai Hkairan";
        String praying = getPrayer();
        String theHajiaName = getName();

        String thePrayer = theHajiaName + "Said" + praying;

        return thePrayer;
    }

}
