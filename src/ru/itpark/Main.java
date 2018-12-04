package ru.itpark;

import ru.itpark.comparator.ComparatorHousePrice;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService(
                new HouseRepository()
        );
        service.add(new House(4,"z\n"));
        service.add(new House(9,"x\n"));
        service.add(new House(5,"x\n"));
        service.add(new House(7,"x\n"));
        service.add(new House(2,"y\n"));
        service.add(new House(4,"z\n"));
        service.add(new House(1,"y\n"));


        List<House> district = service.findAllByDistrict("x");
        System.out.println(district);

        System.out.println("\n");
        List<House> a = service.findAllByHousePrice(a,1,1);


        System.out.println(service.getSorted(new ComparatorHousePrice()));


    }
}

