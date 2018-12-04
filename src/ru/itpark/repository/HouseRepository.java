package ru.itpark.repository;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {

    private List<House> houses = new ArrayList<House>();
    public void add(House house){houses.add(house);}
    public List<House>getHouses() {return houses;}

    public List<House> getAll() {
        return houses;
    }

//    private void add(House item) {
//        houses.add(item);}
//
//    public List<House> getAll() {return items;}
}
