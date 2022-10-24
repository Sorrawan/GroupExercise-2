package GroupExercise2;

public class WebDriver {
    /*
    4. Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.
     */
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void closeBrowser() {
        System.out.println("closing the browser");
    }
    void navigate(){
        System.out.println("Locate the url");
    }

    void GetScreenShot(){
        System.out.println("Take a ScreenShot");

    }
}
class ChromeDriver extends WebDriver {

    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void closeBrowser() {
        System.out.println("closing the browser");
    }
    void navigate(){
        System.out.println("Locate the url");
    }

    void GetScreenShot(){
        System.out.println("Take a ScreenShot");

    }
}

class  FireFoxDriver extends WebDriver {

    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void closeBrowser() {
        System.out.println("closing the browser");
    }
    void navigate(){
        System.out.println("Locate the url");
    }

    void GetScreenShot(){
        System.out.println("Take a ScreenShot");
    }

}

class SafariDriver extends WebDriver {

    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void closeBrowser() {
        System.out.println("closing the browser");
    }
    void navigate(){
        System.out.println("Locate the url");
    }

    void GetScreenShot(){
        System.out.println("Take a ScreenShot");

    }
}

