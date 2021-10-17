package Mainmany;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;


public class Trial {
    public static class Students{
        private final int id;
        int grade;
        private final String name;
        public Students(int _id ,  String _name){

            this.id = _id;
            this.name = _name;
        }

    }
    public static class Comments{
        String comment;
        String name;
        Date date;
        public Comments(String _comments , String _name, Date _date){
            this.comment = _comments;
            this.name = _name;
            this.date = _date;
        }
    }
    public static class Profs{
        int id;
        String name1;
        public Profs(int _id, String _name){
            this.id = _id;
            this.name1 = _name;
        }
    }
    interface Assessments {


    }
    static class Quiz implements Assessments{
        int id1;
        String question;
        int marks=1;
        String status;
        public Quiz(int _id1 , String _question  , int _marks, String _status){
            this.id1 = _id1;
            this.marks = _marks;
            this.question = _question;
            this.status = _status;
        }

    }
    static class Assignment implements Assessments{
        int id1;
        String question;
        int marks;
        String status;
        public Assignment(int _id1 , String _question  , int _marks , String _status){
            this.id1=_id1;
            this.marks = _marks;
            this.question = _question;
            this.status = _status;
        }

    }

    public static void main(String [] args) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Date date = new Date() ;
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> S1 = new ArrayList<>();
        ArrayList<Profs> P1 = new ArrayList<>();
        ArrayList<Comments> C1 = new ArrayList<>();
        ArrayList<Quiz> Q1 = new ArrayList<>();
        ArrayList<Assignment> A1 = new ArrayList<>();
        int id1 = 0;
        String name;
        System.out.println("Enter the number of profs u want to add");
        int no = sc.nextInt();
        for(int i = 0 ; i < no ; i++){
            System.out.println("Enter the Id of the Prof");
            int a = sc.nextInt();
            System.out.println("Enter the name of the Prof");
            String p = sc.next();
            Profs p1 = new Profs(a,p);
            P1.add(p1);

        }
        System.out.println("Enter the number of students u want to add");
        int no1 = sc.nextInt();
        for(int i = 0 ; i < no1 ; i++){
            System.out.println("Enter the Id of the Student");
            int a = sc.nextInt();
            System.out.println("Enter the name of the Student ");
            String p = sc.next();
            Students s1 = new Students(a,p);
            S1.add(s1);

        }




        //Main Code
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
                        name = P1.get(i).name1;
                        System.out.println("Welcome" + P1.get(i).name1);
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
                    int menu = sc.nextInt();
                    if(menu == 1) {
                        System.out.println("1.Add lecture slides");
                        System.out.println("2.Add lecture video");
                        int choice1 = sc.nextInt();
                        if (choice1 == 1) {
                            System.out.println("Enter the topic of slides ");
                            String topic = br.readLine();
                            System.out.println("Enter the number of slides");
                            int n = sc.nextInt();
                            //finish up the content part and figure out the addition to the arraylist(or whatever)
                            for (int sl = 0; sl < n; sl++) {
                                System.out.println("Content of slide " + sl + ": ");
                                String content = br.readLine();

                            }

                        }
                        else if (choice1 == 2) {
                            System.out.println("Enter the topic of video");
                            String topic = br.readLine();
                            System.out.println("Enter the filename of the video");
                            String file = br.readLine();
                            //addition of the object left

                        }
                    }
                    else if(menu == 2){
                        System.out.println("1.Add Assignment");
                        System.out.println("2.Add Quiz");

                        int choice2 = sc.nextInt();
                        if(choice2 == 1){
                            System.out.println("Enter the problem statement");
                            String prob;
                            prob = br.readLine();
                            System.out.println("Enter the max marks");
                            int marks = sc.nextInt();
                            String status  = "OPEN";
                            Assignment a1 = new Assignment(id1,prob , marks,status);
                            A1.add(a1);
                            id1++;

                        }
                        else if(choice2 == 2){
                            System.out.println("Enter the quiz question");
                            String ques =br.readLine();
                            int marks = 1;
                            String status  = "OPEN";
                            Quiz q1 = new Quiz(id,ques,marks,status);
                            Q1.add(q1);
                            id1++;

                        }

                    }
                    else if(menu ==3){

                    }
                    else if(menu ==4){
                        int count =0;
                        for(int i = 0 ; i< A1.size() ; i++){
                            System.out.println("ID: " + A1.get(i).id1 + " Assignment: " + A1.get(i).question + " " + A1.get(i).marks);
                            count++;
                        }
//                        count+=1;
                        for(int j =  0 ; j<Q1.size() ; j++){
                            System.out.println("ID:" + Q1.get(j).id1 + " Question:" + Q1.get(j).question);
                            count++;
                        }
                    }
                    else if(menu == 5){

                    }
                    else if(menu ==6){
                        System.out.println("List of open Assignments ");
                        for(int i =0 ; i<A1.size() ; i++){
                            if(A1.get(i).status.equals("OPEN")){
                                System.out.println("ID: " + A1.get(i).id1 + " Assignment " + A1.get(i).question + " Max Marks: " + A1.get(i).marks);
                            }
                        }
                        for(int i =0 ; i<Q1.size() ; i++){
                            if(Q1.get(i).status.equals("OPEN")){
                                System.out.println("ID: " + Q1.get(i).id1 + " Assignment " + Q1.get(i).question );
                            }
                        }
                        System.out.println("Enter the id of thw assignment you want to close");
                        int x =sc.nextInt();
                        for(int i = 0 ; i < A1.size()  ; i++) {
                            if (A1.get(i).id1 == x) {
                                A1.get(i).status = "CLOSED";
                            }
                        }
                        for(int i = 0 ; i < Q1.size()  ; i++) {
                            if (Q1.get(i).id1 == x) {
                                Q1.get(i).status = "CLOSED";

                            }
                        }
                        for(int i = 0 ; i < A1.size() ; i++){
                            System.out.println(A1.get(i).id1);
                            System.out.println(A1.get(i).status);

                        }
                        for(int i = 0 ; i < Q1.size() ; i++){
                            System.out.println(Q1.get(i).id1);
                            System.out.println(Q1.get(i).status);

                        }
                    }

