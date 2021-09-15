package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW M3", 280, "Best"));
        cars.add(new Car("AUDI 100", 220, "Shit"));
        cars.add(new Car("Mercedes E210", 280, "Good"));
        cars.add(new Car("Porshe Panamera", 320, "Fast"));
        cars.add(new Car("Pagani Zonda", 400, "Fantastic"));
    }

    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getCertainNumberOfCars(int number) {
        return Collections.unmodifiableList(cars.subList(0, number));
    }
}