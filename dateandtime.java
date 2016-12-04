import java.util.*;
class dateandtime {
	public static void main(String args[]) {
		int day,month,year,second,minute,hour;
		GregorianCalendar date=new GregorianCalendar();
		day=date.get(Calendar.DAY_OF_MONTH);
		month=date.get(Calendar.MONTH);
		year=date.get(Calendar.YEAR);
		second=date.get(Calendar.SECOND);
		minute=date.get(Calendar.MINUTE);
		hour=date.get(Calendar.HOUR);
		System.out.println("Data autal e "+day+"/"+(month+1)+"/"+year);
		System.out.println("Hora atual e "+hour+" : "+minute+" : "+second);
	}
}
/*
Output:

Current date is  1/4/2014*/
