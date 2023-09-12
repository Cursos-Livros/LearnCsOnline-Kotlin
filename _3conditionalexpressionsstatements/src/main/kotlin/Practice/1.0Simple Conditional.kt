package Practice

/**
 * Let's get some practice with real world decision making using conditional statements. The University of Illinois is using regular frequent testing to monitor the coronavirus
 * on campus. Maybe the most important piece of data produced by coronavirus testing is the positivity rate: the percent of tests that come back positive. A high positivity rate
 * indicates community spread, and may mean that it is time to shut down the campus again.
 *
 * Your friend is fairly unconcerned about the coronavirus. They wrote the following snippet of code that uses a 10% positivity rate to decide whether to continue an in-person
 * semester. You think that is too high. (10% is fairly high.) Modify the code below to use 5% as the positivity rate threshold. When you are correct, your code should print
 * "Time to go home" if the value of the variable positivity is greater than 5%. Do not modify the value of positivity.
 */

fun main() {
    val positivity = 1

        if (positivity > 0.05) {
            println("Time go home")
        } else {
            println("On-campus activities can continue")
        }
}