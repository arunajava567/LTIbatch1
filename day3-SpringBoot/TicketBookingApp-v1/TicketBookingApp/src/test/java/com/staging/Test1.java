package com.staging;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doThrow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;



//@RunWith(MockitoJUnitRunner.class) https://player.slideplayer.com/17/5292184/#
//MockBean
//InjectMocks

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class Test1 {
	
   //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks 
   MathApplication mathApplication = new MathApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;

   @Test//(expected=ArithmeticException.class)
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(calcService.add(10.0,20.0)).thenReturn(30.00);
		
      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
      
      verify(calcService).add(10.0, 20.0);
      doThrow(new ArithmeticException("invalid divide operation"))
     .when(calcService).divide(10.0,2.0);

   }
}