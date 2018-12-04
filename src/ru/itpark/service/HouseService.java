package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {

    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public void add(

            int housePrice,              //TODO: search
            String district             //TODO: search
    ) {
        House house = new House(
                housePrice,
                district);
        repository.add(house);
    }

    public List<House> findAllByDistrict(String district) {
        List<House> result = new ArrayList<House>();

        district = district.toLowerCase();
        for (House house : repository.getHouses()) {
            if (house.getDistrict().toLowerCase().contains(district)) {
                result.add(house);
            }
        }
        return result;
    }

    public int findAllByHousePrice(House[] a, int minHousePrice, int maxHousePrice) {
        ArrayList<House> result = new ArrayList<House>();

        for (House house : repository.getHouses()) {
            if (a == null || (minHousePrice < 0 || maxHousePrice < 0) || (minHousePrice > maxHousePrice)) {
                throw new IllegalArgumentException();
            }

            int start = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i].getHousePrice() >= minHousePrice) {
                    start = i;
                    break;
                }
            }

            int end = 0;
            for (int i = a.length - 1; i > 0; i--) {
                if (a[i].getHousePrice() <= maxHousePrice) {
                    end = i;
                    break;
                }
            }
            return (end - start) + 1;

        }

          return 0;
    }

    public void add(House house) {
        repository.add(house);
    }

    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = repository.getHouses();
        result.sort(comparator);

        return result;

    }
}
