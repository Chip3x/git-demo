package ru.stqa.pft.sandbox.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().creationGroup(new GroupData("test2", null, null));
    }
}
