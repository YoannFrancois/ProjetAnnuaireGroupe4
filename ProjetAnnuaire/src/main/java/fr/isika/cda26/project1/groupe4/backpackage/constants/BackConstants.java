package fr.isika.cda26.project1.groupe4.backpackage.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Constant for all backend of the application;
 * 
 * @author Thibault SALGUES & Yoann FRANCOIS.
 *
 */
public interface BackConstants {

// ********************************** PATHES *********************************************************
	String USER_DB_FILE = "user_db_file.bin";
	String DIRECTORY_DB_FILE = "internsDirectory_db_file.bin";
	List<String> FILES_LIST = new ArrayList<String>(Arrays.asList(USER_DB_FILE, DIRECTORY_DB_FILE));
	String DB_URL = "src/main/java/db_files/";
	String DON_DIR_URL = "C:/Users/";

// ********************************** KEY-VALUES FOR DB **********************************************
	String FILLING_CHAR = "*";
	int STOP_VALUE = -1;
	int START_VALUE = 0;
	int EMPTY_VALUE = -1;

// ********************************** SIZES OF ATTRIBUTES FOR DB *************************************
	int NAME_SIZE = 25;
	int FORENAME_SIZE = 25;
	int LOCATION_SIZE = 2;
	int PROMOTION_SIZE = 15;
	int PROMOTION_YEAR_SIZE = 1;
	int RIGHTNODE_POSITION_SIZE = 1;
	int LEFTNODE_POSITION_SIZE = 1;
	int EQUAL_POSITION_SIZE = 1;
	
	int PASSWORD_SIZE = 15;
	int EMAIL_SIZE = 25;
	int STATUS_SIZE = 5;
	int ID_SIZE = 1;

// ********************************** SIZES OF OBJECTS ***********************************************
	int INTERN_SIZE = 2 * (NAME_SIZE + FORENAME_SIZE + LOCATION_SIZE + PROMOTION_SIZE)
			+ 4 * (PROMOTION_YEAR_SIZE + RIGHTNODE_POSITION_SIZE + LEFTNODE_POSITION_SIZE + EQUAL_POSITION_SIZE);
	int[] INTERN_DB_MASK = new int[] { 0, 2 * (NAME_SIZE), 2 * (NAME_SIZE + FORENAME_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + LOCATION_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + LOCATION_SIZE + PROMOTION_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + LOCATION_SIZE + PROMOTION_SIZE) + 4 * (PROMOTION_YEAR_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + LOCATION_SIZE + PROMOTION_SIZE)
					+ 4 * (PROMOTION_YEAR_SIZE + RIGHTNODE_POSITION_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + LOCATION_SIZE + PROMOTION_SIZE)
					+ 4 * (PROMOTION_YEAR_SIZE + RIGHTNODE_POSITION_SIZE + LEFTNODE_POSITION_SIZE), };
	
	int USER_SIZE = 2 * (NAME_SIZE + FORENAME_SIZE + PASSWORD_SIZE + EMAIL_SIZE + STATUS_SIZE) + 4 * (ID_SIZE);
	int[] USER_DB_MASK = new int[] { 0, 2 * (NAME_SIZE), 2 * (NAME_SIZE + FORENAME_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + PASSWORD_SIZE),	
			2 * (NAME_SIZE + FORENAME_SIZE + PASSWORD_SIZE + EMAIL_SIZE),
			2 * (NAME_SIZE + FORENAME_SIZE + PASSWORD_SIZE + EMAIL_SIZE + STATUS_SIZE)
	};
	
// ********************************** STATUS  *********************************************************
	String ADMIN_STATUS = "admin";
	String STAFF_STATUS = "staff";
	String EMPTY_STATUS = "";
	
}
