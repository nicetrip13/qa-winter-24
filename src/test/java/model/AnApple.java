package model;

import java.math.BigDecimal;

public class AnApple {
    private String name = "blackPrince";
    private String variety = "winter";
    private String countryOfSelection = "netherlands";
    private BigDecimal price = BigDecimal.valueOf(2.15);
    private boolean isAppleRed = true;
    private boolean isSweetTaste = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getCountryOfSelection() {
        return countryOfSelection;
    }

    public void setCountryOfSelection(String countryOfSelection) {
        this.countryOfSelection = countryOfSelection;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isAppleRed() {
        return isAppleRed;
    }

    public void setAppleRed(boolean appleRed) {
        isAppleRed = appleRed;
    }

    public boolean isSweetTaste() {
        return isSweetTaste;
    }

    public void setSweetTaste(boolean sweetTaste) {
        isSweetTaste = sweetTaste;
    }
}

