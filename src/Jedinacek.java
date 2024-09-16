import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Jedinacek {
    private static Jedinacek singletonInstance;
    String state = null;
    private Jedinacek(String s) {
        this.state = s;
    }

    public synchronized static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek(getConfig());
        }
        return singletonInstance;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String s) throws IOException {
        this.state = s;
        saveConfig(s);
    }

    public static String getConfig(){
        File file = new File("C:\\Users\\2021-e-sevcik\\IdeaProjects\\Hodiny\\myapp.cfg");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Configuration file was not found");
        }
        return sc.nextLine();
    }

    public static void saveConfig(String s) throws IOException {
        FileWriter myWriter = new FileWriter("C:\\Users\\2021-e-sevcik\\IdeaProjects\\Hodiny\\myapp.cfg");
        myWriter.write(s);
        myWriter.close();
    }

    @Override
    public String toString() {
        return "Jedinacek{" +
                "state='" + state + '\'' +
                '}';
    }
}
