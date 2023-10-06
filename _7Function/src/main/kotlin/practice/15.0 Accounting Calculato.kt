package practice

/**
 * The Accounting firm LambdaCalculator is running out of money. In the past few months, they've struggled to find new clients, and as a result they are looking at laying off staff.
 * They've hired you to build some software that fulfills the role of their accountants. As the first step, you will write some code that calculates the gross profit (total revenue
 * minus total expenses) for monthly financial reports.
 *
 * Write a function called calculateGrossProfit that takes in two IntArray parameters, the revenue for each day of a month then the expenses for each day of a month, and returns
 * the gross profit (revenues minus expenses) as an Int. You may assume that both passed arrays will be the same length.
 */

fun main() {
    println("Enter the number of days:")
    val inputDays = readLine()?.toIntOrNull() ?: 0

    val revenueReport = DoubleArray(inputDays)

    for (i in revenueReport.indices) {
        println("Enter with the Recipes of day ${i + 1}")
        val inputRecipe = readLine()?.toDoubleOrNull() ?: 0.0
        revenueReport[i] = inputRecipe
    }

    println("Recipe Relatory:")
    println(revenueReport.contentToString())

    val expenseReport = DoubleArray(inputDays)

    for (i in expenseReport.indices) {
        println("Enter with the Expense of day ${i + 1}")
        val inputRecipe = readLine()?.toDoubleOrNull() ?: 0.0
        expenseReport[i] = inputRecipe
    }

    println("Recipe Relatory:")
    println(expenseReport.contentToString())

    val result = grossProfit(revenueReport, expenseReport)

    println("Gross Profit of month: ${result}")
}

fun grossProfit(revenueReport: DoubleArray, expenseReport: DoubleArray): Double {
    val sizeReport = revenueReport.size - 1
    var sumRevenue = 0.0
    var sumExpense = 0.0
    var counter = 0

    while (counter <= sizeReport) {
        sumRevenue += revenueReport[counter]
        sumExpense += expenseReport[counter]
        counter++
    }
    return sumRevenue - sumExpense
}