public class Main {

    public static void main(String args[]) {
        int year = 2020;

        boolean result = Answer.isLeapYear(year);
        if (result) {
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is no leap year");
        }
    }

}

class Answer {

    static boolean isLeapYear(int year) {
        // Your code goes here.
        if(year % 4 == 0 || (year % 100 == 0 && year % 400 == 0))
            return true;
        return false;
    }

}
