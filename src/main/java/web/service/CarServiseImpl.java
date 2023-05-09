package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("model1", 123, 2002));
        list.add(new Car("model2", 234, 2001));
        list.add(new Car("model3", 345, 2009));
        list.add(new Car("model4", 456, 2010));
        list.add(new Car("model5", 567, 2012));
        return list;
    }
}
