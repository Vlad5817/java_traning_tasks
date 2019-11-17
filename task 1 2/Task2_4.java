class Date
{
    public static int[] MONTHS_LENGTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day = 31, month = 12, year = 1;
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public boolean isLeapYear()
    {
        return (year % 4 == 0 && (year % 100 != 0 || year%400 == 0 && year % 100 == 0 ));
    }
    public void incDay()
    {
        if (day < MONTHS_LENGTH[month - 1]) {
            day++;
        } else if (isLeapYear() && month == 2 && day < 1 + MONTHS_LENGTH[month]) {
            day++;
        } else {
            day = 1;
            if (month < 12)
                month++;
            else{
                month = 1;
                year++;
            }
        }
    }
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}
public class Tack2_4 {

    public static void main(String[] args) {
        int day = 31, month = 12, year = 1;
        Date d = new Date(31, 12, 156);
        System.out.println(d);
        d.incDay();
        System.out.print(d);
    }
}
