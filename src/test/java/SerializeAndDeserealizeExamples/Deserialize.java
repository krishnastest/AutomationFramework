package SerializeAndDeserealizeExamples;

import java.io.*;

import static SerializeAndDeserealizeExamples.Serialize.SerializeToFile;

public class Deserialize {
    public static Object DeSerializeFromFileToObject(String fileName)
    {
        try {

            // Step 1: Create a file input stream to read the serialized content
            // of rectangle class from the file
            FileInputStream fileStream = new FileInputStream("Rectangle.json");

            // Step 2: Create an object stream from the file stream. So that the content
            // of the file is converted to the Rectangle Object instance
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);

            // Step 3: Read the content of the stream and convert it into object
            Object deserializeObject = objectStream.readObject();

            // Step 4: Close all the resources
            objectStream.close();
            fileStream.close();

            // return the deserialized object
            return deserializeObject;

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(18, 78);
        SerializeToFile(rect, "rectSerialized");

        Rectangle deSerializedRect = (Rectangle) DeSerializeFromFileToObject("rectSerialized");
        System.out.println("Rect area is " + deSerializedRect.Area());
    }
}
