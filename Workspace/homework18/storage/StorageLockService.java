package homework18.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class StorageLockService extends StorageService {
    private final List<String> strings = new ArrayList<>();
    private Lock lock;

    public StorageLockService(Lock lock) {
        this.lock = lock;
    }

    @Override
    public String findElementInCollection(String str) throws InterruptedException {
        lock.lock();
        System.out.println("-- find --");
        Thread.sleep(100);
        System.out.println("++ find ++");
        String foundStr = strings.stream()
                .filter(s -> s.equals(str))
                .findFirst().orElse(null);
        lock.unlock();
        return foundStr;
    }

    @Override
    public synchronized void insertElementInCollection(String str) throws InterruptedException {
        lock.lock();
        System.out.println("-- insert --");
        Thread.sleep(100);
        System.out.println("++ insert ++");
        strings.add(str);
        lock.unlock();
    }

    public List<String> getStrings() {
        return strings;
    }
}
