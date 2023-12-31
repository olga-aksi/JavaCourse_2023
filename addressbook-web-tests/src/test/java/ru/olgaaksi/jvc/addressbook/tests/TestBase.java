package ru.olgaaksi.jvc.addressbook.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.olgaaksi.jvc.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(Browser.FIREFOX);

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
    app.stop();
  }

}
