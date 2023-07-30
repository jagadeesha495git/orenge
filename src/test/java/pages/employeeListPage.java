package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeeListPage {
    WebDriver driver;
public employeeListPage(WebDriver driver) {
   this.driver=driver;
   PageFactory.initElements(driver, this); 
}

public
@FindBy(xpath = "//a[normalize-space()='Employee List']")
WebElement EmployeeList;
public
@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
WebElement searchEmployeeName;
public
@FindBy(xpath = "//button[@type='submit']")
WebElement searchButton;
public
@FindBy(xpath = "//div[@class='oxd-table-cell oxd-padding-cell'][3]")
                 //div[.='First (& Middle) Name']/../following-sibling::div
//div[@class='card-item card-body-slot']/div[1]/div/div[2]
                      //div[contains(text(),'nav')]
//div[@class='oxd-table-card-cell']/div[contains(text(),'First')]/../div[@class='data']
WebElement nameResult;
//public
//@FindBy(xpath = "//a[normalize-space()='Add Employee']")
//WebElement addEmployee;
//public
//@FindBy(xpath = "//a[normalize-space()='Add Employee']")
//WebElement addEmployee;
//public
//@FindBy(xpath = "//a[normalize-space()='Add Employee']")
//WebElement addEmployee;
//public
//@FindBy(xpath = "//a[normalize-space()='Add Employee']")
//WebElement addEmployee;
}