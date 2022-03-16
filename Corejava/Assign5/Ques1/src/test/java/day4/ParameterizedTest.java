package day4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@TestMethodOrder(OrderAnnotation.class)
class ParameterisedTest {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	
	@DisplayName("parameterized test case")
	@Order(value = 1)
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void test_add_two_numbers(int num1, int num2, int expected) {
		Assertions.assertEquals(expected, calculator.add(num1, num2));
	}


	@Order(value = 1)
	@DisplayName(value = "add two number test")
	@Test
	void add_two_number_test() {
		Assertions.assertAll
		(
				new Executable() {
					public void execute() throws Throwable {
						Assertions.assertEquals(31,calculator.add(30, 1));
					}
				},
				new Executable() {
					public void execute() throws Throwable {
						Assertions.assertEquals(40,calculator.add(30, 10));
					}
				},
				new Executable() {
					public void execute() throws Throwable {
						Assertions.assertEquals(30,calculator.add(20, 10));
					}
				}
		);
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

}