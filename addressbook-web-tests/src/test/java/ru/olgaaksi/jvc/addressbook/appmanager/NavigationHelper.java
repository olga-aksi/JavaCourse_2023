package ru.olgaaksi.jvc.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {
  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new")) ) {
      return;
    }
    click(By.linkText("groups"));
  }

  public void returnHome() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }

  public void gotoContactCreation() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
            && isElementPresent(By.name("new_group")) ) {
      return;
    }
    click(By.linkText("add new"));
  }

  public void gotoContactDetails() {
    if (isElementPresent(By.name("modifiy"))) {
      return;
    }
    click(By.xpath("//img[@alt='Details']"));
  }
  public void gotoEditContact() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
            && ! isElementPresent(By.name("new_group")) ) {
      return;
    }
    click(By.xpath("//img[@alt='Edit']"));
  }
  public void gotoModifyContact() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
            && ! isElementPresent(By.name("new_group")) ) {
      return;
    }
    click(By.name("modifiy"));
  }
}
