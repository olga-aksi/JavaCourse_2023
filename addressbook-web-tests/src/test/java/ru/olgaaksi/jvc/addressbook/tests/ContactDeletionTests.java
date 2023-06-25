package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testsContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsContactDeletionFromEdit() {
    app.getNavigationHelper().returnHome();
    app.getNavigationHelper().gotoEditContact();
    app.getContactHelper().deleteContactFromEdit();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsContactDeletionNoSelection() {
    app.getNavigationHelper().returnHome();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsMultipleContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    app.getContactHelper().selectMultipleContacts();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsAllContactDeletionFromList() {
    app.getNavigationHelper().returnHome();
    app.getContactHelper().selectAllContacts();
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().returnHome();
  }
}
