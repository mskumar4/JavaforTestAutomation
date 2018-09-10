package com.epam.testngtest;

import org.testng.annotations.DataProvider;

public class dataProviderExample {
	@DataProvider(name="AddSubtract")
    public Object[][] getDataforAddSubtract(){
    return new Object[][] 
    	{
            { 40, 60 },
            { 60, 40 },
            { -5, -9}
        };

    }
	@DataProvider(name="Multiply")
    public Object[][] getDataforMulitply(){
    return new Object[][] 
    	{
            { 40, 60 },
            { 4, 43 },
            { 0, -9},
            {-3,-4}
        };

    }
	
	@DataProvider(name="Divide")
    public Object[][] getDataforDivide(){
    return new Object[][] 
    	{
            { 40, 60 },
            { 4, 43 },
            { 0, 30},
            {-3,-4}
        };
	}
	
	@DataProvider(name="SQRT")
    public Object[] getDataforSQRT(){
    return new Object[][]
    	{
            { 16 },
            { 25 },
            {30},
            {-4}
        };
	}
	
	@DataProvider(name="Power")
    public Object[][] getDataforPower(){
    return new Object[][] 
    	{
            { 2 ,3},
            { 3 ,4},
            {10,4},
            {0,2}
        };
	}
	@DataProvider(name="Trigonometry")
    public Object[][] getDataforSinCos(){
    return new Object[][] 
    	{
            { 50 },
            { 60}
        };
	}
	
	@DataProvider(name="PositiveNegative")
    public Object[][] getDataForIsposIsNeg(){
    return new Object[][] 
    	{
            { 5},
            { 100},
            { 0},
            { -7},
            { -60}
            
        };
	}





	
}
