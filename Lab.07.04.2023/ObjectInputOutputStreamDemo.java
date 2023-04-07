package IO;

import java.io.*;

class MyClass implements Serializable {
    private int myInt;
    private transient String myTransientString;

    public MyClass(int myInt, String myTransientString) {
        this.myInt = myInt;
        this.myTransientString = myTransientString;
    }

    public int getMyInt() {
        return myInt;
    }

    public String getMyTransientString() {
        return myTransientString;
    }
}

public class ObjectInputOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        // Create an instance of MyClass
        MyClass obj = new MyClass(42, "Hello, world!");

        // Serialize the object to a file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.ser"));
        out.writeObject(obj);
        out.close();

        // Deserialize the object from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.ser"));
        MyClass newObj = (MyClass) in.readObject();
        in.close();

        // Print the values of the deserialized object's fields
        System.out.println("myInt: " + newObj.getMyInt());  // Output: myInt: 42
        System.out.println("myTransientString: " + newObj.getMyTransientString());  // Output: myTransientString: null
    }
}

