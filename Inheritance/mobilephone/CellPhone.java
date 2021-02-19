package mobilephone;

class Mobile {
	private long phone_no;
	private long imie_no;

	public Mobile(long phone_no, long imie_no) {
		this.phone_no = phone_no;
		this.imie_no = imie_no;
	}
	public Mobile(long imie_no) {
		this.imie_no = imie_no;
	}
	//Getter
	public long getPhone_no() {
		return phone_no;
	}
	//Setter
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public long getImie_no() {
		return imie_no;
	}

	public void setImie_no(long imie_no) {
		this.imie_no = imie_no;
	}

	public void call(String a) {
		System.out.println("Incoming: " + a);
	}

	public void sms(String a) {
		System.out.println("Hello Dear: " + a);
	}

	public void saveContact(String a) {
		System.out.println("Save Contact: " + a);
	}

	public String details() {
		return "Phone number:" + phone_no + "\n IMIE number:" + imie_no;
	}
}

class SmartPhone extends Mobile {
	private long mac_no = 445645;

	public void getMac_no() {
		System.out.println("Mac Number: " + mac_no);
	}

	public SmartPhone(long phone, long imie) {
		super(phone, imie);
	}

	public void play(String a) {
		System.out.println("MUSIC IS:" + a);
	}

	public void capture(String a) {
		System.out.println("Capture:" + a);
	}
}

public class CellPhone {
	public static void main(String args[]) {
		Mobile m = new Mobile(123456);
		m.setPhone_no(123456789);
		System.out.println(m.details());
		m.call("Home Calling");
		m.sms("RAJU");
		m.saveContact("Contact Saved");
		System.out.println("***********************************");

		SmartPhone s = new SmartPhone(987654321, 1234567);
		s.getMac_no();
		s.call("Home Calling");
		s.sms("Raju");
		s.play("ON");
		System.out.println(s.details());

	}

}
