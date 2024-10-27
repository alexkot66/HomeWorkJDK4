import java.util.ArrayList;
import java.util.List;

/**
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */

public class WorkerBook {

    private List<Worker> workers;

    public WorkerBook() {
        workers = new ArrayList<>();
    }

    //Добавить метод добавления нового сотрудника в справочник

    public void addWorker(String numberPhone, String name, int numberPerson, int experience){
        Worker worker = new Worker(numberPhone, name, numberPerson, experience);
        workers.add(worker);
    }

    //Добавить метод, который ищет сотрудника по стажу (может быть список)

    public List<Worker> findByExperience(int experience){
        List<Worker> result = new ArrayList<>();
        for (Worker worker: workers){
            if (worker.getExperience() == experience) {
                result.add(worker);
            }
        }
        return result;
    }

    //Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)

    public List<String> getPhoneNumberByName(String name){
        List<String> phoneNumbers = new ArrayList<>();
        for (Worker worker: workers){
            if (worker.getName().equalsIgnoreCase(name) ) {
                phoneNumbers.add(worker.getNumberPhone());
            }
        }
        return phoneNumbers;
    }

    //Добавить метод, который ищет сотрудника по табельному номеру

    public Worker findByNumberPerson(int numberPerson){
        for (Worker worker: workers){
            if (worker.getNumberPerson() == numberPerson) {
                return worker;
            }
        }
        return null;
    }

}
