package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.common;

public class pagesnav extends common {

	static WebDriver driver =new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a")).click();
		
		driver.findElement(By.id("si_popup_email")).sendKeys("arjun_addanki007@yahoo.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("A12345@12345a");
		driver.findElement(By.xpath("//*[@id=\'new_sign_up_optim\']/div/div/div[2]/div[3]/form/button")).submit();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]")).click();
		driver.findElement(By.className("icon-camera")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\'footauto\']/app-root/app-profile-main/div/div/div[2]/app-myprofilenew/div[2]/div/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'footauto\']/app-root/app-profile-main/div/div/div[2]/app-myprofilenew/div[2]/div/div/div[2]/div[2]/button")).click();
		driver.findElement(By.className("icon-cross")).click();
		driver.findElement(By.className("user_image")).click();
		driver.findElement(By.xpath("//*[@id=\'footauto\']/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/ul/li[9]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

	

	

}