                    else if(menu ==7){
                        for(int co = 0 ; co < C1.size() ; co++){
                            System.out.println(C1.get(co).name + " " + C1.get(co).comment + " " + C1.get(co).date);
                        }
                    }
                    else if(menu ==8){
                        System.out.println("Add comment ");
                        String comment = br.readLine();
                        Date eat = date;
                        Comments c1 = new Comments(comment , "I0" , eat);
                        C1.add(c1);
                        System.out.println(comment + " "+ "I0" + " " + eat );
                    }
                    else if(menu ==9){
                        System.out.println("Logout successfull") ;
                        break;
                    }
                }




            }
            else if(start == 2){
                for(int i = 0 ; i < S1.size() ; i++){
                    System.out.println(S1.get(i).id  + " - " + S1.get(i).name);

                }
                System.out.println("Choose id: ");
                int id = sc.nextInt();
                for(int i = 0 ; i< S1.size() ; i++){
                    if(id == S1.get(i).id){
                        System.out.println("Valid Id");
                        name = S1.get(i).name;
                        System.out.println("Welcome" + S1.get(i).name);
                    }

                }
                while(true){
                    System.out.println("STUDENT MENU");
                    System.out.println("1. View lecture materials");
                    System.out.println("2. View assessments");
                    System.out.println("3. Submit assessment");
                    System.out.println("4. View grades");
                    System.out.println("5. View comments");
                    System.out.println("6. Add comments");
                    System.out.println("7. Logout");

                    int menu = sc.nextInt();
                    if(menu == 1){


                    }
                    else if(menu ==2){
                        int count =0;
                        for(int i = 0 ; i< A1.size() ; i++){
                            System.out.println("ID: " + i + " Assignment: " + A1.get(i).question + " " + A1.get(i).marks);
                            count++;
                        }
                        count+=1;
                        for(int j =  0 ; j<Q1.size() ; j++){
                            System.out.println("ID:" + count + "Question:" + Q1.get(j).question);
                            count++;
                        }
                    }
                    else if(menu ==3){


                    }
                    else if(menu ==4){

                    }
                    else if(menu == 5){
                        for(int co = 0 ; co < C1.size() ; co++){
                            System.out.println(C1.get(co).name + " " + C1.get(co).comment);
                        }
                    }
                    else if(menu ==6 ){
                        System.out.println("Add comment ");
                        String comment = br.readLine();
                        Comments c1 = new Comments(comment , "I0" , date);
                        C1.add(c1);
                        System.out.println(comment + " "+ "I0" + " " + date );
                    }
                    else if(menu == 7){
                        System.out.println("Log out successfull");
                        break;
                    }
                }

            }
            else if(start ==3){
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("{End of Test Case}");
                break;
            }
            else{
                System.out.println("Invalid Id");

            }
        }
    }
}
