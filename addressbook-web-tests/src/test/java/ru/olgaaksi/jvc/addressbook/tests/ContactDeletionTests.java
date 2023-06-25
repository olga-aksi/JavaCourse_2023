package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.Test;
import ru.olgaaksi.jvc.addressbook.model.ContactData;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testsContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsContactDeletionFromEdit() {
    app.getNavigationHelper().returnHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
    }
    app.getNavigationHelper().gotoEditContact();
    app.getContactHelper().deleteContactFromEdit();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsContactDeletionNoSelection() {
    app.getNavigationHelper().returnHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
    }
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsMultipleContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    if (! app.getContactHelper().isThereAContact()
            || app.getContactHelper().contactNumber() < 3
    ) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
    }
    app.getContactHelper().selectMultipleContacts();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsAllContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    if (! app.getContactHelper().isThereAContact()
            || app.getContactHelper().contactNumber() < 2
    ) {
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
      app.getContactHelper().createContact(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985", "[none]"));
    }
    app.getContactHelper().selectAllContacts();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
}
