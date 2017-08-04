import java.util.Scanner;

//3 Abstract Classes
abstract class Shape{
  	public abstract String toString();
}


abstract class TwoDimensionalShape extends Shape{
  	public double perimeter(){return 0.0;}
  	public double area(){return 0.0;}
  	public String toString(){
	      return String.format("Area: %.2f %nPerimeter: %.2f%n", area(), perimeter());					 
	}
}

abstract class ThreeDimensionalShape extends Shape{
  	public double getVolume(){ return 0.0;}
  	public double getSurfaceArea(){ return 0.0;}
  	public String toString(){
     		return String.format("Surface area: %.2f %nVolume: %.2f", getSurfaceArea(), getVolume());
	}
}


//two dimensional shapes.

class Square extends TwoDimensionalShape{
	private double side;
	public Square(double s){
		side = s;
	}
	public double area(){
		return Math.pow(side, 2);
	}
	public double perimeter(){
		return 4*side;
	}
}

class Triangle extends TwoDimensionalShape{
	private double side1;
	private double side2;
	private double side3;
	private double heron;
	public Triangle(double s1, double s2, double s3){
		side1 = s1; side2 = s2; side3 = s3;
	}
	public double area(){
		heron = (side1 + side2 + side3)/2;
		return Math.sqrt(heron*(heron-side1)*(heron-side2)*(heron-side3));
	}
	public double perimeter(){
		return side1+side2+side3;
	}
}


//three dimensional shapes.

class Sphere extends ThreeDimensionalShape{
	private double radius;
	public Sphere(double r){
		radius = r;
	}
	public double getVolume(){
		return (4.0/3)*Math.PI * Math.pow(radius, 3);
	}
	public double getSurfaceArea(){
		return 4* Math.pow(radius, 2)* Math.PI;	
	}
}

class Cube extends ThreeDimensionalShape{
	private double side;
	public Cube(double s){
		side = s;
	}
	public double getVolume(){
		return Math.pow(side, 3);
	}
	public double getSurfaceArea(){
		return Math.pow(side, 2) * 6;
	}
}

class Tetrahedron extends ThreeDimensionalShape{
	private double side;
	public Tetrahedron(double s){
		side = s;
	}
	public double getSurfaceArea(){
		return Math.pow(side, 2) * Math.sqrt(3);
	}
	public double getVolume(){
		return Math.pow(side, 3) * (1.0/(6 *Math.sqrt(2)));
	}
}

//Driver Class
public class Driver{
public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.printf("Enter\n1)Two dimensional shape\n2)Three dimensional shape:");
	int number1 = input.nextInt();
	Shape obj;
	
	if( number1 == 1){
		System.out.printf("Enter\n1)Circle\n2)Square\n3)Triangle:");
		int number2 = input.nextInt();
		
		if(number2 == 1){
			System.out.printf("Enter radius of circle:");
			double radius = input.nextDouble();
			obj = new Circle(radius);
			System.out.print(obj.toString());
	} 
	
		if(number2 == 2){
			System.out.printf("Enter side of square:");
			double side = input.nextDouble();
			obj = new Square(side);
			System.out.print(obj.toString());
	}
	
		if(number2 == 3){
			System.out.printf("Enter side of triangle:");
			double side1 = input.nextDouble();
			System.out.printf("Enter side of triangle:");
			double side2 = input.nextDouble();
			System.out.printf("Enter side of triangle:");
			double side3 = input.nextDouble();
			obj = new Triangle(side1, side2, side3);
			System.out.print(obj.toString());
	}
		



		
	} else {
		System.out.printf("Enter\n1)Sphere\n2)Cube\n3)Tetrahedron:");
		int number3 = input.nextInt();
		
		if(number3 == 1){
			System.out.printf("Enter radius of sphere:");
			double radius = input.nextDouble();
			obj = new Sphere(radius);
			System.out.println(obj.toString());
		}
		if(number3 == 2){
			System.out.printf("Enter side of cube:");
			double side = input.nextDouble();
			obj = new Cube(side);
			System.out.print(obj.toString());
		}
		if(number3 == 3){
			System.out.printf("Enter side of tetrahedron:");
			double side = input.nextDouble();
			obj = new Tetrahedron(side);
			System.out.print(obj.toString());
	        }
	 }
    }
}
