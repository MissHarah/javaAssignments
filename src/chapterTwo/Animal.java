package chapterTwo;

import jdk.jshell.spi.ExecutionControl;

public class Animal {
    private String tails;
    private String furs;
    private String gender;

    public Animal(String myTails, String myFurs, String myGender) {
        tails = myTails;
        furs = myFurs;
        gender = myGender;
    }


    public void setTails(String myTails) {
         
        tails = myTails;
    }

    public void setFurs(String myFurs) {
        furs = myFurs;
    }

    public void setGender(String myGender)
    {
        gender = myGender;
    }

    public String getTails() {
        return tails;
    }

    public String getFurs() {
        return furs;
    }

    public String getGender() {
        return gender;
    }
}
