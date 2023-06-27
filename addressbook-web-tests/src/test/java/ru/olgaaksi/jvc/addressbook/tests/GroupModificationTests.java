package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupModification();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());
  }
}
