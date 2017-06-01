import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ff_google {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println("Done!");
	}

}
