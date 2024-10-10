package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String company;
    private int expectWorkingHours;
    private int year;

    public Bulldozer() {
    }

    public int getExpectWorkingHours() {
        return expectWorkingHours;
    }

    public Bulldozer setExpectWorkingHours(int expectWorkingHours) {
        this.expectWorkingHours = expectWorkingHours;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Bulldozer setYear(int year) {
        this.year = year;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Bulldozer setCompany(String company) {
        this.company = company;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
