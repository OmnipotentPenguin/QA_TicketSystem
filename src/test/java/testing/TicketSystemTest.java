package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TicketSystem;

import junit.framework.Assert;

public class TicketSystemTest {

	@Test
	public void testChildTicket() {
		TicketSystem ticketSystem = new TicketSystem();
		String Ticket0 = ticketSystem.getTicket(0);
		String Ticket6 = ticketSystem.getTicket(6);
		String Ticket12 = ticketSystem.getTicket(12);

		Assert.assertEquals("This is a child ticket", Ticket0);
		Assert.assertEquals("This is a child ticket", Ticket6);
		Assert.assertEquals("This is a child ticket", Ticket12);
	}

	@Test
	public void testTeenageTicket() {
		TicketSystem ticketSystem = new TicketSystem();
		String Ticket13 = ticketSystem.getTicket(13);
		String Ticket16 = ticketSystem.getTicket(16);
		String Ticket19 = ticketSystem.getTicket(19);

		Assert.assertEquals("This is a teenage ticket", Ticket13);
		Assert.assertEquals("This is a teenage ticket", Ticket16);
		Assert.assertEquals("This is a teenage ticket", Ticket19);
	}

	@Test
	public void testAdultTicket() {
		TicketSystem ticketSystem = new TicketSystem();
		String Ticket20 = ticketSystem.getTicket(20);
		String Ticket45 = ticketSystem.getTicket(45);
		String Ticket64 = ticketSystem.getTicket(64);

		Assert.assertEquals("This is a adult ticket", Ticket20);
		Assert.assertEquals("This is a adult ticket", Ticket45);
		Assert.assertEquals("This is a adult ticket", Ticket64);
	}

	@Test
	public void testOAPTicket() {
		TicketSystem ticketSystem = new TicketSystem();
		String Ticket65 = ticketSystem.getTicket(65);
		String Ticket87 = ticketSystem.getTicket(87);
		String Ticket100 = ticketSystem.getTicket(100);

		Assert.assertEquals("This is a OAP ticket", Ticket65);
		Assert.assertEquals("This is a OAP ticket", Ticket87);
		Assert.assertEquals("This is a OAP ticket", Ticket100);
	}

	@Test
	public void testLegendTicket() {
		TicketSystem ticketSystem = new TicketSystem();
		String Ticket101 = ticketSystem.getTicket(101);
		String Ticket120 = ticketSystem.getTicket(120);
		String Ticket1000 = ticketSystem.getTicket(1000);

		Assert.assertEquals("This is a Legend ticket", Ticket101);
		Assert.assertEquals("This is a Legend ticket", Ticket120);
		Assert.assertEquals("This is a Legend ticket", Ticket1000);
	}

}