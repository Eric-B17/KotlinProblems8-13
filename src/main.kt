//Problem 8
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserEmailId))
    println()

    fun displayAlertMessage(emailId: String) {

    }
}

//Problem 9
        val Steps = 4000
        val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
        println("Walking $Steps steps burns $caloriesBurned calories")

        val timeSpentToday = 300
        val timeSpentYesterday = 250
        val todayGreater = compare(timeSpentToday, timeSpentYesterday)


    fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
        val CaloriesBURNEDforEachStep = 0.04
        val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
        return TotalCALORIESburned
    }

    //Problem 11
    fun{
        println("City: Ankara")
        println("Low temperature: 27, High temperature: 31")
        println("Chance of rain: 82%")
        println()

        println("City: Tokyo")
        println("Low temperature: 32, High temperature: 36")
        println("Chance of rain: 10%")
        println()

        println("City: Cape Town")
        println("Low temperature: 59, High temperature: 64")
        println("Chance of rain: 2%")
        println()

        println("City: Guatemala City")
        println("Low temperature: 50, High temperature: 55")
        println("Chance of rain: 7%")
        println()

    //Problem 12
        println("Use the val keyword when the value doesn't change.")
        println("Use the var keyword when the value can change.")
        println("When you define a function, you define the parameters that can be passed to it.")
        println("When you call a function, you pass arguments for the parameters.")

    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)

    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    val firstNumber = 10
    val secondNumber = 5

    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")

    fun add(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    fun subtract(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber - secondNumber
    }

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")

    add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}
    subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun displayAlertMessage(emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}

}