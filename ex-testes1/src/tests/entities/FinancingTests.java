package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Financing financing = new Financing(totalAmaount, income, months);
		
		Assertions.assertEquals(totalAmaount, financing.getTotalAmount());
		Assertions.assertEquals(income, financing.getIncome());
		Assertions.assertEquals(months, financing.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 20;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Financing(totalAmaount, income, months);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		Double totalAmaountUpdated = 80000.0;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Financing f= new Financing(totalAmaount, income, months);
		f.setTotalAmount(totalAmaountUpdated);
		
		Assertions.assertEquals(totalAmaountUpdated, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Double totalAmaountUpdated = 200000.0;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f= new Financing(totalAmaount, income, months);
			f.setTotalAmount(totalAmaountUpdated);
		});
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		Double incomeUpdated = 7000.0;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Financing f= new Financing(totalAmaount, income, months);
		f.setIncome(incomeUpdated);
		
		Assertions.assertEquals(incomeUpdated, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Double incomeUpdated = 1000.0;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f= new Financing(totalAmaount, income, months);
			f.setIncome(incomeUpdated);
		});
	}
	
	@Test
	public void setMonthShouldSetDataWhenValidData() {
		
		int monthsUpdated = 100;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Financing f= new Financing(totalAmaount, income, months);
		f.setMonths(monthsUpdated);
		
		Assertions.assertEquals(monthsUpdated, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		int monthsUpdated = 50;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f= new Financing(totalAmaount, income, months);
			f.setMonths(monthsUpdated);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		Double entry = 20000.0;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Financing f= new Financing(totalAmaount, income, months);
		
		Assertions.assertEquals(entry, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		Double quota = 1000.0;
		Double totalAmaount = 100000.0;
		Double income = 2000.0;
		int months = 80;
		
		Financing f= new Financing(totalAmaount, income, months);
		
		Assertions.assertEquals(quota, f.quota());
	}
}
