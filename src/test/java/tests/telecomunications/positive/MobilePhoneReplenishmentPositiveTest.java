package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.MobileReplenishmentTestData.*;
import static constans.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
	@Test
	public void checkIsRedirectToAuth(){
		basePage.goToUrl(MOBILE_PAYMENT_URL);
		mobilePhoneReplenishmentPage.SelectCardFromWallet();
		basePage.isAuthWidgetPresent();
	}

	@Test
	public void checkMinimumReplenishmentAmount(){
		basePage.goToUrl(MOBILE_PAYMENT_URL);
		mobilePhoneReplenishmentPage
						.enterForNumber(MOBILE_PAYMENT_PHONE_NUMBER)
						.enterAmount("2")
						.enterForCardNumber(MOBILE_PAYMENT_CARD)
						.enterCardExpDate(MOBILE_PAYMENT_EXP_DATE)
						.enterCvv(MOBILE_PAYMENT_CVV)
						.enterFirstName(MOBILE_PAYMENT_FIRST_NAME)
						.enterLastName(MOBILE_PAYMENT_LAST_NAME)
						.submitToTheCard()
						.checkPaymentDetails("1Mobile payment. Phone number +380686979712");
	}
}
