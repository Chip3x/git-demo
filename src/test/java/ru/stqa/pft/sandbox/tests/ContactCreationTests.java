package ru.stqa.pft.sandbox.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname","test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
}
