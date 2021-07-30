package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static common.Config.PLATFORM_AND_BROWSER;
import static constans.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class CommonActions {

	public static WebDriver createDriver(){
		WebDriver driver = null;
		switch (PLATFORM_AND_BROWSER){
			case "MAC_CHROME":
				WebDriverManager.chromiumdriver().setup();
				driver = (WebDriver) new ChromiumDriverManager();
				break;
			case "WINDOWS_CHROME":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "WINDOWS_MOZILLA":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				Assertions.fail("ICORRECT BROWSER NAME" + PLATFORM_AND_BROWSER);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		return driver;
	}
}
