package ru.stqa.pft.sandbox.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactform(new ContactData("test_name","test_surname",null),false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnHomePage();

    }

}
