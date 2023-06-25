package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
  @Test
  public void testsGroupDeletionNoSelection() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().returnHome();
  }
  @Test
  public void testsMultipleGroupDeletionFromList() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectMultipleGroups();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().returnHome();
  }
}
