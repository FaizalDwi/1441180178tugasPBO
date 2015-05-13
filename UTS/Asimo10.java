class Asimo10 extends Robot {
	private int sensor;
	private int camera;

	Robot asi = new Robot();

	public Asimo10(int Inputsensor, int Inputservo, int Inputpower, int Inputcamera){
		sensor = Inputsensor;
		servo = Inputservo;
		power = Inputpower;
		camera = Inputcamera;
	}
	
	public void CetakSpesifikasi(){
		System.out.println("Jumlah Sensor Robot = " +asi.Robot());
		System.out.println("Jumlah Sensor Asimo10 = " +sensor);
		System.out.println("Jumlah Servo = " +servo);
		System.out.println("Kapasitas Power = " +power);
		System.out.println("Jumlah Kamera = "+camera);
	}

	public void Upgrade(int sensor){
		System.out.println("Asimo10 diupgrade dengan jumlah sensor = " +sensor);
	}
}