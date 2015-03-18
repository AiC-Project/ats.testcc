package com.zenika.aic.demo.login;

import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zenika.aic.core.automator.AiCAbstractTestCase;

public class LoginTestCase extends AiCAbstractTestCase {

	private static final String LOG_TAG = "LoginDemo";

    public LoginTestCase() {
        super("Login","aic.zenika.fr.login");
    }

    @Override
    public void setUp() throws RemoteException, UiObjectNotFoundException {
        this.runApp(appName, packageName);
    }

    @Override
    public void tearDown() throws RemoteException, UiObjectNotFoundException {
        //Empty for the moment
    }

	void clearText(UiObject editText) throws UiObjectNotFoundException {
		editText.clickBottomRight();
		while(!editText.getText().isEmpty()) {
			getUiDevice().pressDelete();
		}
	}

    public void testUS1() {
        checkLayout();
    }

    public void testUS2() {
        emptyPassword();
    }

    public void testUS3() {
        emptyUsername();
    }

    public void testUS4() {
        loginSuccess();
    }

	public void checkLayout() {
		UiObject2 usernameLabel = device.findObject(By.clazz(TextView.class.getName()).text("Username"));
		assertTrue("Username label not found", usernameLabel != null);

        UiObject2 passwordLabel = device.findObject(By.clazz(TextView.class.getName()).text("Password"));
		assertTrue("Password label not found", passwordLabel != null);

        UiObject2 loginButton = device.findObject(By.clazz(Button.class.getName()).text("Login"));
		assertTrue("Login button not found", loginButton != null);

        UiObject2 registerLabel = device.findObject(By.clazz(TextView.class.getName()).text("No account ? Click"));
		assertTrue("Register label not found", registerLabel != null);

        UiObject2 registerLink = device.findObject(By.clazz(TextView.class.getName()).text("here"));
		assertTrue("Register link not found", registerLink != null);
	}

	public void emptyPassword() {
		UiObject2 usernameInput = device.findObject(By.clazz(EditText.class.getName()).res("username_input"));
		assertTrue("Username input not found", usernameInput != null);
		usernameInput.clear();
		usernameInput.setText("SomeCorrectUsername");

		UiObject2 passwordInput = device.findObject(By.clazz(EditText.class.getName()).res("password_input"));
		assertTrue("Password input not found", passwordInput != null);
		passwordInput.clear();

		UiObject2 loginButton = device.findObject(By.clazz(Button.class.getName()).text("Login"));
		assertTrue("Login button not found", loginButton != null);
		loginButton.click();

		UiObject2 infoLabel = device.findObject(By.clazz(TextView.class.getName()).res("info"));
		assertTrue("Info label not found", infoLabel != null);
		assertTrue("Info label does not contain the right message", infoLabel.getText().equals("Password cannot be empty"));
	}

	public void emptyUsername() {
		UiObject2 usernameInput = device.findObject(By.clazz(EditText.class.getName()).res("username_input"));
		assertTrue("Username input not found", usernameInput != null);
        usernameInput.clear();

		UiObject2 passwordInput = device.findObject(By.clazz(EditText.class.getName()).res("password_input"));
		assertTrue("Password input not found", passwordInput != null);
        passwordInput.clear();
		passwordInput.setText("SomeCorrectPassword");

		UiObject2 loginButton = device.findObject(By.clazz(Button.class.getName()).text("Login"));
		assertTrue("Login button not found", loginButton != null);
		loginButton.click();

		UiObject2 infoLabel = device.findObject(By.clazz(TextView.class.getName()).res("info"));
		assertTrue("Info label not found", infoLabel != null);
		assertTrue("Info label does not contain the right message", infoLabel.getText().equals("Username cannot be empty"));
	}

	public void loginSuccess() {
		UiObject2 usernameInput = device.findObject(By.clazz(EditText.class.getName()).res("username_input"));
		assertTrue("Username input not found", usernameInput != null);
        usernameInput.clear();
		usernameInput.setText("SomeCorrectUsername");

		UiObject2 passwordInput = device.findObject(By.clazz(EditText.class.getName()).res("password_input"));
		assertTrue("Password input not found", passwordInput != null);
		passwordInput.clear();
		passwordInput.setText("SomeCorrectPassword");

		UiObject2 loginButton = device.findObject(By.clazz(Button.class.getName()).text("Login"));
		assertTrue("Login button not found", loginButton != null);

        device.waitForWindowUpdate("",5000);

		UiObject2 successMessage = device.findObject(By.clazz(TextView.class.getName()).res("info"));
		assertTrue("Success message not found", successMessage != null);
		assertTrue("Success message incorrect", successMessage.getText().equals("Successfully logged in"));
	}
}
