import java.io.*;

public class Task12Initializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        taskSerialization();
        taskDialogParser();
    }

    public static void taskSerialization() throws IOException, ClassNotFoundException {
        String filePath = "D:/user.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        User user = new User("Alex", 24, 'М');
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        User userFromFile =  (User) ois.readObject();
        ois.close();

        System.out.println(userFromFile);
    }

    public static void taskDialogParser() throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader("D:/dialog.txt"));
        FileWriter romeo = new FileWriter("D:/romeo.txt");
        FileWriter julleta = new FileWriter("D:/julleta.txt");

        String currentLine = reader.readLine();
        FileWriter writer;

        while (currentLine != null) {
            writer = currentLine.startsWith("Julleta:") ? julleta : romeo;
            if (currentLine.startsWith("Julleta:")) {
                writer = julleta;
            } else if (currentLine.startsWith("Romeo:")) {
                writer = romeo;
            }
            writer.write(currentLine);
            currentLine = reader.readLine();
        }

        reader.close();
        julleta.close();
        romeo.close();

    }
}

