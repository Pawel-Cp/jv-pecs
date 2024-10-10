package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean isOld;
    private int yearsInCompany;

    public Excavator() {
    }

    public boolean isOld() {
        return isOld;
    }

    public Excavator setOld(boolean old) {
        isOld = old;
        return this;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    public Excavator setYearsInCompany(int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
