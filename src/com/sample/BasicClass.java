package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html/");
		WebElement VB = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[2]"));
		VB.click();
		WebElement button = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean checkbox = button.isSelected();
		System.out.println(checkbox);
		WebElement firstelement = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(firstelement.isSelected()) {
			firstelement.click();
		}
		WebElement secondelement = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(secondelement.isSelected()) {
			secondelement.click();
		}
		
	}

}
