package com.todo.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todo.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'newTodo']")
	public static WebElement textfield; 
	@FindBy(how = How.XPATH, using = "//label[contains(text(), 'adopter de bonne pratique de test']")
	public static WebElement item1;
	@FindBy(how = How.XPATH, using = "//input[@type= 'checkbox']")
	public static WebElement checkBox;

    public void submitTodo(String text ) {
    	textfield.clear();
    	textfield.sendKeys(text);
    	textfield.sendKeys(Keys.ENTER);
    }
	
	public String checkItem(WebElement element) {
		String itemTodo = element.getText();
		return itemTodo;
	}
  
	public Boolean isElementDisplayed(WebElement elemnt) {
		Boolean isElementDisplayed = elemnt.isDisplayed();
		return isElementDisplayed;
	}
	
	public Boolean isCheckBoxSelected(WebElement elemnt) {
		return elemnt.isSelected();
	}
}
