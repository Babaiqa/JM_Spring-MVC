package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Service {
    private static List<Car> carsList;

    public static List<Car> createCars() {
        carsList = new ArrayList<>();
        carsList.add(new Car(1, "black", 50));
        carsList.add(new Car(2, "white", 40));
        carsList.add(new Car(3, "green", 30));
        carsList.add(new Car(4, "blue", 20));
        carsList.add(new Car(5, "red", 10));


        return carsList;
    }

    public static List<Car> selectCars(Integer ammount) {

        createCars();
        return ((ammount != null) && (ammount <= carsList.size() - 1)) ? carsList.subList(0, ammount) : carsList;
    }
}
