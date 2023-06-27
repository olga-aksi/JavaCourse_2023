package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.olgaaksi.jvc.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testsContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before == 0) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      before++;
    }
    app.getContactHelper().selectContact(0);
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before - 1);
  }

  @Test
  public void testsContactDeletionFromEdit() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before == 0) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      before++;
    }
    app.getNavigationHelper().gotoEditContact();
    app.getContactHelper().deleteContactFromEdit();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before - 1);
  }

  @Test
  public void testsContactDeletionNoSelection() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before == 0) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      before++;
    }
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before);
  }

  @Test
  public void testsMultipleContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before < 3) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      before = before + 3;
    }
    app.getContactHelper().selectMultipleContacts();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
    int after = app.getContactHelper().contactNumber();
    Assert.assertEquals(after, before - 3);
  }

  @Test
  public void testsAllContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    int before = app.getContactHelper().contactNumber();
    if (before < 2) {
      {
        app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
        app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
        app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      }
      app.getContactHelper().selectAllContacts();
      app.getContactHelper().deleteContact();
      app.getNavigationHelper().returnHome();
      int after = app.getContactHelper().contactNumber();
      Assert.assertEquals(after, 0);
    }
  }
}
