package example;

public class PersonDto {
    private String fullName;
    private int currentAge;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "fullName='" + fullName + '\'' +
                ", currentAge=" + currentAge +
                '}';
    }
}
