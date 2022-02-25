package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceIml {

    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("BMW", "Black", 11000000));
        list.add(new Car("Mers", "Grin", 13000000));
        list.add(new Car("Chetirka", "Blu", 230000));
        list.add(new Car("Priora", "White", 460000));
        list.add(new Car("RR", "Black", 46000000));
    }

    public List<Car> getCar(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
