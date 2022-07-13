import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.*;

public class SimpleAndroidTest {

    @Test
    public void appiumFirstTest() throws MalformedURLException {
        String testLogin = "russ_test@ro.ru";
        String testPassword = "Test1234!";

        DesiredCapabilities ds = new DesiredCapabilities();

        ds.setCapability(PLATFORM_NAME,"Android");
        ds.setCapability(DEVICE_NAME,"AndroidTestDevice");
        ds.setCapability(PLATFORM_VERSION,"11.0");
        ds.setCapability(APP_PACKAGE, "ru.russpass.tourist.dev");
        ds.setCapability(APP_ACTIVITY, "ru.russpass.tourist.ui.activity.ApplicationActivity");
        ds.setCapability("unicodeKeyboard", "true");
        ds.setCapability("resetKeyboard", "true");

        AndroidDriver ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), ds);

        MobileElement el1 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("Profile");
        el2.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el3 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.compose.ui.platform.ComposeView[1]/android.view.View/android.view.View[2]/android.widget.Button");
        el3.click();
        MobileElement email = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView");
        email.click();
        ad.getKeyboard().sendKeys("russ_test@ro.ru");
        //email.sendKeys("russ_test@ro.ru");
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement pass = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TextView");
        pass.click();
        ad.getKeyboard().sendKeys("Test1234!");
        //pass.sendKeys("Test1234!");
        MobileElement el12 = (MobileElement) ad.findElementById("ru.russpass.tourist.dev:id/btnAuth");
        el12.click();


        Assertions.assertEquals(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.TextView[3]").getText(), testLogin);

        }
}