package  com.aus;

import java.io.*;

public class Serialization_Deserialization implements Serializable {
    public static void main(String[] args)  {
        Emp e1 = new Emp(1,"Uma",20);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream("obj.ser");
            outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(e1);
            outputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Serialization Completed");
        System.out.println("==Deserialization stated ====");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("obj.ser");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Emp deEmp = (Emp) objectInputStream.readObject();
            System.out.println(deEmp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialization Completed");



    }
}
