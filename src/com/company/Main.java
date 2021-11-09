package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner _input = new Scanner(System.in);
        ArrayList<Student> _students = new ArrayList<>();
        Student student =  new Student();
        int n;
        System.out.print("Enter the number of Students you have : ");
        n = _input.nextInt();
        System.out.print("Enter the number of units each student is taking : ");
        int number = _input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the details for student number " + (i+1));
            Student _student = new Student();
            _students.add(_student.setData(_student,_input,number));

        }
        for(int j=0;j<_students.size();j++){
            Student _student = _students.get(j);
            _student.displayData();
        }
    }
}
