/*
 * package fbpractise;
 * 
 * import java.io.IOException;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import org.openqa.selenium.support.ui.Select;
 * 
 * import com.XLSReader.XLSReader; import com.pom.LoginPage; import
 * com.runner.RunnerFb;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class fbpractise { public WebDriver driver = RunnerFb.driver;
 * 
 * public LoginPage lp = new LoginPage(driver);
 * 
 * @Given("user launch the facebook website") public void
 * user_launch_the_facebook_website() {
 * 
 * // driver = browserLaunch("CHrome");
 * 
 * launchURL("https://www.facebook.com/");
 * 
 * }
 * 
 * @When("user gets text information") public void user_gets_text_information()
 * { // WebElement text = driver.findElement(By.tagName("h2")); WebElement text2
 * = lp.getText(); printText(text2);
 * 
 * }
 * 
 * @When("user Enter UserNAme") public void user_Enter_UserNAme() throws
 * IOException { // WebElement email = driver.findElement(By.id("email"));
 * WebElement user = lp.getUsername(); String userinput =
 * XLSReader.particularData("login", 2, 1); input(user, userinput);
 * isEnabled(user);
 * 
 * }
 * 
 * @When("user Enter Password") public void user_Enter_Password() throws
 * IOException { // WebElement password = driver.findElement(By.id("pass"));
 * WebElement passkeyE = lp.getPassword(); String passkey =
 * XLSReader.particularData("login", 2, 2); input(passkeyE, passkey); }
 * 
 * @When("user Click Login") public void user_Click_Login() { // WebElement
 * login = driver.findElement(By.name("login"));
 * 
 * clickOnElement(lp.getLoginbtn());
 * 
 * 
 * }
 * 
 * @Then("user Returns To Login Page") public void user_Returns_To_Login_Page()
 * throws InterruptedException {
 * 
 * sleep(); navigateBack();
 * 
 * WebElement newaccount =
 * driver.findElement(By.xpath("(//a[@role='button'])[2]"));
 * clickOnElement(newaccount); sleep();
 * 
 * 
 * // WebElement newAccountClick =
 * driver.findElement(By.xpath("//span[text()='Create account']")); //
 * clickOnElement(newAccountClick); }
 * 
 * @When("user Create Account") public void user_Create_Account() throws
 * InterruptedException, IOException {
 * 
 * // WebDriverWait wait = new WebDriverWait(driver, 30);
 * 
 * WebElement firstname = driver.findElement(By.name("firstname"));
 * explicitlyWait(firstname, "visible");
 * 
 * // wait.until(ExpectedConditions.visibilityOf(firstname));
 * 
 * 
 * 
 * String name1 = XLSReader.particularData("createNewAccount", 1, 0);
 * input(firstname, name1);
 * 
 * WebElement lastname = driver.findElement(By.name("lastname")); String name2 =
 * XLSReader.particularData("createNewAccount", 1, 1); input(lastname, name2);
 * 
 * WebElement mobileno =
 * driver.findElement(By.xpath("(//input[@type='text'])[4]")); String
 * phoneNumber = XLSReader.particularData("createNewAccount", 1, 2);
 * input(mobileno, phoneNumber);
 * 
 * WebElement newpassword =
 * driver.findElement(By.xpath("(//input[@type='password'])[2]")); String
 * passKey = XLSReader.particularData("createNewAccount", 1, 3);
 * input(newpassword, passKey);
 * 
 * WebElement male = driver.findElement(By.xpath("(// input[@name='sex'])[1]"));
 * clickOnElement(male);
 * 
 * WebElement day = driver.findElement(By.xpath("//select[@id='day']")); Select
 * s = new Select(day); s.selectByValue("9");
 * 
 * WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
 * Select s1 = new Select(month); s1.selectByIndex(5);
 * 
 * WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
 * Select s2 = new Select(year); s2.selectByVisibleText("1998");
 * 
 * WebElement signup =
 * driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
 * clickOnElement(signup);
 * 
 * }
 * 
 * @When("user TakesScreenshot") public void user_TakesScreenshot() throws
 * IOException {
 * 
 * takesScreenShot();
 * 
 * }
 * 
 * 
 * }
 */