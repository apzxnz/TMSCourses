package homework18.thread;

import homework18.storage.StorageService;

public class InfinitySearchThread extends Thread {

    boolean isRun = true;
    StorageService storageService;
    String str;

    public InfinitySearchThread(StorageService storageService, String str) {
        this.storageService = storageService;
        this.str = str;
    }

    @Override
    public void run() {
        while (isRun) {
            try {
                System.out.println(storageService.findElementInCollection(str));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setRun(boolean run) {
        isRun = run;
    }
}
