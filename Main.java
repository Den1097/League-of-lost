import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            list = getList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0; i <= list.size(); i++){
            System.out.println(list.get(i));
        }
    
    }
    public static ArrayList<String> getList() throws FileNotFoundException{
        File file = new File("list.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        return list;
    }
}