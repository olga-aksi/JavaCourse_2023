package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
   }
   @Test
  public void testGroupNoNameCreation() {
     app.getNavigationHelper().gotoGroupPage();
     int before = app.getGroupHelper().getGroupCount();
     app.getGroupHelper().createGroup(new GroupData("", "test2", "test3"));
     int after = app.getGroupHelper().getGroupCount();
     Assert.assertEquals(after, before + 1);
   }
  @Test
  public void testGroupNoHeaderCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", "", "test3"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testGroupNoFooterCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", ""));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }
  @Test
  public void testGroupAllEmptyCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("", "", ""));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }
}
