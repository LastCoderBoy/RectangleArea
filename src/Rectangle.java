import java.util.Scanner;

class Rectangle{
    public double width;
    public double length;

    Rectangle(){
        Scanner getUserData = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = getUserData.nextDouble();
        System.out.print("Enter the length: ");
        length = getUserData.nextDouble();
        System.out.println("Area: " + width*length);
    }

    public void getData(){
        Scanner getUserData = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = getUserData.nextDouble();
        System.out.print("Enter the length: ");
        length = getUserData.nextDouble();
    }

    public double computeField(){
        return width*length;
    }

    public void fieldDisplay(){
        System.out.println("Rectangle Area: " + computeField());
    }
}