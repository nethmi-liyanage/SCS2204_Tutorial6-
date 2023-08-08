import scala.io.StdIn._
object Labsheet7_Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter number list: ")
    val input =readLine().split(" ").map(_.toInt).toList
    println("Output : "+filterEvenNumbers(input))
  }
  def filterEvenNumbers(numbers: List[Int]): List[Int]= {
    numbers.filter(number => number % 2 == 0)
  }
}
