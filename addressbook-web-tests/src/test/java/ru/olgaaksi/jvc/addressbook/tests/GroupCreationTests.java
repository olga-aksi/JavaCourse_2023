package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
   }
   @Test
  public void testGroupNoNameCreation() {
     app.getNavigationHelper().gotoGroupPage();
     List<GroupData> before = app.getGroupHelper().getGroupList();
     app.getGroupHelper().createGroup(new GroupData("", "test2", "test3"));
     List<GroupData> after = app.getGroupHelper().getGroupList();
     Assert.assertEquals(after.size(), before.size() + 1);
   }
  @Test
  public void testGroupNoHeaderCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test1", "", "test3"));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
  @Test
  public void testGroupNoFooterCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", ""));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
  @Test
  public void testGroupAllEmptyCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("", "", ""));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
}
