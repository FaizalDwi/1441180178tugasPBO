//nama class circle.java
class Circle {
	
 //variable radius dan color
 //radius = double
 //color = string
	private double radius;
	private String color;
//constructor untuk class circle
 public Circle(){
	radius = 1.0;
	color = "pink";
 }
 public Circle(double r){
 	radius = r;
 	color = "pink";
 }
 public Circle(double r, String c){
 	radius = r;
 	color = c;
 }
 public double getRadius(){
 	return radius;
 }
 public String  getColor(){
 	return color;
 }
 public void setColor(String c){
 	color=c;
 }
 public void setRadius(double r){
 	radius=r;
 }
 public double getArea(){
 	return (radius*radius*Math.PI);
 }
}