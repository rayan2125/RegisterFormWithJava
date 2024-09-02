import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Button;
import java.awt.Frame;

public class HelloWorld {
    public static void main(String[] arg) {
        // NameInput data = new NameInput();
        // data.input(arg);
        InterFace btn = new InterFace();
        btn.Btn(arg);
    }
}

class NameInput {
    public static void input(String[] arg) {
        ArrayList<String> dataBase = new ArrayList<>();
        Scanner str = new Scanner(System.in);
        String fname = "Enter Your First Name:";
        String lname = "Enter Your Last Name:";
        String age = "Enter Your Age:";
        System.out.println(fname);
        String Fname = str.next();
        System.out.println(lname);
        String Lname = str.next();
        System.out.println(age);
        Integer Age = str.nextInt();

        if (Age > 24) {
            dataBase.add(Fname + Lname + Age);
            System.out.println("Name is " + " " + Fname + " " + Lname + " " + Age);
        } else {
            System.out.println("Not Allowed !!!");
        }
        System.out.println(dataBase);

    }
}

class InterFace {
    public static void Btn(String[] arg) {
        Frame frame = new Frame("AWT Button Example");
        // Create a button
        Button button = new Button("Click Me!");

        // Set the button position on the frame
        button.setBounds(150, 130, 100, 30);

        // Add the button to the frame
        frame.add(button);

        // Set the frame size and layout
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Set the frame visibility to true
        frame.setVisible(true);

    }
}