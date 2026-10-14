class Solution {
    public int fDate(String date){
        int totalDays = 0;
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int days = Integer.parseInt(dates[2]);

        for(int i = 1900; i < year; i ++){
            totalDays += isLeapYear(i) ? 366 : 365;
        }
        int[] daysInMonths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30 , 31, 30, 31
        };
        if(isLeapYear(year)){
            daysInMonths[1] = 29;
        }
        for(int m = 1; m < month; m ++){
            totalDays += daysInMonths[m - 1];
        }
        totalDays += days;

        return totalDays;
    }
    public boolean isLeapYear(int year){
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
    public int daysBetweenDates(String date1, String date2) {
        int daysInDate1 = fDate(date1);
        int dayInDate2 = fDate(date2);

        return Math.abs(daysInDate1 - dayInDate2);
    }
}