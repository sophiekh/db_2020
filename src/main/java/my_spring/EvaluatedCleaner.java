package my_spring;

public class EvaluatedCleaner implements Cleaner {

    @InjectByType
    private CleanerImpl cleaner;
    @Override
    public void clean() {
        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();
        long workTime = end - start;
        System.out.println(workTime);
    }
}
