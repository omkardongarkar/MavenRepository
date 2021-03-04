package MavenProject.MavenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
  
	@Test
  public void Sample()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("Http://facebook.com");
	  driver.quit();
  }
}
