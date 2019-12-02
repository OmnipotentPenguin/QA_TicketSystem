package main;

public class TicketSystem {

	public String getTicket(int age) {
		String result = "";
		boolean isAChild = age >= 0 && age <= 12;
		boolean isATeenager = age > 12 && age <= 19;
		boolean isAnAdult = age > 19 && age <= 64;
		boolean isAnOAP = age > 64 && age <= 100;
		boolean isALegend = age > 100;

		if (isAChild) {
			result = "This is a child ticket";
			return result;
		} else if (isATeenager) {
			result = "This is a teenage ticket";
			return result;
		} else if (isAnAdult) {
			result = "This is a adult ticket";
			return result;
		} else if (isAnOAP) {
			result = "This is a OAP ticket";
			return result;
		} else if (isALegend) {
			result = "This is a Legend ticket";
			return result;
		} else {
			return result;
		}

	}

}