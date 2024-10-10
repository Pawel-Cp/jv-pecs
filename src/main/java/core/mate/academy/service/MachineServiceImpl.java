package core.mate.academy.service;

import core.mate.academy.model.*;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        BulldozerProducer bulldozerProducer = new BulldozerProducer();
        TruckProducer truckProducer = new TruckProducer();
        ExcavatorProducer excavatorProducer = new ExcavatorProducer();

        List<? extends Machine> machines;

        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
        } else if (type == Truck.class) {
            machines = truckProducer.get();
        } else if (type == Excavator.class) {
            machines = excavatorProducer.get();
        } else {
            return List.of();
        }
        return (List<Machine>) machines;
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
