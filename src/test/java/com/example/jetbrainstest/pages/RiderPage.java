//ackage com.example.jetbrainstest.pages;

import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class RiderPage {
 private final Logger LOG= LoggerFactory.getLogger(IntellijIdeaPage.class);
WebDriver driver
 @FindBy(css = "a[data-test='button'][href='idea/buy/']")
 private WebElement downloadButton;

 private Boolean checkfDownLoadButtonIsClickadle() {
  LOG.info("Проверка активности кнопки загрузки");
  System.out.println();
  return downloadButton.isEnabled();
 }


 public IntellijIdeaPage(WebDriver driver) {
  this.driver = driver;
  PageFactory.initElements(driver, this);
 }
}