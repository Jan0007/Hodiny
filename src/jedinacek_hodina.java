import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class jedinacek_hodina {
    private static jedinacek_hodina singletonInstance;
    String state = null;
    private jedinacek_hodina(String s) {
        this.state = s;
    }

    public synchronized static jedinacek_hodina getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new jedinacek_hodina(getConfig());
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
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\2021-e-sevcik\\IdeaProjects\\Hodiny\\myapp.cfg");
            myWriter.write(s);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("something is wrong (probably file path) anyway here is the error" + e);
        }
    }

    @Override
    public String toString() {
        return "Jedinacek{" +
                "state='" + state + '\'' +
                '}';
    }
}
