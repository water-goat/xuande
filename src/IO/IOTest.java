package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IOTest {

    static List<Student> list=new ArrayList<>();
    public static void main(String[] args) {

        list.add(new Student("张三",22));
        list.add(new Student("李四",22));
        list.add(new Student("王五",22));
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("1.txt"));
            oos.writeObject((Object)list);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
