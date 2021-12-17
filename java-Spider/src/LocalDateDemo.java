import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class LocalDateDemo {
	public static void main(String[] args) throws ParseException {
		LocalDate d1= LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2= LocalDate.of(2020,04,14);
		System.out.println(d2);
		
		LocalDate d3= LocalDate.parse("2017-02-19");
		System.out.println(d3);
		
        System.out.println(d1.plusDays(10));
        System.out.println(d2.plus(2, ChronoUnit.WEEKS));
        
        System.out.println(d2.plus(2, ChronoUnit.MONTHS));
        System.out.println(d3.minus(1, ChronoUnit.YEARS));
        
        System.out.println(d2.getDayOfWeek());
        System.out.println(d1.isLeapYear());
        
        //code to calculate age....
        String s = "1994/06/23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = (Date) sdf.parse(s);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year=c.get(Calendar.YEAR);

        int month=c.get(Calendar.MONTH)+1;

        int date=c.get(Calendar.DATE);
        Period diff1 = Period.between(d1, d2);
        System.out.println("age:" + diff1.getYears() + "years");

		
	}

}
