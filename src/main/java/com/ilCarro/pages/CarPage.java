package com.ilCarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarPage extends BasePage{

    public CarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement pickUpPlace;

    @FindBy(id = "make")
    WebElement make;

    @FindBy(id = "year")
    WebElement yearInput;

    @FindBy(id = "model")
    WebElement modelInput;

    @FindBy(id = "fuel")
    WebElement fuelInput;

    @FindBy(id = "seats")
    WebElement seatsInput;

    @FindBy(id = "class")
    WebElement carClassInput;

    @FindBy(id = "serialNumber")
    WebElement serialNumberInput;

    @FindBy(id = "price")
    WebElement priceInput;

    @FindBy(id = "about")
    WebElement aboutInput;

    public CarPage enterCarData(String manufacture, String model, String year,
                                String fuel, String seats, String classCar,
                                String serialNumber, String price, String about) {
        typeLocation();
        type(make, manufacture);
        type(modelInput, model);
        type(yearInput, year);
        select(fuelInput, fuel);
        type(seatsInput, seats);
        type(carClassInput, classCar);
        type(serialNumberInput, serialNumber);
        type(priceInput, price);
        type(aboutInput, about);
        return this;
    }

    @FindBy(css = "div.pac-item")
    WebElement hiddenItem;

    private void typeLocation() {
        type(pickUpPlace, "Tel Aviv, Israel");
        click(hiddenItem);
    }

    @FindBy(id = "photos")
    WebElement photos;

    public CarPage uploadPhoto(String path) {
        photos.sendKeys(path);
        return this;
    }

    @FindBy(id = "//button[.='Submit']")
    WebElement submitButton;

    public CarPage clickOnSubmit() {
        click(submitButton);
        return this;
    }

    @FindBy(id = "//h2[contains(., 'added successful')]")
    WebElement addedSuccessful;

    public CarPage assertAddCar() {
        assert isElementDisplayed(addedSuccessful);
        return this;
    }
}
