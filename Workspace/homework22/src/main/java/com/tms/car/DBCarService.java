package com.tms.car;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DBCarService {
    private final Map<Integer, Car> cars = new HashMap<Integer, Car>() {{
        put(1, new Car(1, "BMW"));
        put(2, new Car(2, "Ford"));
        put(3, new Car(3, "Lada"));
    }};


    public Collection<Car> findAllCars() {
        return cars.values();
    }

    public Car findCarById(int carId) {
        return cars.get(carId);
    }

    public void createCar(String carBrand) {
        int carId = generateCarId();
        cars.put(carId, new Car(carId, carBrand) );
    }

    public int generateCarId() {
        return cars.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
    }

    public void deleteCar(int carId) {
        cars.remove(carId);
    }

    public void updateCar(int carId, String carBrand) {
        Car car = cars.get(carId);
        car.setBrand(carBrand);
    }


}
