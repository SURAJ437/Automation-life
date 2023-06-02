package getthescreenshot;

import java.time.LocalDateTime;

public class SystemDateAndTime {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String updatedLdt = ldt.toString().replace(':', '-');
		System.out.println(updatedLdt);
	}
}
