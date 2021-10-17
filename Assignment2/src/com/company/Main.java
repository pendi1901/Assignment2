package com.company;
import java.sql.Timestamp;
import java.time.Instant;
import Mainmany.Trial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // add an interface of a quiz or the assessment
    //then make a class of the left out one

    public class Students{
        private final int id;
        int grade;
        private final String name;
        public Students(int _id , int _grade , String _name){
            this.grade = _grade;
            this.id = _id;
            this.name = _name;
        }

    }
    public static class Comments{
        String comment;
        String name;
        Timestamp stamp;
        public Comments(String _comments , String _name , Timestamp _stamp){
            this.comment = _comments;
            this.name = _name;
            this.stamp = _stamp;
        }
    }
    public class Profs{
        int id;
        public Profs(int _id){
            this.id = _id;
        }
    }




    public static void main(String[] args) {
        Timestamp instant= Timestamp.from(Instant.now());
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> S1 = new ArrayList<>();
        ArrayList<Comments> C1 = new ArrayList<>();


        while(true) {
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as instructor");
            System.out.println("2. Enter as student");
            System.out.println("3. Exit");
            int start = sc.nextInt();
            if (start == 1) {
                System.out.println("Instructors: ");
                System.out.println("I0");
                System.out.println("I1");
                System.out.println("Choose id: ");
                int id = sc.nextInt();
                if (id == 0) {
                    while (true) {
                        System.out.println("Welcome I0");
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
                                String topic = sc.next();
                                System.out.println("Enter the number of slides");
                                int n = sc.nextInt();
                                //finish up the content part and figure out the addition to the arraylist(or whatever)
                                for (int sl = 0; sl < n; sl++) {
                                    System.out.println("Content of slide " + sl + ": ");
                                    String content = sc.nextLine();

                                }

                            } else if (choice1 == 2) {
                                System.out.println("Enter the topic of video");
                                String topic = sc.nextLine();
                                System.out.println("Enter the filename of the video");
                                String file = sc.nextLine();
                                //addition of the object left

                            }
                        }
                        else if(menu == 2){
                            System.out.println("1.Add Assignment");
                            System.out.println("2.Add Quiz");
                            int choice2 = sc.nextInt();
                            if(choice2 == 1){
                                System.out.println("Enter the problem statement");
                                String prob = sc.nextLine();
                                System.out.println("Enter the max marks");
                                int marks = sc.nextInt();
                            }
                            else if(choice2 == 2){
                                System.out.println("Enter the quiz question");
                                String ques =sc.nextLine();

                            }
                        }
                        else if(menu ==3){

                        }
                        else if(menu ==4){

                        }
                        else if(menu == 5){

                        }
                        else if(menu ==6){


                        }
                        else if(menu ==7){
                            for(int co = 0 ; co < C1.size() ; co++){
                                System.out.println(C1.get(co).name + " " + C1.get(co).comment + " " + C1.get(co).stamp);
                            }
                        }
                        else if(menu ==8){
                            System.out.println("Add comment ");
                            String comment = sc.next();
                            Comments c1 = new Comments(comment , "I0", instant);
                            C1.add(c1);
                            System.out.println(comment + " " + "I0" + " " +instant);
                        }
                        else if(menu ==9){
                            break;
                        }
                    }
                } else if (id == 1) {
                    while (true) {
                        System.out.println("Welcome I1");
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

            } else if (start == 2) {
                System.out.println("Students: ");
                System.out.println("0-S0");
                System.out.println("1-S1");
                System.out.println("2-S2");
                int id = sc.nextInt();



            } else if (start == 3) {
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("{End of Test Case}");
                break;
            }
        }
    }
}
