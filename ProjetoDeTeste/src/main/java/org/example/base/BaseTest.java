package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public String driverPath;
    public String url;

    public WebDriver driver;

    @BeforeClass
    public void preCond(){
        url = System.getProperty("user.dir") +
                "\\src\\main\\resources\\paginaDeTest.html";
        driver = new EdgeDriver();
        driver.get( url );
        driver.manage().window().maximize();
    }
    protected WebDriver getDriver(){
        return driver;
    }

}
