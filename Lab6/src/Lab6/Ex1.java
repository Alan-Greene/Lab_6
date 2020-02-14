package Lab6;

import java.util.Scanner;

public class Ex1 {

    static void menu(){
        System.out.println("*Calculation of Volume for Solid Objects*\n" +
                "1. Cube\n" +
                "2. Cylinder\n" +
                "3. Sphere\n" +
                "4. Exit\n" +
                "*****************************************");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = Math.PI;

        menu();
        int user_choice = in.nextInt();

        while (user_choice != 4){
            switch (user_choice){
                case 1:
                    System.out.println("You have chosen \"Cube\"!");
                    System.out.println("Please enter the length of the cube: ");
                    double cube_length = in.nextDouble();
                    double cube_volume = Math.pow(cube_length, 3);
                    System.out.printf("The volume of the Cube is: %.2f%n%n", cube_volume);

                    menu();
                    user_choice = in.nextInt();
                    break;
                case 2:
                    System.out.println("You have chosen \"Cylinder\"!");
                    System.out.println("Please enter the radius of the cylinder: ");
                    double cyl_radius = in.nextDouble();
                    System.out.println("Please enter the height of the cylinder: ");
                    double cyl_height = in.nextDouble();

                    double cyl_volume = pi * Math.pow(cyl_radius, 2) * cyl_height;
                    System.out.printf("The volume of the Cylinder is: %.2f%n%n", cyl_volume);

                    menu();
                    user_choice = in.nextInt();
                    break;
                case 3:
                    System.out.println("You have chosen \"Sphere\"!");
                    System.out.println("Please enter the radius of the Sphere: ");
                    double sphere_radius = in.nextDouble();


                    double sphere_volume = (4.0/3.0) * pi * Math.pow(sphere_radius, 3);
                    System.out.printf("The volume of the Sphere is: %.2f%n%n", sphere_volume);

                    menu();
                    user_choice = in.nextInt();
                    break;
            }



        }

    }
}
