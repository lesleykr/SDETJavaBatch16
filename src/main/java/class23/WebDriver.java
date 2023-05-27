package class23;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the
    following unimplemented behaviour: openBrowser(),
    closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface:
    ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("browser opens");
    };
    @Override
    public void closeBrowser(){
        System.out.println("browser closes");
    };
    @Override
    public void maximizeWindow(){
        System.out.println("Window is maximized");
    };
    @Override
    public void findElement(){
        System.out.println("Element is found");
    };
}

class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("browser opens");
    };
    @Override
    public void closeBrowser(){
        System.out.println("browser closes");
    };
    @Override
    public void maximizeWindow(){
        System.out.println("Window is maximized");
    };
    @Override
    public void findElement(){
        System.out.println("Element is found");
    };
}
