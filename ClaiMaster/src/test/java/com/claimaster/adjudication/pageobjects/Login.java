package com.claimaster.adjudication.pageobjects;

import org.openqa.selenium.support.FindBy;

import com.claimaster.annotations.Name;
import com.claimaster.element.Button;
import com.claimaster.element.HtmlElement;
import com.claimaster.element.TextInput;

@Name("LOGIN_HEADER")
@FindBy(className = "_2lBc-")
public class Login extends HtmlElement {

	@Name("Username")
	@FindBy(id = "email")
	private TextInput username;

	@Name("Password")
	@FindBy(id = "password")
	private TextInput password;

	@Name("SignIn")
	@FindBy(xpath = "//*[@id=\"signIn\"]/div/button/span/span")
	private Button signInapp;

	public void Logintoapplication(String Username, String Password) {
		username.click();
		username.sendKeys(Username);
		password.click();
		password.sendKeys(Password);
		signInapp.click();
	}
}
