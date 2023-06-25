package ru.olgaaksi.jvc.addressbook.tests;

import org.testng.annotations.*;
import ru.olgaaksi.jvc.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
   }
   @Test
  public void testGroupNoNameCreation() {
     app.getNavigationHelper().gotoGroupPage();
     app.getGroupHelper().initGroupCreation();
     app.getGroupHelper().fillGroupForm(new GroupData("", "test2", "test3"));
     app.getGroupHelper().submitGroupCreation();
     app.getGroupHelper().returnToGroupPage();
   }
  @Test
  public void testGroupNoHeaderCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1","", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }
  @Test
  public void testGroupNoFooterCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1","test2", ""));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }
  @Test
  public void testGroupAllEmptyCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("","", ""));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }
}
