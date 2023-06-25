package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.Test;
import ru.olgaaksi.jvc.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModificationFromList() {
    app.getNavigationHelper().returnHome();
    app.getNavigationHelper().gotoEditContact();
    app.getContactHelper().fillContactForm(new ContactData("Vladimir", "Iurievich", "Babkin", "Sotnik", "Security officer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "09", "May", "1984"));
    app.getContactHelper().updateContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testContactModificationFromInfo() {
    app.getNavigationHelper().returnHome();
    app.getNavigationHelper().gotoContactDetails();
    app.getNavigationHelper().gotoModifyContact();
    app.getContactHelper().fillContactForm(new ContactData("iVladimir", "iIurievich", "iBabkin", "Sotnik", "Security officer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "09", "May", "1984"));
    app.getContactHelper().updateContact();
    app.getNavigationHelper().returnHome();
  }
}
