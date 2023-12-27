package com.way2automation.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {

    public static WebDriver create(String type) throws MalformedURLException {

        WebDriver driver = null;

        switch (type) {
            case "Chrome":
                String chromedriverFilePath = System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromedriverFilePath);
                ChromeOptions chrome_options = new ChromeOptions();
                //chrome_options.addArguments("Remove --disable-infobars");
                //chrome_options.addArguments("disable-popup-blocking");
                chrome_options.addArguments("--remote-allow-origins=*");
                chrome_options.addArguments("--incognito");
                driver = new ChromeDriver(chrome_options);
                SessionId sessionChome = ((ChromeDriver)driver).getSessionId();
                System.out.println("Chrome Session id: " + sessionChome.toString());
                break;
            case "Edge":
                //String edgedriverFilePath = System.getProperty("user.dir") + "/src/main/resources/Drivers/msedgedriver.exe";
                //System.setProperty("webdriver.edge.driver", edgedriverFilePath);
                EdgeOptions edge_options = new EdgeOptions();
                edge_options.addArguments("--disable-popup-blocking");
                edge_options.addArguments("--inprivate");
                //edge_options.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(edge_options);
                SessionId sessionEdge = ((EdgeDriver)driver).getSessionId();
                System.out.println("Edge Session id: " + sessionEdge.toString());
                break;
            case "Remote-Chrome":
                ChromeOptions chrome_remote_options = new ChromeOptions();
                chrome_remote_options.setCapability("se:downloadsEnabled", true);
                chrome_remote_options.addArguments("Remove --disable-infobars");
                chrome_remote_options.addArguments("disable-popup-blocking");
                chrome_remote_options.addArguments("--remote-allow-origins=*");
                //chrome_remote_options.addArguments("--headless");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chrome_remote_options);
                break;
            case "Remote-Edge":
                EdgeOptions egde_remote_options = new EdgeOptions();
                egde_remote_options.setCapability("se:downloadsEnabled", true);
                egde_remote_options.addArguments("--disable-popup-blocking");
                egde_remote_options.addArguments("--inprivate");
                //egde_remote_options.addArguments("headless");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), egde_remote_options);
                break;
        }
        return driver;
    }
}
