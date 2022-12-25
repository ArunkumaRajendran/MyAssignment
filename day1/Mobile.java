package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("Message Sending");
	}
	public void snap() {
		// TODO Auto-generated method stub
System.out.println("Taking Screenshot");
	}
	
	public static void main(String[] args) {
		
		Mobile Mob = new Mobile();
				Mob.sendSMS();
		Mob.snap();
	}

}
