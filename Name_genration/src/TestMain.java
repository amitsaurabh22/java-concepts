import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {

	// Constants used for creating a migration name.
	private static String setpId = "cfbdef";
	private static final String MIGRATION_NAME_PREFIX = "M";
	private static final String MIGRATION_NAME_DATE_FORMAT = "MMddHHmmssSSS";
	private static int COUNT = 100;

	public static void main(String[] args) {

		for (int i = 0; i < COUNT; i++) {

			StringBuilder migrationNameBuilder = new StringBuilder(MIGRATION_NAME_PREFIX);
			DateFormat dateFormatter = new SimpleDateFormat(MIGRATION_NAME_DATE_FORMAT);
			migrationNameBuilder.append(dateFormatter.format(new Date()));
			if (setpId.length() > 5) {
				String nameSuffex = setpId.substring(setpId.length() - 6);
				migrationNameBuilder.append(nameSuffex.toUpperCase());
			}
			String migrationName = migrationNameBuilder.toString();
			System.out.println(migrationName);

		}
	}

}
