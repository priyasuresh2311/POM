package org.sample2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoDay2 extends BaseClass {
public LoginPojoDay2() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
private WebElement down;

@FindBy(id="client-logo")
private WebElement scrollUpNo1;

@FindBy(xpath="//a[text()='Certifications']")
private WebElement clickCertification;

@FindBy(xpath="Course Content")
private WebElement seleniumCourse;

@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
private WebElement seleniumPrint;

@FindBy(xpath="//a[text()='COURSES']")
private WebElement courses;

@FindBy(xpath="//a[text()='Java Training ']")
private WebElement javaTraining;

@FindBy(xpath="//a[text()='Core Java Training']")
private WebElement coreJavaTraining;

@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
private WebElement scrollDownAnitha;

public WebElement getScrollDownAnitha() {
	return scrollDownAnitha;
}

public WebElement getCareers() {
	return careers;
}

public WebElement getPrintLastLineScroll() {
	return printLastLineScroll;
}

@FindBy(xpath="//a[text()='CAREERS']")
private WebElement careers;

@FindBy(xpath="//strong[text()='JAVA Course in Chennai']")
private WebElement printLastLineScroll;

@FindBy(xpath="//a[text()='TESTIMONIALS']")
private WebElement testimonials;

@FindBy(xpath="//a[text()='+91 8939 915 577 / +91 6385 149 793']")
private WebElement mobileNo;

@FindBy(xpath="(//div[@class='testimonial-section'])[12]")
private WebElement thankYou;

@FindBy(xpath="//span[@class='slicknav_icon slicknav_no-text']")
private WebElement toContact;

@FindBy(xpath="(//a[text()='Contact Us'])[2]")
private WebElement contactUs;

@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
private WebElement printOurMain;

@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
private WebElement copyRight;

public WebElement getDown() {
	return down;
}

public WebElement getScrollUpNo1() {
	return scrollUpNo1;
}

public WebElement getClickCertification() {
	return clickCertification;
}

public WebElement getSeleniumCourse() {
	return seleniumCourse;
}

public WebElement getSeleniumPrint() {
	return seleniumPrint;
}

public WebElement getCourses() {
	return courses;
}

public WebElement getJavaTraining() {
	return javaTraining;
}

public WebElement getCoreJavaTraining() {
	return coreJavaTraining;
}

public WebElement getTestimonials() {
	return testimonials;
}

public WebElement getMobileNo() {
	return mobileNo;
}

public WebElement getThankYou() {
	return thankYou;
}

public WebElement getToContact() {
	return toContact;
}

public WebElement getContactUs() {
	return contactUs;
}

public WebElement getPrintOurMain() {
	return printOurMain;
}

public WebElement getCopyRight() {
	return copyRight;
}




}
