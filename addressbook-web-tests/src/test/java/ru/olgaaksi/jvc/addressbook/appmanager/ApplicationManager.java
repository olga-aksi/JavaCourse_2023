package ru.olgaaksi.jvc.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  private final Browser browser;
  public WebDriver wd;
  private ContactHelper contactHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;

  public ApplicationManager(Browser browser) {
    this.browser = browser;
  }

  public void init() {
    if (browser.equals(Browser.FIREFOX)) {
      wd = new FirefoxDriver();
    } else if (browser.equals(Browser.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(Browser.IE)) {
      wd = new InternetExplorerDriver();
    }

    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    sessionHelper.logout();
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
