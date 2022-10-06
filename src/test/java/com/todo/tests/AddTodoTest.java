package com.todo.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todo.pages.TodoPage;
import com.todo.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
		
	}
	TodoPage todoPage;
	
	@Test
	public void iCanAddTodo( ) throws IOException {
		todoPage = new TodoPage();
		boolean text = todoPage.isElementDisplayed(TodoPage.textfield);
		Assert.assertTrue(text);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String result = todoPage.checkItem(todoPage.item1);
		Assert.assertTrue(result.contains(prop.getProperty("todo1")));
		boolean checkBox = todoPage.isCheckBoxSelected(TodoPage.checkBox);
	    Assert.assertFalse(checkBox);
	    
	}
}
