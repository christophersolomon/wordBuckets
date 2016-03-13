import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Subatomicaura on 3/9/2016.
 */
public class main {

    public static void main(String[] args) {

        try {
            ArrayList<String> colors = new ArrayList(fillColorBucket());
            System.out.println(RandomColor(colors)); // Display the string.
        } catch (IOException ex) {
            System.out.println(ex.toString());
            System.out.println("Could not find file");
        }
    }




    public static ArrayList<String> fillColorBucket() throws FileNotFoundException {
        Scanner s = new Scanner(new File("./buckets/colors/pink.txt"));
        ArrayList list = new ArrayList();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();



        return list;
    }
    public static String RandomColor(ArrayList colors) {
        int picked =  (int)Math.floor(Math.random()*colors.size());
        return colors.get(picked).toString();
    }
    }




