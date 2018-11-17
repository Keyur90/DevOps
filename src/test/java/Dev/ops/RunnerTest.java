package Dev.ops;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class RunnerTest 
{
	public static void main(String[] args) throws InterruptedException, IOException {
        // Telling the system where to find the Chrome driver
        System.setProperty(
                "webdriver.chrome.driver","E:/DevOps/ops/src/test/repositories/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        // Open google.com
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://toolsqa.com/automation-practice-form/");

        String html = webDriver.getPageSource();

        // Printing result here.
        System.out.println(html);

        webDriver.close();
        webDriver.quit();
    }
}
