package com.nopcommerce.testsuite;

import com.nopcommerce.pages.BooksPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();

    @Test
    public void verifyPageNavigation() {
        homePage.selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(), "Books", "Page Navigated Successfully");
    }
}
