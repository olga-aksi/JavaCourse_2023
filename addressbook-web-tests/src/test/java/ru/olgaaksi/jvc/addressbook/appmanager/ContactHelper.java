package ru.olgaaksi.jvc.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.olgaaksi.jvc.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd) {
    super(wd);
  }
  public int contactNumber;

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getContactName());
    type(By.name("middlename"), contactData.getMiddleName());
    type(By.name("lastname"), contactData.getSurname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHomePhone());
    type(By.name("mobile"), contactData.getMobilePhone());
    type(By.name("email"), contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }
  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));
    acceptAlert();
    wd.findElement(By.cssSelector("div.msgbox"));
  }
  public void deleteContactFromEdit() {
    click(By.xpath("//form[2]/input[2]"));
  }

  public void selectMultipleContacts() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input"));
    click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td/input"));
    click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td/input"));
  }

  public void selectAllContacts() {
    click(By.id("MassCB"));
  }

  public void updateContact() {
    click(By.xpath("//input[22]"));
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public void createContact(ContactData contact) {
    click(By.linkText("add new"));
    fillContactForm(contact, true);
    submitContactCreation();
    click(By.linkText("home"));
  }

  public int contactNumber() {
    return wd.findElements(By.name("selected[]")).size();
    }
}
