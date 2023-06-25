package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.*;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
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
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectMultipleGroups();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().returnHome();
  }
}
