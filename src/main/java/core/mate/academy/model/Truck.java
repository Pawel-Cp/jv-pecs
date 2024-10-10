package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int capacity;
    private int course;

    public Truck() {
    }

    public int getCapacity() {
        return capacity;
    }

    public Truck setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public int getCourse() {
        return course;
    }

    public Truck setCourse(int course) {
        this.course = course;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
