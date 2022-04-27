package stepdef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    static WebDriver driver;

    @BeforeAll
    static void setChromeDriver() {
        if (System.getProperty("os.name").equals("Linux")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I am on a cause page")
    public void goToCausePage(){
    }

    @When("I select a donation amount")
    public void selectDonation(){

    }

    @When("I fill name input field with a name")
    public void fillPaymentForm(){

    }

    @When("I click Pay")
    public void clickPay(){

    }

    @Then("I am redirected to the Payment page")
    public void iAmRedirectedToThePaymentPage() {

    }
}
