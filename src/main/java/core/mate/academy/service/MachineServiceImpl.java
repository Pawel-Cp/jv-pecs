package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private TruckProducer truckProducer = new TruckProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {

        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type == Truck.class) {
            return new ArrayList<>(truckProducer.get());
        } else if (type == Excavator.class) {
            return new ArrayList<>(excavatorProducer.get());
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }

    }
}
