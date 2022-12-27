package chapterRename;

public class EmployeesSalary {
    private int PayHourly;
    private int amountOfHourWorked;

    public void setGrossPay(int amountOfHourWorked) {
        int PayFortyHours = 40 * 100;
        System.out.println("total gross pay is hourly " + PayFortyHours);
    }

    public void paymentForIndividuals(int amountOfHourWorked) {

        int extraHour = amountOfHourWorked - 40;

        int grossPay = extraHour + PayHourly;
        System.out.println("Total gross pay is  extra hour + payHourly " + grossPay);
    }
        public void clearPay (int amountOfHourWorked) {
        if(amountOfHourWorked ==40){
            setGrossPay(amountOfHourWorked);
        } else if (amountOfHourWorked>40) {
            paymentForIndividuals(amountOfHourWorked);

        }


        }
    }
