for(int i = 0; i < incomes; i++)
{
    System.out.println("Please enter Income amount: ");
    incomeValue[i] = in.nextInt();
    totalIncome += incomeValue[i];
    in.nextLine();

    System.out.println("Please enter Income type (E.g Wages): ");
    incomeType[i] = in.next();
}

for(int j = 0; j < expenses; j++)
{
    System.out.println("Please enter Expense amount: ");
    expenseValue[j] = in.nextInt();
    totalExpense += expenseValue[j];
    in.nextLine();

    System.out.println("Please enter Expense type (E.g Rent, Groceries): ");
    expenseType[j] = in.next();
}