package com.sapient.aem.model;



import static org.junit.jupiter.api.Assertions.*;



import java.time.LocalDate;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonTest {
	private Person person=null;
	@BeforeEach
	void setUp() throws Exception {
		person= new Person(552263179430L,"Deepak",LocalDate.parse("2022-05-07"),"aligarh","rtk@gmail.com",9758857799L);
	}



	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}
	@Test
	void testSetAadharCard() {
		person.setAdharCard(552263179430L);
		assertEquals(552263179430L,person.getAdharCard());
	}



	@Test
	void testInvalidSetAadharCard() {
		person.setAdharCard(6327678483909L);
		assertNotEquals(87258532768L,person.getAdharCard());
	}
	@Test
	void testGetAadharCard() {
		assertEquals(552263179430L,person.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testInvalidGetAadharCard() {
		assertNotEquals(6327678483909L,person.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testSetName() {
		person.setName("Deepak");
		assertEquals("Deepak",person.getName());
	}
	@Test
	void testInvalidSetName() {
		person.setName("ramya");
		assertNotEquals("Deepak",person.getName());
	}
	@Test
	void testGetName() {
		assertEquals("Deepak",person.getName(),"testing traineename");
	}
	@Test
	void testInvalidGetName() {
		assertNotEquals("ramya",person.getName(),"testing traineename");
	}
	@Test
	void testSetBirthdate() {
		person.setBirthdate(LocalDate.parse("2022-05-07"));
		assertEquals(LocalDate.parse("2022-05-07"),person.getBirthdate());
	}
	@Test
	void testInvalidSetBirthdate() {
		person.setBirthdate(LocalDate.parse("2000-08-19"));
		assertNotEquals(LocalDate.parse("2018-08-19"),person.getBirthdate());
	}
	@Test
	void testGetBirthdate() {
		assertEquals(LocalDate.parse("2022-05-07"),person.getBirthdate(),"testing birthdate");
	}
	@Test
	void testInvalidGetBirthdate() {
		assertNotEquals(LocalDate.parse("2000-08-19"),person.getBirthdate(),"testing birthdate");
	}
	@Test
	void testSetAddress() {
		person.setAddress("Bangalore");
		assertEquals("Bangalore",person.getAddress());
	}
	@Test
	void testInvalidSetAddress() {
		person.setAddress("Combaitore");
		assertNotEquals("Bangalore",person.getAddress());
	}
	@Test
	void testGetAddress() {
		assertEquals("Bangalore",person.getAddress(),"testing address");
	}
	@Test
	void testInvalidGetAddress() {
		assertNotEquals("Combaitore",person.getAddress(),"testing address");
	}
	@Test
	void testSetEmail() {
		person.setEmail("krithika@publicissapient.com");
		assertEquals("krithika@publicissapient.com",person.getEmail());
	}
	@Test
	void testInvalidSetEmail() {
		person.setEmail("krutha@publicissapient.com");
		assertNotEquals("krithika@publicissapient.com",person.getEmail());
	}
	@Test
	void testGetEmail() {
		assertEquals("pruthvi@publicissapient.com",person.getEmail(),"testing email");
	}
	@Test
	void testInvalidGetEmail() {
		assertNotEquals("krutha@publicissapient.com",person.getEmail(),"testing email");
	}
	@Test
	void testSetMobile() {
		person.setMobile(9724132211L);
		assertEquals(9724132211L,person.getMobile());
	}
	@Test
	void testInvalidSetMobile() {
		person.setMobile(9724132211L);
		assertNotEquals(972456342L,person.getMobile());
	}
	@Test
	void testGetMobile() {
		assertEquals(9901011721L,person.getMobile(),"testing mobile");
	}
	@Test
	void testInvalidGetMobile() {
		assertNotEquals(972456342L,person.getMobile(),"testing mobile");
	}


}