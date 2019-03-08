import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.time.*;



public class MyDateUtils {

	public static void main(String[] args) {
		String startPolicyTime = "8:00 AM";
		//to subtract the minute from date.
		DateFormat sdf = new SimpleDateFormat("hh:mm a");
		Date date = new Date();
		try {
			date = sdf.parse(startPolicyTime);
			date = DateUtils.addHours(date, 23);
			date = DateUtils.addMinutes(date, 59);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sdf.format(date)); 



		/// this code conver 24 hour for mat into 12 hours.

		String sampleDate ="00:00";
		DateFormat sdf24 = new SimpleDateFormat("HH:mm");
		DateFormat sdf12 = new SimpleDateFormat("hh:mm a");
		try {
			Date date24= sdf24.parse(sampleDate);
			String date12 =sdf12.format(date24);
			System.out.println("date in 12 hour format "+date12);
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
