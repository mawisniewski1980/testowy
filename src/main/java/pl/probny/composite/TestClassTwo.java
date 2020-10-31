package pl.probny.composite;

public class TestClassTwo {

    private String name;

    public TestClassTwo() {
        setName();
    }

    public String getName() {
        return name;
    }

    private void setName() {
        this.name = getClass().getName();
    }
}
