package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public BulldozerProducer() {
    }

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer());
    }
}
