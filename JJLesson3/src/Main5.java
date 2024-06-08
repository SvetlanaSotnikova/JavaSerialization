import java.io.*;

public class Main5 {
    public static void main(String[] args) throws Exception {
        // MyFCs myFCs = new MyFCs("Ivan", "Ivanus", "Ivankich");
        // serialObject(myFCs, "ser");
        MyFCs myFCs = (MyFCs) deSerialObj("ser");
        System.out.println(myFCs);
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

    static class MyFCs implements Serializable {
        public String lname;
        public String fName;
        public String patronymic;

        public MyFCs(String lname, String fName, String patronymic) {
            this.lname = lname;
            this.fName = fName;
            this.patronymic = patronymic;
        }

        @Override
        public String toString() {
            return "MyFCs {" +
                    "lname='" + lname + '\'' +
                    ", fName='" + fName + '\'' +
                    ", patronymic='" + patronymic + '\'' +
                    '}';
        }
    }

}
