package homework13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class UserService {

    public Collection<User> findUsersByName(String name, Collection<User> users) {
        ArrayList<User> resultCollection = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equals(name)) {
                resultCollection.add(user);
            }
        }
        return resultCollection;
    }

    public Collection<User> findUsersBySex(char sex, Collection<User> users) {
        ArrayList<User> resultCollection = new ArrayList<>();
        for (User user : users) {
            if (user.getSex() == sex) {
                resultCollection.add(user);
            }
        }
        return resultCollection;
    }

    public Collection<User> sortUsersByAge(Collection<User> users) {
        return users.stream().sorted(User::compareTo).collect(Collectors.toList());
    }
}
