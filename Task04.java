package GroupProject3;

import java.sql.SQLOutput;

public class Task04 {
    public static void main(String[] args) {
        RemoteWebDriver[] array = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver elements : array) {
            elements.navigate();
            elements.getScreenshot();
            elements.open();
            elements.close();
            elements.getTitle();
            System.out.println("---------");
        }

    }
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void navigate() {
        System.out.println("Chrome navigate");

    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome screenshot");

    }

    @Override
    public void open() {
        System.out.println("Chrome open");
    }

    @Override
    public void close() {
        System.out.println("Chrome close");

    }

    @Override
    public String getTitle() {
        return "Chrome";
    }
}

    class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void navigate() {
        System.out.println("Firefox navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox screenshot");
    }

    @Override
    public void open() {
        System.out.println("Firefox open");
    }

    @Override
    public void close() {
        System.out.println("Firefox close");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void navigate() {
        System.out.println("Safari navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari screenshot");
    }

    @Override
    public void open() {
        System.out.println("Safari open");
    }

    @Override
    public void close() {
        System.out.println("Safari close");

    }

    @Override
    public String getTitle() {
        return "Safari";
    }
}