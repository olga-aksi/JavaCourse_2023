package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.*;
import ru.olgaaksi.jvc.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "Mikhaylovna", "Alifanova", "Aksi", "QA engineer", "X5 Group", "Saint Petersburg, Komendantskiy 9", "+78123335566", "+79219997765", "olga.aksi@gmail.com", "14", "January", "1985"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnHome();
  }

}
