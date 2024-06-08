import java.io.*;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list = (ArrayList<String>) deSerialObj("ser");
        System.out.println(list);

    }

    public static void serialObject(Object o, String file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }

    public static Object deSerialObj(String file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }
}
