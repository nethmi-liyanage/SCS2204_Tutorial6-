import scala.io.StdIn._
object Labsheet7_Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter number list: ")
    val input = readLine().split(" ").map(_.toInt).toList
    println("Output : "+calculateSquare(input))
  }
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }
}