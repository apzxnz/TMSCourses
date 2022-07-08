package homework18;

import homework18.storage.StorageService;
import homework18.thread.InfinityInsertRemoveThread;
import homework18.thread.InfinitySearchThread;

public class Homework18Initializer {
    public static void main(String[] args) throws InterruptedException {
        Homework18Initializer homework18Initializer = new Homework18Initializer();
        homework18Initializer.startSynchronizedThreads();
    }

    private void startSynchronizedThreads() throws InterruptedException {
        StorageService storageService = new StorageService();
        InfinityInsertRemoveThread insertRemoveThread1 = new InfinityInsertRemoveThread(storageService, "test1");
        InfinityInsertRemoveThread insertRemoveThread2 = new InfinityInsertRemoveThread(storageService, "test2");
        InfinityInsertRemoveThread insertRemoveThread3 = new InfinityInsertRemoveThread(storageService, "test3");
        InfinitySearchThread searchThread1 = new InfinitySearchThread(storageService, "test1");
        InfinitySearchThread searchThread2 = new InfinitySearchThread(storageService, "test2");
        InfinitySearchThread searchThread3 = new InfinitySearchThread(storageService, "test3");

        insertRemoveThread1.start();
        insertRemoveThread2.start();
        insertRemoveThread3.start();

        searchThread1.start();
        searchThread2.start();
        searchThread3.start();

        Thread.sleep(1000);
        insertRemoveThread1.setRun(false);
        insertRemoveThread2.setRun(false);
        insertRemoveThread3.setRun(false);

        searchThread1.setRun(false);
        searchThread2.setRun(false);
        searchThread3.setRun(false);
    }
}
