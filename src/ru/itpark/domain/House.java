package ru.itpark.domain;

public class House {

    private int housePrice;
    private String district;

    public House(int housePrice, String district) {
        this.housePrice = housePrice;
        this.district = district;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "House{" +
                "housePrice=" + housePrice +
                ", district='" + district + '\'' +
                '}';
    }
}