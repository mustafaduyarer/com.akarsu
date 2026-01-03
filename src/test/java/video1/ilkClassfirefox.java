package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ilkClassfirefox {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); driver.get("https://www.akarsukitapevi.org/goruntulu-yayinlar");
        // Sayfanın yüklenmesi için kısa bekleme
        Thread.sleep(3000);
        // Tüm iframe'leri bul
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        // En sondaki iframe'i al
        WebElement lastIframe = iframes.get(iframes.size() - 1);
        // iframe'e geç
        driver.switchTo().frame(lastIframe);
        // YouTube play butonunu bul ve tıkla
        WebElement playButton = driver.findElement(By.cssSelector("button.ytp-large-play-button")); playButton.click();
        // Ana sayfaya geri dön
        driver.switchTo().defaultContent();

        Thread.sleep(45000);
        driver.quit();

    }
}


