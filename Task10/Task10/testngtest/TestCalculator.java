package com.epam.testngtest;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;



@Listeners(ListenerExample.class)	
public class TestCalculator {
	
	Calculator calc;
	private double exp;
	boolean isActual, isExp;
	private double act;


	@BeforeTest(groups={"Initial"})
	public void setUp(){
		calc=new Calculator();
		String log4jConfigFile = System.getProperty("user.dir")+"/src/Resources/"+ File.separator + "log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
        
	}
	@Test(groups={"AddSubtract"}, dataProvider="AddSubtract", dataProviderClass=dataProviderExample.class)
	public void verifyAdd(double firstNum, double secondNum){
		System.out.println(firstNum);
		act=calc.sum(firstNum, secondNum);
		exp=firstNum+secondNum;
		/*if (act==exp){
			logger.assertLog(true, "addition of "+firstNum+"and "+secondNum+" passed");
		}
		*/
		Assert.assertEquals(act,exp);
	}
	
	@Test(groups={"AddSubtract"}, dataProvider="AddSubtract", dataProviderClass=dataProviderExample.class)
	public void verifySub(double firstNum, double secondNum){
		act=calc.sub(firstNum,secondNum);
		exp=firstNum-secondNum;
		/*if (act==exp){
			logger.assertLog(true, "subtraction of "+firstNum+"and "+secondNum+" passed");
		}*/
		Assert.assertEquals(act,exp);
	}
	
	@Test(groups={"DividePrereq"},dataProvider="Divide", dataProviderClass=dataProviderExample.class)
		public void SecondNumNotZero(double firstNum, double secondNum){
				Assert.assertNotEquals(secondNum, 0);
				Assert.assertNotEquals(secondNum, 0.0);
		}
	@Test(groups={"Divide"},dependsOnGroups= {"DividePrereq"},dataProvider="Divide", dataProviderClass=dataProviderExample.class)
	public void verifyDivision(double firstNum, double secondNum){
		act=calc.div(firstNum, secondNum);
		exp=firstNum/secondNum;
		Assert.assertEquals(act,exp);
	}
	@Test(groups={"Mulitply"},dataProvider="Multiply", dataProviderClass=dataProviderExample.class)
	public void verifyMultiply(double firstNum, double secondNum){
		act=calc.div(firstNum, secondNum);
		exp=firstNum*secondNum;
		Assert.assertEquals(act,exp);
	}
	@Test(groups={"NegativePositiveNums"},dataProvider="PositiveNegative", dataProviderClass=dataProviderExample.class)
	public void verifyIsNegative(long num){
		isActual=calc.isNegative(num);
		if (num<0){
			isExp=true;
		}else{
			isExp=false;
		}
		Assert.assertEquals(isActual,isExp);
	}
	@Test(groups={"NegativePositiveNums"},dataProvider="PositiveNegative", dataProviderClass=dataProviderExample.class)
	public void verifyIsPositive(long num){
		isActual=calc.isPositive(num);
		if (num<=0){
			isExp=false;
		}else{
			isExp=true;
		}
		Assert.assertEquals(isActual,isExp);
		
	}
	
	@Test(groups={"PowerSQT"},dataProvider="Power", dataProviderClass=dataProviderExample.class)
	public void verifyPower(double firstNum, double secondNum){
		act=calc.pow(firstNum, secondNum);
		for (int cntr=1;cntr<=secondNum;cntr++){
			exp=exp*firstNum;
		}
		Assert.assertEquals(act,exp);
	
	}
	@Test(groups={"PowerSQT"},dataProvider="SQRT", dataProviderClass=dataProviderExample.class)
	public void verifysqrt(double num){
		act=calc.sqrt(num);
		exp=Math.sqrt(num);
		Assert.assertEquals(act,exp);	
	}
	@Test(groups={"Trigonometry"},dataProvider="Trigonometry", dataProviderClass=dataProviderExample.class)
	public void verifySin(double num){
		act=calc.sin(num);
		exp=Math.sin(num);
		Assert.assertEquals(act,exp);	
	}
	@Test(groups={"Trigonometry"},dataProvider="Trigonometry", dataProviderClass=dataProviderExample.class)
	public void verifyCos(double num){
		act=calc.cos(num);
		exp=Math.cos(num);
		Assert.assertEquals(act,exp);	
	}
	
	@AfterMethod
	public void tearDown(){
		//
	}
}