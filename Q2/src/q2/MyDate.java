package q2;
import java.time.LocalDate;
public class MyDate {
    private int year,month,day;
    public MyDate(){
        LocalDate d=LocalDate.now();
        year=d.getYear();
        month=d.getMonthValue();
        day=d.getDayOfMonth();
    }
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String toString(){
        return year+"-"+month+"-"+day;
    }
}
