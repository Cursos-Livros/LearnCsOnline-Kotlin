package Homework

/**
 * By combining data from a marketing platform with the results from personality tests that users have completed, we know that people with at least 500 friends are likely to be
 * extroverts, and people with less than 500 friends are likely to be introverts. Based on analysis of user-uploaded photos using computer-vision algorithms, we also know
 * that people who are extroverts are more likely to have many photos of dogs, and introverts are more likely to have many photos of cats. Market research has shown that
 * dog people are highly likely to be positively influenced by advertisements for any product that includes dogs, and similar for cat people and cats.
 *
 * For an already initialized Int variable friendsCount, if a user has more than 500 friends, print the message "Adopt a Dog Today!" and otherwise print
 * "Buy Cat Food At 20% Off".
 *
 * If you'd like to find out more about targeted advertising, you may find these articles interesting:
 *
 * Why don’t we just ban targeted advertising? (Wired) Why the obvious solution to privacy issues is to ban targeted ads, but the solution is not necessarily so simple.
 * (10–15 minutes)
 * Targeted ads: the good, the bad, the unavoidable (California Management Review) What are targeted ads, as answered through the lens of Facebook. (5–10 minutes)
 * When targeted ads feel a little too targeted (Vox) Shares a brief personal story about experience with targeted ads and the implications it can have on others.
 * (10–15 minutes)
 * The case against behavioral advertising is stacking up (TechCrunch) Presents a history of targeted and behavioral advertising, as well as recounting controversial
 * instances of it. (10-15 minutes)
 */

fun main() {
    val friendsCount: Int = 0

    if (friendsCount >= 500) {
        println("Adopt a Dog Today")
    } else {
        println("Buy Cat Food At 20% Off")
    }
}