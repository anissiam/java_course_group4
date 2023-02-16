package com.java4.project;

import java.util.Scanner;

public class Main {
    static Student[] students = new Student[5];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("1)Add Student\n2)Delete Student\n3)Update Student\n4)Search\n5)Show all\n6)exit");
        System.out.println();
        int chose = scanner.nextInt();

        switch (chose) {
            case 1:
                addStudent(students);
                break;
            case 2 :
                delete();
                break;
            case 3 :
                update();
            case 4:
                search(students);
                break;
            case 5 :
                showAll();break;
            default:
                System.exit(0);
        }
    }

    private static void update() {
        System.out.println("================Update Students====================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter student id ");
        int id = scanner.nextInt();
        for (Student student : students) {
            //System.out.println(student);
            if (student != null) {
                if (student.getId() == id) {

                    String[] majors = {"CS", "IT", "AI"};
                    System.out.println("Plz select new major");
                    for (int i = 0; i < majors.length; i++) {
                        System.out.print("{" + i + "}" + majors[i] + "  ");
                    }
                    int c = scanner.nextInt();
                    String major = "";
                    if (c == 0) {
                        major = majors[0];
                    } else if (c == 1) {
                        major = majors[1];
                    } else {
                        major = majors[2];
                    }

                    student.setMajor(major);
                    break;
                }
            }
        }
        menu();
    }

    private static void showAll() {
        System.out.println("================All Students====================");
        for(Student student : students){
            if(student!=null){
                System.out.println(student.toString());
            }
        }
        menu();
    }

    private static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================Delete Student====================");

        System.out.println("Plz enter student id ");
        int id = scanner.nextInt();
        for (Student student : students) {
            //System.out.println(student);
            if (student != null) {
                if (student.getId() == id) {
                    student = null;
                    System.out.println("Deleted");
                    break;
                }
            }
        }
        menu();
    }


    private static void search(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================Search Student====================");

        System.out.println("Plz enter student id ");
        int id = scanner.nextInt();

        for (Student student : students) {
            //System.out.println(student);
            if (student != null) {
                if (student.getId() == id) {
                    System.out.println(student.toString());
                    break;
                }
            }
        }

        menu();

    }

    private static void addStudent(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================Add Student====================");

        System.out.println("Plz enter Id");
        int id = scanner.nextInt();


        System.out.println("Plz enter name");
        String name = scanner.next();

        System.out.println("Plz enter age");
        int age = scanner.nextInt();

        String[] majors = {"CS", "IT", "AI"};
        System.out.println("Plz select major");
        for (int i = 0; i < majors.length; i++) {
            System.out.print("{" + i + "}" + majors[i] + "  ");
        }
        int c = scanner.nextInt();
        String major = "";
        if (c == 0) {
            major = majors[0];
        } else if (c == 1) {
            major = majors[1];
        } else {
            major = majors[2];
        }
        Student student = new Student(id, name, age, major);
        students[id] = student;
        menu();
    }
}
