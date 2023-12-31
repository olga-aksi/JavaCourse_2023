package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.olgaaksi.jvc.addressbook.model.ContactData;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactWithGroupCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testContactNoGroupCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testEmptyContactCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "", "", "", "", "", "[none]"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testNoNameContactCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testNoSurnameContactCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "Mikhaylovna", "", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testNoMiddleNameContactCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testNoPhoneContactCreation() throws Exception {
    int before = app.getContactHelper().contactNumber();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "", "", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before + 1);
  }
}
