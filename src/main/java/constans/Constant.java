package constans;

public class Constant {
	public static class TimeoutVariables{
		public static int IMPLICIT_WAIT = 5;
		public static int EXPLICIT_WAIT = 10;
	}
	public static class Urls{
		public static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile?lang=en";
		public static final String CAR_LOANS_URL = "https://next.privat24.ua/auto-credit/order?lang=en";
	}

	public static class MobileReplenishmentTestData{
		public static final String MOBILE_PAYMENT_CARD = "4006895689048337";
		public static final String MOBILE_PAYMENT_PHONE_NUMBER = "686979712";
		public static final String MOBILE_PAYMENT_EXP_DATE = "0323";
		public static final String MOBILE_PAYMENT_CVV = "480";
		public static final String MOBILE_PAYMENT_FIRST_NAME = "Peter";
		public static final String MOBILE_PAYMENT_LAST_NAME = "Edwards";
	}
}
