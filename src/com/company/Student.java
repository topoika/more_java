package com.company;

import java.util.Scanner;

public class Student {
    String name;
    String admission_number;
    double avarage_score;
    char letter_grade;


    Student setData(Student _student, Scanner _input,int number_of_units){
        System.out.println("Enter name :");
        _student.name = _input.next();
        System.out.println("Enter admission number :");
        _student.admission_number = _input.next();
        _student.avarage_score = getScores(number_of_units,_input);
        _student.letter_grade = getLetterGrade(_student.avarage_score);
        return _student;
    }
    double getScores(int number_of_units,Scanner _input){
        double total_score = 0.0;
        double[] _scores = new double[number_of_units];
        for(int i = 0;i<number_of_units;i++){
            System.out.println("Enter the marks for unit number "+ (i+1));
            double mark = _input.nextDouble();
            _scores[i] = mark;
        }
        for(int j=0;j<number_of_units;j++){
            total_score = total_score + _scores[j];
        }
        return  total_score/number_of_units;
    }
    char getLetterGrade(double avarage_score){
        if(avarage_score>=91 && avarage_score<101){
            return 'A';
        }else if(avarage_score>=70 && avarage_score<91){
            return 'B';
        }else  if(avarage_score>=50&&avarage_score<70){
            return 'C';
        }else  if(avarage_score>=40&&avarage_score<50){
            return 'D';
        }else {
            return 'F';
        }
    }

    void displayData(){
        System.out.println("Name : "+this.name);
        System.out.println("Admission number : "+this.admission_number);
        System.out.println("Avarage score : "+this.avarage_score);
        System.out.println("Letter grade : "+this.letter_grade);
    }

}
