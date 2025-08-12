package bitmanuplation;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class bm20 {
     public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", "path/to/app.apk");

        AndroidDriver<MobileElement> driver =
            new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        // Example: click a button
        driver.findElementById("com.example:id/button").click();

        driver.quit();
    }
}
