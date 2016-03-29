
public class Circle {

	
	private double radius;
	private double pi = Math.PI;
	
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	
	public double getRadius(){
		return radius;
	}
	
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	
	public double getArea(){
		double area = pi * Math.pow(radius, 2);
		return area;
	}
	
	
	
	public double getDiameter(){
		double diameter = radius * 2;
		return diameter;
	}
	
	
	public double getCircumference(){
		double circ = 2*pi*radius;
		return circ;
	}
}
