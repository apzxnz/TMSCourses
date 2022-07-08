package homework18.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StorageService {
    private final List<String> strings = new ArrayList<>();

    public synchronized String findElementInCollection(String str) throws InterruptedException {
        System.out.println("-- find --");
        Thread.sleep(100);
        System.out.println("++ find ++");
        Optional<String> foundStr = strings.stream()
                .filter(s -> s.equals(str))
                .findFirst();
        return foundStr.orElse(null);
    }

    public synchronized void insertOrRemoveElementInCollection(String str) throws InterruptedException {
        System.out.println("-- insert -- remove --");
        Thread.sleep(100);
        System.out.println("++ insert ++ remove ++");
        if (findElementInCollection(str) != null) {
            strings.remove(str);
        } else {
            strings.add(str);
        }
    }

    public List<String> getStrings() {
        return strings;
    }
}
