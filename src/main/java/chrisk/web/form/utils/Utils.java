package chrisk.web.form.utils;

public class Utils {

	
public static String getMonthNameFromNumber(int num) {
		
		String monthName = null;
		switch (num) {
		case 1:
			monthName ="Jan";
			break;
		case 2:
			monthName ="Feb";
			break;
		case 3:
			monthName ="Mar";
			break;
		case 4:
			monthName ="Apr";
			break;
		case 5:
			monthName ="May";
			break;
		case 6:
			monthName ="Jun";
			break;
		case 7:
			monthName ="Jul";
			break;
		case 8:
			monthName ="Aug";
			break;
		case 9:
			monthName ="Sep";
			break;
		case 10:
			monthName ="Oct";
			break;
		case 11:
			monthName ="Nov";
			break;
		case 12:
			monthName ="Dec";
			break;
			
		default:
			System.out.println("Please pass correct number");
			break;
		}
		return monthName;
	}
}
