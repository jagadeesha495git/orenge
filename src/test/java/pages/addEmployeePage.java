package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addEmployeePage {
             WebDriver driver;
        public addEmployeePage(WebDriver driver) {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
  
        public
        @FindBy(xpath = "//a[normalize-space()='Add Employee']")
        WebElement addEmployee;
        public
        @FindBy(xpath = "//input[@placeholder='First Name']")
        WebElement FirstName;
        public
        @FindBy(xpath = "//input[@placeholder='Middle Name']")
        WebElement middleNmae;
        public
        @FindBy(xpath = "//input[@placeholder='Last Name']")
        WebElement lastName;
        public
        @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
        WebElement createLogin_Radio;
        public
        @FindBy(xpath = "//div[@class='oxd-form-row']/div/div/div/div/input[@autocomplete='off']")
        WebElement createUsername;
        public
        @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']/div/div/input[@type='password' and @autocomplete='off']")
        WebElement createPassword;
        public
        @FindBy(xpath  = "//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@type='password']")
        WebElement confirmPassword;
        public
        @FindBy(xpath = "//button[@type='submit']")
        WebElement saveButton;
}
