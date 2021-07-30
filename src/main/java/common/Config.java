package common;


public class Config {
	/*
	 * Specify the browser and platform for test
	 * MAC_CHROME
	 * WINDOWS_CHROME
	 * WINDOWS_MOZILLA
 	 */
	public static final String PLATFORM_AND_BROWSER = "WINDOWS_CHROME";
	/*
	 * Clean browser cookies after each iteration
	 */
	public static final Boolean CLEAR_COOKIES = false;
	/*
	 * To keep the browser open after all scenario/tests
	 */
	public static final Boolean HOLD_BROWSER_OPEN = true;
	/*
	 * Clear directory with the screen before starting the build
	 */
	public static final Boolean CLEAR_REPORTS_DIR = true;

}
