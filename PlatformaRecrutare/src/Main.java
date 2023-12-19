public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        DButils db = new DButils();
        db.connect();
    }
}
