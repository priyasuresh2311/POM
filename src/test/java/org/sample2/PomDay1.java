package org.sample2;

public class PomDay1 extends BaseClass{
	public static void main(String[] args) {
		launchBrowser("https://www.facebook.com/");
		maxWindow();
		LoginPojo l = new LoginPojo();
		toSendKeys(l.getTxtEmail(), "Priya");
		toSendKeys(l.getTxtpass(), "selenium@123");
		clicking(l.getBtnLogin());
	}
}
