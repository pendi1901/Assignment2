package Mainmany;

import com.company.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Trial {
    public static class Students{
        private final int id;

        private final String name;
        public Students(int _id , String _name){

            this.id = _id;
            this.name = _name;
        }

    }
    public class Comments{
        String comment;
    }
    public static class Profs{
        int id;
        String name1;
        public Profs(int _id, String _name){
            this.id = _id;
            this.name1 = _name;
        }
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Students> S1 = new ArrayList<>();
        ArrayList<Profs> P1 = new ArrayList<>();
        System.out.println("Enter the number of profs u want to add");
        int no = sc.nextInt();
        for(int i = 0 ; i < no ; i++){
            System.out.println("Enter the Id of the Prof");
            int a = sc.nextInt();
            System.out.println("Enter the name of the Prof");
            String p = sc.nextLine();
            Profs p1 = new Profs(a,p);
            P1.add(p1);

        }
        System.out.println("Enter the number of students u want to add");
        int no1 = sc.nextInt();
        for(int i = 0 ; i < no1 ; i++){
            System.out.println("Enter the Id of the Student");
            int a = sc.nextInt();
            System.out.println("Enter the name of the Student ");
            String p = sc.nextLine();
            Students s1 = new Students(a,p);
            S1.add(s1);

        }





        while(true) {
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as instructor");
            System.out.println("2. Enter as student");
            System.out.println("3. Exit");
            int start = sc.nextInt();
            if (start == 1) {
                System.out.println("Instructors: ");
                for(int i =  0 ; i< P1.size() ; i++){
                    System.out.println(P1.get(i).id + "-" + P1.get(i).name1);

                }
                System.out.println("Choose id: ");
                int id = sc.nextInt();
                for(int i = 0 ; i< P1.size() ; i++){
                    if(id == P1.get(i).id){
                        System.out.println("Valid Id");
                        System.out.println("Welcome" + P1.get(i).name1);
                    }
                    else{
                        System.out.println("Id, not found, Enter a valid id ");
                        id =sc.nextInt();
                        for(int j = 0 ; j< P1.size() ; j++) {
                            if (id == P1.get(j).id) {
                                System.out.println("Valid Id");
                                System.out.println("Welcome" + P1.get(j).name1);
                            }
                        }
                    }
                }
                while (true) {
                    System.out.println("Welcome");
                    System.out.println("INSTRUCTOR MENU");
                    System.out.println("1. Add class material");
                    System.out.println("2. Add assessments");
                    System.out.println("3. View lecture materials");
                    System.out.println("4. View assessments");
                    System.out.println("5. Grade assessments");
                    System.out.println("6. Close assessment");
                    System.out.println("7. View comments");
                    System.out.println("8. Add comments");
                    System.out.println("9. Logout");
                }


            }
        }
    }
}
