package Project1_Source;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Project1_Source.P1_Source_DDT_file;

public class P1_Amazon_ProductPage {
	SoftAssert s=new SoftAssert();
	WebDriver driver;
	P1_Source_DDT_file src=new P1_Source_DDT_file();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	public static String S;
	public static List l1=new LinkedList();
	
	//Toy's Count for product search validation Search validation
	@FindBy(xpath="//a[@class='a-link-normal s-no-outline']/div[@class='a-section aok-relative s-image-square-aspect']")
	List<WebElement> toysearch;
	
	//Filter 1 "Deliver Today"
	@FindBy(xpath="//div/following-sibling::span[.='Get It Today']")
	WebElement TodayFilter;
	
	//Filter By Brand
	@FindBy(xpath="//div/following-sibling::span[.='Storio']")
	WebElement BrandFilter;
	
	//Filter By Price
	@FindBy(xpath="//span[@class='a-size-base a-color-base' and .='10% Off or more']")
	WebElement PriceFilter;
	
	//Count Element after Filters
	@FindBy(xpath="//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/child::span[1]")
	WebElement FilterCount;
	
	//Search toys Validation Method 
	public void toysearch(WebDriver driver) {
		String url=driver.getCurrentUrl();
		s.assertTrue(url.contains("toys"));
		Reporter.log("Current URL for redirected page contains the search String , Hence passed");
		int eles=toysearch.size();
		s.assertTrue(eles>0);
		FilterCount();
		//Iterator I=toysearch.iterator();
		
	}
	
	//Deliver Today Checkbox filter
	public void TodayFilter() {
		wait.until(ExpectedConditions.elementToBeClickable(TodayFilter));
		TodayFilter.click();
		s.assertTrue(TodayFilter.isSelected());
		Reporter.log("Filter Deliver Today Selected Successfully");
		FilterCount();
	}
	
	//Brand Filter
	public void BrandFilter(WebDriver driver) {
		wait.until(ExpectedConditions.elementToBeClickable(BrandFilter));
		Point p1=BrandFilter.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		
		BrandFilter.click();
		s.assertTrue(BrandFilter.isSelected());
		Reporter.log("Brand Filter selected successfully");
		FilterCount();
	}
	
	//Price Filter
	public void PriceFilter() {
		wait.until(ExpectedConditions.elementToBeClickable(PriceFilter));
		PriceFilter.click();
		s.assertTrue(PriceFilter.isSelected());
		Reporter.log("Price Filter got Selected");
		FilterCount();
		System.out.println(l1);
	}
	
	//Filter Count Method
	public void FilterCount() {
		S= FilterCount.getText();
		System.out.println("String is "+S);
		Pattern pattern = Pattern.compile("of over ([\\d,]+)");
        Matcher matcher = pattern.matcher(S);
        Pattern pattern1 = Pattern.compile("of ([\\d,]+)");
        Matcher matcher1 = pattern1.matcher(S);
        Pattern pattern2 = Pattern.compile("for ([\\d,]+)");
        Matcher matcher2 = pattern2.matcher(S);
        
        if (matcher.find()) {
            // Extract matched group and remove commas
            String numberStr = matcher.group(1).replace(",", "");
            int number = Integer.parseInt(numberStr);
            System.out.println("Extracted number: " + number);
            l1.add(number);
            
        } 
        else if(matcher1.find()) {
        	String numberStr = matcher1.group(1).replace(",", "");
            int number1 = Integer.parseInt(numberStr);
            System.out.println("Extracted number: " + number1);
            l1.add(number1);
        	
        }
        else if(matcher2.find()) {
        	String numberStr = matcher2.group(1).replace(",", "");
            int number2 = Integer.parseInt(numberStr);
            System.out.println("Extracted number: " + number2);
            l1.add(number2);
        	
        }
        else {
        	System.out.println("No Pattern Found");
        }
           
        }
	
        
       
	
	public P1_Amazon_ProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		try {
	        src.ddtfile(); // ✅ Load Excel data once
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}
		
	

}
