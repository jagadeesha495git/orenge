package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
     WebDriver driver;
    public loginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

		public
        @FindBy(xpath = "//input[@placeholder='Username']")
        WebElement Username;
        public
        @FindBy(xpath = "//input[@placeholder='Password']")   //span[normalize-space()='PIM']
        WebElement password;
        public
        @FindBy(xpath = "//button[@type='submit']")
        WebElement loginbutton;
        public
        @FindBy(xpath = "//span[normalize-space()='PIM']")  
        WebElement PIM;
    }
