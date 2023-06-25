package ru.olgaaksi.jvc.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.olgaaksi.jvc.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  private WebDriver wd;
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillContactForm(ContactData contactData) {
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
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }
  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));
    acceptAlert();
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
}
