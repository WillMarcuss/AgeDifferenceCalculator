public class Calculate {
    public Calculate(){

    }

    public int computeYearDifference(int year1, int year2) {
        if(year1 >= year2){
            return year1 - year2;
        } else {
            return year2 - year1;
        }
    }
    public int computeMonthDifference(int month1, int month2){
        if(month1 >= month2){
            return month1 - month2;
        } else {
            return month2 - month1;
        }

    }
    public int computeDayDifference(int day1, int day2){
        if(day1 >= day2){
            return day1 - day2;
        } else {
            return day2 - day1;
        }
    }
}
