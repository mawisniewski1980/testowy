package pl.probny.composite;

public class TestClassOne {

    private String name;

    public TestClassOne() {
        setName();
    }

    public String getName() {
        return name;
    }

    private void setName() {
        this.name = getClass().getName();
    }
}
