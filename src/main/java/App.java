import java.io.FileWriter;

class App {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("output.html");
            file.write("<h1>Hello Jenkins</h1>");
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}