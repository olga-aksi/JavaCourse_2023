package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.olgaaksi.jvc.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModificationFromList() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before == 0) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      before ++;
    }
    app.getNavigationHelper().gotoEditContact();
    app.getContactHelper().fillContactForm(new ContactData("Vladimir", "Iurievich", "Babkin", "Sotnik", "Security officer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "09", "May", "1984", null), false);
    app.getContactHelper().updateContact();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before);
  }
  @Test
  public void testContactModificationFromInfo() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before == 0) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
    }
    app.getNavigationHelper().gotoContactDetails();
    app.getNavigationHelper().gotoModifyContact();
    app.getContactHelper().fillContactForm(new ContactData("iVladimir", "iIurievich", "iBabkin", "Sotnik", "Security officer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "09", "May", "1984", null), false);
    app.getContactHelper().updateContact();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before);
  }
}
