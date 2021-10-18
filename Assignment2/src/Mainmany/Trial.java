package Mainmany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;

public class Trial {

    //Students class(dont change anything)
    public static class Students{
        private final int id;
        private final String name;
        public Students(int _id ,  String _name){
            super();

            this.id = _id;
            this.name = _name;
        }
    }

    //Prof class (try not to change anything)
    public static class Profs{
        private final int id;
        private final String name1;
        public Profs(int _id, String _name){
            this.id = _id;
            this.name1 = _name;
        }
    }

    //Comments class (never change anything here)
    public static class Comments{
        private final String comment;
        private final String name;
        private final Date date;
        public Comments(String _comments , String _name, Date _date){
            this.comment = _comments;
            this.name = _name;
            this.date = _date;
        }
    }
    //Interface 1 material stuff
    public interface material{
        void input(String author) throws IOException;
        void display();
    }
    //Lecture Videos implemented from material
    public static class LecVids implements material {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date() ;
        private String file;
        private String name;
        private String prof;
        private Date timestamp;

        public LecVids(String _name , Date _timestamp, String _prof, String _file){
            this.file = _file;
            this.name = _name;
            this.prof = _prof;
            this.timestamp = timestamp;
        }

        @Override
        public void display(){
            System.out.println("Enter the topic of video: " + this.name);
            System.out.println("Enter filename of the video: " + this.file);
            System.out.println("Date of upload: " + this.timestamp);
            System.out.println("Uploaded by: " + this.prof);
        }

        @Override
        public void input(String author) throws IOException {
            System.out.print("Enter the topic of the video: ");
            String name = br.readLine();
            System.out.print("Enter the filename of the video: ");
            String file = br.readLine();
        }
    }

    public static class LecSlides implements material{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc =new Scanner(System.in);
        Date date = new Date() ;
        private int number;
        private String name;
        private String prof;
        private Date timestamp;

        public LecSlides(String _name , Date _timestamp, String _prof, int _number){
            this.number = _number;
            this.name = _name;
            this.prof = _prof;
            this.timestamp = timestamp;
        }

        @Override
        public void display(){
            System.out.println("Enter the topic of video: " + this.name);
            System.out.println("Enter the number of slides: " + this.number);
            System.out.println("Date of upload: " + this.timestamp);
            System.out.println("Uploaded by: " + this.prof);
        }

        @Override
        public void input(String author) throws IOException {
            System.out.print("Enter the topic of the slides: ");
            String name = br.readLine();
            System.out.print("Enter the number of slides: ");
            int number = sc.nextInt();

        }

    }

    interface Assessments {
//        void display(ArrayList<Assignment> A1);
//        void display(ArrayList<Quiz> Q1);

    }
    public static class Quiz implements Assessments {
        private final int id1;
        private final String question;
        private int marks=1;
        private String status;
        public Quiz(int _id1 , String _question  , int _marks, String _status){
            this.id1 = _id1;
            this.marks = _marks;
            this.question = _question;
            this.status = _status;
        }
    }

    public static class Assignment implements Assessments{
        private final int id1;
        private final String question;
        private final int marks;
        private String status;
        public Assignment(int _id1 , String _question  , int _marks , String _status){
            this.id1=_id1;
            this.marks = _marks;
            this.question = _question;
            this.status = _status;
        }
    }


    public static class Submissions{
        private final int id1;
        private final String question;
        private final int marks;
        private final String name;
        private final String file;
        private int grade;
        private String gradestat;

        public Submissions(int _id1 , String _question  , int _marks , String _name , String _file , int _grade, String _gradestat){
            this.id1=_id1;
            this.marks = _marks;
            this.question = _question;
            this.name = _name;
            this.file = _file;
            this.grade = _grade;
            this.gradestat = _gradestat;


        }
    }

    //Driver code
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
        ArrayList<LecSlides> Ls1 = new ArrayList<>();
        ArrayList<LecVids> Lv1 = new ArrayList<>();
        ArrayList<Submissions> Sub = new ArrayList<>();
        int id1 = 0;


