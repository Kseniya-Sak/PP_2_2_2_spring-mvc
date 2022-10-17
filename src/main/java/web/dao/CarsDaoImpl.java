package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImpl implements CarsDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "Q2", 2015));
        cars.add(new Car("BMW", "1M", 2010));
        cars.add(new Car("Porsche", "944", 2003));
        cars.add(new Car("Renault", "25", 2018));
        cars.add(new Car("Hyundai", "Creta", 1999));

    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

}
