public class Worker {

    private String numberPhone;
    private String name;
    private int numberPerson;
    private int experience;

    public Worker(String numberPhone, String name, int numberPerson, int experience) {
        this.numberPhone = numberPhone;
        this.name = name;
        this.numberPerson = numberPerson;
        this.experience = experience;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "Номер телефона = '" + numberPhone + '\'' +
                ", Имя сотрудника = '" + name + '\'' +
                ", Табельный номер = " + numberPerson +
                ", Стаж = " + experience +
                '}';
    }
}