        //entering the profs and teachers
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
        String name = null;
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
                        System.out.println("Welcome " + P1.get(i).name1);
                    }

                }
                while (true) {
                    System.out.println("Welcome " + name);
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
                            Date timestamp = date;
                            //finish up the content part and figure out the addition to the arraylist(or whatever)
                            for (int sl = 0; sl < n; sl++) {
                                System.out.println("Content of slide " + sl + ": ");
                                String content = br.readLine();
                                LecSlides ls1 = new LecSlides(topic , date , name , n);
                                Ls1.add(ls1);

                            }

                        }
                        else if (choice1 == 2) {
                            System.out.println("Enter the topic of video");
                            String topic = br.readLine();
                            System.out.println("Enter the filename of the video");
                            String file = br.readLine();
                            Date timestamp = date;
                            LecVids lv1 = new LecVids(topic,timestamp,name,file);
                            Lv1.add(lv1);
                            //addition of the object left
//                            LectureVid Lw1 = new LectureVid(topic ,timestamp ,name );

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
                            Quiz q1 = new Quiz(id1 ,ques,marks,status);
                            Q1.add(q1);
                            id1++;

                        }

                    }
                    else if(menu ==3){
                        for(int i = 0 ; i < Ls1.size() ; i++){
                            System.out.println("Title: " + Ls1.get(i).name);
                            //figure out the content printing
                            System.out.println("Number of Slides: " + Ls1.get(i).number);
                            System.out.println("Date of upload: " + Ls1.get(i).timestamp);
                            System.out.println("Uploaded by: " + Ls1.get(i).prof);
                        }
                        for(int i = 0 ; i < Lv1.size() ; i++){
                            System.out.println("Title of the video: " + Lv1.get(i).name);
                            System.out.println("Video file: " + Lv1.get(i).file);
                            System.out.println("Date of upload: " + Lv1.get(i).timestamp);
                            System.out.println("Uploaded by: " + Lv1.get(i).prof);
                        }
                    }
                    else if(menu ==4){

                        int count =0;
                        for(int i = 0 ; i< A1.size() ; i++){
                            System.out.println("ID: " + A1.get(i).id1 + " Assignment: " + A1.get(i).question + " " + A1.get(i).marks);
                            count++;
                        }
//                        count+=1;
                        for(int j =  0 ; j<Q1.size() ; j++){
                            System.out.println("ID: " + Q1.get(j).id1 + " Question: " + Q1.get(j).question);
                            count++;
                        }
                    }
                    else if(menu == 5){
                        System.out.println("List of Assessmnets ");
                        for(int i = 0 ; i < Sub.size() ; i++){
                            if(Sub.get(i).gradestat.equals("UNGRADED")){
                                System.out.println("ID: "+Sub.get(i).id1+ " Assignment: " + Sub.get(i).question + "Max Marsk: " + Sub.get(i).marks);

                            }
                        }
                        System.out.println("Enter the ID of assessments to view submission");
                        int x  = sc.nextInt();
                        System.out.println("Choose ID from these ungraded submissions");
                        for(int j = 0 ; j < Sub.size() ; j++){
                            if(Sub.get(j).id1 == x){
                                System.out.println((j+1)+ ". " + Sub.get(j).name);

                            }
                        }
                        String  name1 = null;
                        int choice = sc.nextInt();
                        if(choice ==0){
                            name1 = "s0";
                            for(int k = 0 ; k < Sub.size() ; k++){
                                if(Sub.get(k).id1 == x &&  Sub.get(k).name == name1 ){
                                    System.out.println("Submissions");
                                    System.out.println(Sub.get(k).file);
                                    System.out.println("Max marks: " + Sub.get(k).marks);
                                    System.out.println("Marks scored");
                                    int marks = sc.nextInt();
                                    Sub.get(k).grade = marks;
                                    Sub.get(k).gradestat = "GRADED";
                                }
                            }
                        }
                        else if(choice == 1){
                            name1 = "s1";
                            for(int k = 0 ; k < Sub.size() ; k++){
                                if(Sub.get(k).id1 == x &&  Sub.get(k).name == name1 ){
                                    System.out.println("Submissions");
                                    System.out.println(Sub.get(k).file);
                                    System.out.println("Max marks: " + Sub.get(k).marks);
                                    System.out.println("Marks scored");
                                    int marks = sc.nextInt();
                                    Sub.get(k).grade = marks;
                                    Sub.get(k).gradestat = "GRADED";
                                }
                            }

                        }
                        else if(choice==2){
                            name1 = "s2";
                            for(int k = 0 ; k < Sub.size() ; k++){
                                if(Sub.get(k).id1 == x &&  Sub.get(k).name == name1 ){
                                    System.out.println("Submissions");
                                    System.out.println(Sub.get(k).file);
                                    System.out.println("Max marks: " + Sub.get(k).marks);
                                    System.out.println("Marks scored");
                                    int marks = sc.nextInt();
                                    Sub.get(k).grade = marks;
                                    Sub.get(k).gradestat = "GRADED";
                                }
                            }

                        }
                        for(int k = 0 ; k < Sub.size() ; k++){
                            if(Sub.get(k).id1 == x &&  Sub.get(k).name == name1 ){
                                System.out.println("Submissions");
                                System.out.println(Sub.get(k).file);
                                System.out.println("Max marks: " + Sub.get(k).marks);
                                System.out.println("Marks scored");
                                int marks = sc.nextInt();
                                Sub.get(k).grade = marks;
                                Sub.get(k).gradestat = "GRADED";
                            }
                        }
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
                        System.out.println("Enter the id of the assignment you want to close");
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
                        Comments c1 = new Comments(comment , name , eat);
                        C1.add(c1);
                        System.out.println(comment + " "+ name + " " + eat );
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
                        for(int i = 0 ; i < Ls1.size() ; i++){
                            System.out.println("Title: " + Ls1.get(i).name);
                            //figure out the content printing
                            System.out.println("Number of Slides: " + Ls1.get(i).number);
                            System.out.println("Date of upload: " + Ls1.get(i).timestamp);
                            System.out.println("Uploaded by: " + Ls1.get(i).prof);
                        }
                        for(int i = 0 ; i < Lv1.size() ; i++){
                            System.out.println("Title of the video: " + Lv1.get(i).name);
                            System.out.println("Video file: " + Lv1.get(i).file);
                            System.out.println("Date of upload: " + Lv1.get(i).timestamp);
                            System.out.println("Uploaded by: " + Lv1.get(i).prof);
                        }

                    }
                    else if(menu ==2){
                        int count =0;
                        for(int i = 0 ; i< A1.size() ; i++){
                            System.out.println("ID: " + A1.get(i).id1 + " Assignment: " + A1.get(i).question + " " + A1.get(i).marks);
                            count++;
                        }
                        count+=1;
                        for(int j =  0 ; j<Q1.size() ; j++){
                            System.out.println("ID:" + Q1.get(j).id1 + "Question:" + Q1.get(j).question);
                            count++;
                        }
                    }
                    else if(menu ==3){
                        System.out.println("Pending Assignments");
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
                        System.out.println("Enter the id of the assessment");
                        int assid = sc.nextInt();
                        for(int i = 0 ; i< A1.size() ; i++){
                            if(A1.get(i).id1 == assid){
                                System.out.println("Enter the filename of the assignment");
                                String filename = br.readLine();
                                if(filename.endsWith(".zip") || filename.endsWith(".mp4")){
                                    Submissions sub1  = new Submissions(assid,A1.get(i).question, A1.get(i).marks , name ,filename,0,"UNGRADED");
                                    Sub.add(sub1);
                                }
                                else{
                                    System.out.println("Invalid format");

                                }
                            }
                            else if(Q1.get(i).id1 == assid){
                                System.out.println(Q1.get(i).question);
                                String ans  = br.readLine();
                                Submissions sub1  = new Submissions(assid ,Q1.get(i).question , Q1.get(i).marks , name , ans , 0 , "UNGARDED");
                                Sub.add(sub1);
                            }

                        }

                    }
                    else if(menu ==4){
                        System.out.println("Graded Submissions ");
                        for(int i = 0; i < Sub.size() ; i++){
                            if(Sub.get(i).name == name && Sub.get(i).gradestat == "GRADED"){
                                System.out.println("Submission: " + Sub.get(i).file);
                                System.out.println("Marks Scored: " + Sub.get(i).grade);
                            }

                        }                    }
                    else if(menu == 5){
                        for(int co = 0 ; co < C1.size() ; co++){
                            System.out.println(C1.get(co).name + " " + C1.get(co).comment);
                        }
                    }
                    else if(menu ==6 ){
                        System.out.println("Add comment ");
                        String comment = br.readLine();
                        Comments c1 = new Comments(comment , name , date);
                        C1.add(c1);
                        System.out.println(comment + " "+ name + " " + date );
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
