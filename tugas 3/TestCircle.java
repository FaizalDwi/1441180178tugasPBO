class TestCircle {
	public static void main(String[] args) {
	//instalasi objek
	//namaClass namaObjek = new namaKonstruktor();
	
	Circle cahya = new Circle();
	Circle faizal = new Circle(30);
	Circle akbar = new Circle(70, "coklat");

	cahya.setColor("Pink");

	System.out.println("Radius = "+ cahya.getRadius() +" Color = "+cahya.getColor()+" Luas = "+cahya.getArea());
	System.out.println("Radius = "+ faizal.getRadius() +" Color = "+faizal.getColor()+" Luas = "+faizal.getArea());
	System.out.println("Radius = "+ akbar.getRadius() +" Color = "+akbar.getColor()+" Luas = "+akbar.getArea());

	}
	
}