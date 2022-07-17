package homework18;

import homework18.storage.StorageLockService;
import homework18.storage.StorageService;
import homework18.thread.InfinityInsertThread;
import homework18.thread.InfinitySearchThread;

import java.util.concurrent.locks.ReentrantLock;

public class Homework18Initializer {
    public static void main(String[] args) throws InterruptedException {
        Homework18Initializer homework18Initializer = new Homework18Initializer();
        homework18Initializer.startSynchronizedThreads();
        homework18Initializer.startLockThreads();

    }

    public void startLockThreads() throws InterruptedException {
        StorageLockService storageService = new StorageLockService(new ReentrantLock());
        InfinityInsertThread insertThread1 = new InfinityInsertThread(storageService, "test1");
        InfinityInsertThread insertThread2 = new InfinityInsertThread(storageService, "test2");
        InfinityInsertThread insertThread3 = new InfinityInsertThread(storageService, "test3");
        InfinitySearchThread searchThread1 = new InfinitySearchThread(storageService, "test1");
        InfinitySearchThread searchThread2 = new InfinitySearchThread(storageService, "test2");
        InfinitySearchThread searchThread3 = new InfinitySearchThread(storageService, "test3");

        insertThread1.start();
        insertThread2.start();
        insertThread3.start();

        searchThread1.start();
        searchThread2.start();
        searchThread3.start();

        Thread.sleep(1000);
        insertThread1.setRun(false);
        insertThread2.setRun(false);
        insertThread3.setRun(false);

        searchThread1.setRun(false);
        searchThread2.setRun(false);
        searchThread3.setRun(false);
    }

    private void startSynchronizedThreads() throws InterruptedException {
        StorageService storageService = new StorageService();
        InfinityInsertThread insertThread1 = new InfinityInsertThread(storageService, "test1");
        InfinityInsertThread insertThread2 = new InfinityInsertThread(storageService, "test2");
        InfinityInsertThread insertThread3 = new InfinityInsertThread(storageService, "test3");
        InfinitySearchThread searchThread1 = new InfinitySearchThread(storageService, "test1");
        InfinitySearchThread searchThread2 = new InfinitySearchThread(storageService, "test2");
        InfinitySearchThread searchThread3 = new InfinitySearchThread(storageService, "test3");

        insertThread1.start();
        insertThread2.start();
        insertThread3.start();

        searchThread1.start();
        searchThread2.start();
        searchThread3.start();

        Thread.sleep(1000);
        insertThread1.setRun(false);
        insertThread2.setRun(false);
        insertThread3.setRun(false);

        searchThread1.setRun(false);
        searchThread2.setRun(false);
        searchThread3.setRun(false);
    }
}
