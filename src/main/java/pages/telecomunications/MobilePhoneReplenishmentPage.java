package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {
	public MobilePhoneReplenishmentPage(WebDriver driver) {
		super(driver);
	}

	private final By buttonWallet = By.xpath("//div[text()='My wallet']");
	private final By inputCardNumber = By.xpath("//input[@data-qa-node='numberdebitSource']");
	private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
	private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
	private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
	private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
	private final By buttonSubmitToTheCart = By.xpath("//button[@data-qa-node='submit']");
	private final By paymentDetails = By.xpath("//span[@data-qa-node='details']");
	private final By inputFirstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
	private final By inputLastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");

	/*
	 * Choose a card from the wallet
	 */
	public MobilePhoneReplenishmentPage SelectCardFromWallet(){
		driver.findElement(buttonWallet).click();
		return this;
	}

	/**
	 * @param number phone number
	 */
	public MobilePhoneReplenishmentPage enterForNumber(String number){
		driver.findElement(inputPhoneNumber).sendKeys(number);
		return this;
	}

	/**
	 * @param amount amount
	 */
	public MobilePhoneReplenishmentPage enterAmount(String amount){
		driver.findElement(inputAmount).sendKeys(amount);
		return this;
	}

	/**
	 * @param numberCard number card
	 */
	public MobilePhoneReplenishmentPage enterForCardNumber(String numberCard){
		driver.findElement(inputCardNumber).sendKeys(numberCard);
		return this;
	}

	/**
	 * @param expDate eperation date
	 */
	public MobilePhoneReplenishmentPage enterCardExpDate(String expDate){
		driver.findElement(inputCardExpDate).sendKeys(expDate);
		return this;
	}

	/**
	 * @param cvv card cvv
	 */
	public MobilePhoneReplenishmentPage enterCvv(String cvv){
		driver.findElement(inputCardCvv).sendKeys(cvv);
		return this;
	}

	public MobilePhoneReplenishmentPage enterFirstName(String firstName){
		waitElementIsVisible(driver.findElement(inputFirstName));
		driver.findElement(inputFirstName).sendKeys(firstName);
		return this;
	}

	public MobilePhoneReplenishmentPage enterLastName(String lastName){
		waitElementIsVisible(driver.findElement(inputLastName));
		driver.findElement(inputLastName).sendKeys(lastName);
		return this;
	}

	/*
	 * click button To the card
	 */
	public MobilePhoneReplenishmentPage submitToTheCard(){
		driver.findElement(buttonSubmitToTheCart).click();
		return this;
	}

	/**
	 * @param text text message Mobil top-up
	 **/
	public MobilePhoneReplenishmentPage checkPaymentDetails(String text){
		waitElementIsVisible(driver.findElement(paymentDetails));
		WebElement details = driver.findElement(paymentDetails);
		Assertions.assertEquals(text, details.getText());
		return this;
	}
}
