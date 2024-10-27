import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkerBook workerBook = new WorkerBook();

        workerBook.addWorker("81234567899", "Александр", 1, 5 );
        workerBook.addWorker("89995552233", "Игорь", 2, 11 );
        workerBook.addWorker("89098087766", "Петр", 3, 16 );
        workerBook.addWorker("83432588899", "Василий", 4, 2 );
        workerBook.addWorker("89113436767", "Оксана", 5, 7 );

        List<Worker> expWorkers = workerBook.findByExperience(11);
        System.out.println("Сотрудники по указанному стажу: " + expWorkers);

        List<String> phoneNumbersWorkers = workerBook.getPhoneNumberByName("Александр");
        System.out.println("Номера телефонов сотрудников: " + phoneNumbersWorkers);

        findWorkerByNumberPerson(workerBook, 2);
        findWorkerByNumberPerson(workerBook, 3);
        findWorkerByNumberPerson(workerBook, 6);
    }

    private static void findWorkerByNumberPerson(WorkerBook workerBook, int numberPerson) {
        Worker worker = workerBook.findByNumberPerson(numberPerson);
        if(worker != null){
            System.out.println("Сотрудник с указанным табельным номером: " + worker);
        } else {
            System.out.println("Сотрудник с указанным табельным номером не был найден в справочнике");
        }
    }
}
