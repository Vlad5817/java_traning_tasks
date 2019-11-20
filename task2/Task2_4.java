class Date
{
    public static int[] MONTH_LENGTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day, month, year;
    public Date(int day, int month, int year) {
        this.day = day - 1;
        this.month = month - 1;
        this.year = year - 1;
    }
    public boolean isLeapYear() {
        boolean isLeapYear = false;
        isLeapYear ^= (year + 1) % 4 == 0;
        isLeapYear ^= (year + 1) % 100 == 0;
        isLeapYear ^= (year + 1) % 400 == 0;
        return isLeapYear;
    }
    public void incDay()
    {
        int month_length = MONTH_LENGTHS[month];
        if (month == 1 && isLeapYear())
            month_length ++;
        if (day + 1 < month_length)
            day++;
        else {
            year = year + month / 11;
            month = (month + 1) % 12;
            day = 0;
        }
    }
    public String toString() {
        return String.format("%02d.%02d.%04d", day + 1, month + 1, year + 1);
    }
}

public class Task2_4 {
    public static void main(String[] args) {
        Date d = new Date(31, 12, 156);
        System.out.println(d);
        d.incDay();
        System.out.println(d);
    }
}
