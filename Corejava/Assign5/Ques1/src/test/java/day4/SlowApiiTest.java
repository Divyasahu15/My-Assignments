package day4;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SlowApiiTest {


  class MathsApi {

	private MathsApi api;
	
	@BeforeEach
	void setUp() throws Exception {
		api=new MathsApi();
	}


	@Test
	void is_Even_test() {
		Assertions.assertTrue(api.isEven(20));
	}
	
	private BooleanSupplier isEven(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@AfterEach
	void tearDown() throws Exception {
		api=null;
	}


}
}

