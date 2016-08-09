package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        calcGPA(getClasses());
    }

    public static void calcGPA(char grades[]){

        double total = 0;

        for(int x = 0; x < grades.length; x++) {

            switch(grades[x]) {
                case 'A':
                    total += 4.0;
                    break;

                case 'B':
                    total += 3.0;
                    break;

                case 'C':
                    total += 2.0;
                    break;

                case 'D':
                    total += 1.0;
                    break;

                case "F":
                    total += 0.0;
                    break;

                default:
                    break;

            }
        }

        System.out.println("Your GPA is:" + total/grades.length);

        }

    public static char[] getClasses() {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of classes?");

        int classCount = in.nextInt();

        System.out.println("What grade did you get?");

        char grades[] = new char[numClasses];

        for (int x = 0; x < numClasses; x++); {
            grades[x] = in.next().toUpperCase().charAt(0);
            System.out.println("Variable stored is " + grades[x]);
        }

        in.close();

        return grades;


    }
}
