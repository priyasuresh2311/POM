package org.sample2;

public class PomDay2 extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	launchBrowser("http://www.greenstechnologys.com/");
	maxWindow();
	LoginPojoDay2 l = new LoginPojoDay2();
	javaScrollDown(l.getDown());
	javaScrollUp(l.getScrollUpNo1());
	clicking(l.getClickCertification());
	clicking(l.getSeleniumCourse());
	toGetText(l.getSeleniumPrint());
	moveElement(l.getCourses());
	moveElement(l.getJavaTraining());
	clicking(l.getCoreJavaTraining());
	javaScrollDown(l.getScrollDownAnitha());
	clicking(l.getCareers());
	javaScrollDown(l.getPrintLastLineScroll());
	javaScrollUp(l.getTestimonials());
	clicking(l.getTestimonials());
	toGetText(l.getMobileNo());
	javaScrollDown(l.getThankYou());
	javaScrollUp(l.getContactUs());
	clicking(l.getContactUs());
	toGetText(l.getPrintOurMain());
	javaScrollDown(l.getCopyRight());
	
	
	
	
}
}
