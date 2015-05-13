public class TestRobot
{
	public static void main(String[] args)
	{
		Asimo10 unit = new Asimo10(30, 150, 1000, 5);
		unit.CetakSpesifikasi();
		System.out.println("");
		unit.Upgrade(20);
		unit.Upgrade(25);
	}
}
