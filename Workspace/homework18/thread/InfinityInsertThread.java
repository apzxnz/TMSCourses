package homework18.thread;

import homework18.storage.StorageService;

public class InfinityInsertThread extends Thread {

    boolean isRun = true;
    StorageService storageService;
    String str;

    public InfinityInsertThread(StorageService storageService, String str) {
        this.storageService = storageService;
        this.str = str;
    }

    @Override
    public void run() {
        while (isRun) {
            try {
                storageService.insertElementInCollection(str);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(storageService.getStrings());
        }
    }

    public void setRun(boolean run) {
        isRun = run;
    }

}
