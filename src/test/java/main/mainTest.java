package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;
import pages.addEmployeePage;
import pages.employeeListPage;

public class mainTest {
	WebDriver driver;
	private String firstName;
	public loginPage basepage;
	public addEmployeePage addemployee;
	public employeeListPage employeeList;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		basepage = new loginPage(driver);
		addemployee = new addEmployeePage(driver);
		employeeList = new employeeListPage(driver);

	}

	@Test
	public void LoginPage() throws IOException, CsvException, InterruptedException {
		basepage.Username.sendKeys("Admin");
		basepage.password.sendKeys("admin123");
		basepage.loginbutton.click();
		Actions action = new Actions(driver);
		action.moveToElement(basepage.PIM).build().perform();
		basepage.PIM.click();
	}

	@Test
	public void addEmployeetest() throws IOException, CsvException, InterruptedException {
		String csvFile = "C:/Users/jagadeesha.v/eclipse-workspace/Orenge/files/data.csv";
		CSVReader reader = new CSVReader(new FileReader(csvFile));
		String[] line;
		int rowCount = 0;

		while ((line = reader.readNext()) != null) {
			if (rowCount == 0) {
				rowCount++;
				continue;
			}

            // reading employee data from the CSV file
			firstName = line[1];
			String MiddleName = line[2];
			String LastName = line[3];
			String newUserName = line[4];
			String NewPassword = line[5];
			String Confirmpassword = line[6];
			addemployee.addEmployee.click();
			addemployee.FirstName.sendKeys(firstName);
			addemployee.middleNmae.sendKeys(MiddleName);
			addemployee.lastName.sendKeys(LastName);
			Thread.sleep(2000);
			addemployee.createLogin_Radio.click();
			addemployee.createUsername.sendKeys(newUserName);
			addemployee.createPassword.sendKeys(NewPassword);
			addemployee.confirmPassword.sendKeys(Confirmpassword);
			addemployee.saveButton.click();
			Thread.sleep(2000);
			employeeList.EmployeeList.click();
			employeeList.searchEmployeeName.sendKeys(firstName);
			Thread.sleep(2000);
			employeeList.searchButton.click();
			Thread.sleep(2000);
			String name = employeeList.nameResult.getText();
			String[] fn = name.split(" ");
			String nameFromDatabase = fn[0];
			if (firstName.equals(nameFromDatabase)) {
				System.out.println("Employee added successfully for Employee " + firstName);
			} else {
				System.out.println("Aadding Employee failed for Employee " + firstName);
			}
			rowCount++;
		}
	}
}
