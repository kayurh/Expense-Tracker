import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Feature3Test 
{

    @Test
    public void testSingleInput()
    {
        int[] incomes = {1000};
        String[] incomeTypes = {"Wages"};
        int[] expenses = {500};
        String[] expenseTypes = {"Rent"};

        int[] result = IncomeExpenseTracker.collectData(incomes, incomeTypes, expenses, expenseTypes);

        assertEquals(1000, result[0], "Total income should be 1000");
        assertEquals(500, result[1], "Total expense should be 500");
        assertEquals("Wages", IncomeExpenseTracker.incomeType[0]);
        assertEquals("Rent", IncomeExpenseTracker.expenseType[0]);
    }


    @Test
    public void testMultipleInputs()
    {
        int[] incomes = {800, 1200};
        String[] incomeTypes = {"Job", "Freelance"};
        int[] expenses = {300, 200, 100};
        String[] expenseTypes = {"Rent", "Food", "Transport"};

        int[] result = IncomeExpenseTracker.collectData(incomes, incomeTypes, expenses, expenseTypes);

        assertEquals(2000, result[0], "Total income should be 800 + 1200");
        assertEquals(600, result[1], "Total expense should be 300 + 200 + 100");
        assertEquals("Freelance", IncomeExpenseTracker.incomeType[1]);
        assertEquals("Food", IncomeExpenseTracker.expenseType[1]);
    }


    @Test
    public void testZeroInput()
    {
        int[] incomes = {};
        String[] incomeTypes = {};
        int[] expenses = {};
        String[] expenseTypes = {};

        int[] result = IncomeExpenseTracker.collectData(incomes, incomeTypes, expenses, expenseTypes);

        assertEquals(0, result[0], "Total income should be 0");
        assertEquals(0, result[1], "Total expense should be 0");
    }
}