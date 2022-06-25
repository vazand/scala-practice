package example

object Opstrings extends App {

  /*  its wrong but how?
  def horMirror(strng: String): String = strng
    .split("\\n")
    .map(_.reverse)
    .fold("")((x, y) => x + "\n" + y)
    .replaceFirst("\n", "")
    .reverse
  def vertMirror(strng: String): String = strng
    .split("\\n")
    .map(_.reverse)
    .fold("")((x, y) => x + "\n" + y)
    .replaceFirst("\n", "")

  def oper(f: String => String, s: String): String = f(s) */
  /* its correct ok .. but how?
  def horMirror(strng: String): String = {
    strng.split("\\n").reverse.mkString("\n")
  }
  def vertMirror(strng: String): String = {
    strng.split("\\n").map(x => x.reverse).mkString("\n")
  }
  def oper(f: String => String, s: String): String =
    f(s)

   */
  val str = "abcd\nefgh\nijkl\nmnop"
  

}

object LongestKata extends App {

  def longest(s1: String, s2: String): String = (s1 + s2).toSet.mkString.sorted

  println(longest("aretheyhere", "yestheyarehere"))

}

/* object Katas extends App {

  def grow(xs: List[Long]): Long = xs.fold(1.toLong)(_ * _)

  def grow2(xs: List[Int]): Unit = {
    var sum = 1
    var res = 0
    for ( i <- xs ) {
      sum = sum * i
      res = sum
      sum = res


    }
  }
  val l = List[Int](1,2,3,4)
  println(grow2(l))

  //def multiply(n: Int): Int = if( n %2 == 0 ) n*8 else n*9

  def orderedCount(chars: String): Any = {
    // Implement me!
    chars.groupBy(identity).mapValues(_.length()).toList
    for(i <- chars)yield{
      for (j <- chars.distinct)yield{
          if(j == i) print(i)
      }
      println()
    }

  }
  println(orderedCount("hello"))


    def arrayDiff(a: Seq[Int], b: Seq[Int]):Seq[Int] = {
    // Your code here
    val temp = b.toSet
    return a.filterNot(temp)
    a.filterNot(b.contains)

  }
  println(arrayDiff(Seq(1,2,2), Seq(2)))


  def asStr: Option[String] = {
    if (0 >= 3) Some("good") else None
  }
  // println(asStr)
  def boolToWord(boolean: Boolean): String =
    if (boolean == true) "Yes" else "No"

} */

/* package example

import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(2) === 8)
    assert(CubeCalculator.cube(4) === 64)

  }
}
 */

/* Introduction
The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

Task
Given a year, return the century it is in.

Examples
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20 */
/* object CenturyYear extends App{
  val a = 4905
  def roundYear(v1:Int) = (100 - (v1 % 100)) + v1
  def centuryFromYear(year: Int): Int =  if (year % 100 == 0) year / 100 else ((100 - (year % 100)) + year) /100
  println(centuryFromYear(a))

} */
/* Write a function that takes an array of strings as an argument and returns a sorted array containing the same strings, ordered from shortest to longest.

For example, if this array were passed as an argument:

["Telescopes", "Glasses", "Eyes", "Monocles"]

Your function would return the following array:

["Eyes", "Glasses", "Monocles", "Telescopes"]

All of the strings in the array passed to your function will be different lengths, so you will not have to decide how to order multiple strings of the same length.

 */
/* object Kata extends App{

  val aRR = Array("", "pizza", "brain00s", "tely")
  println(aRR.sortBy(x=> x.length()).toList)
  def sortByLength(arr: Array[String]): Array[String] = arr.sortBy(x => x.length())
} */
/* Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65]. */

/* object Kata extends App{

  // Expects (0, 0) for empty array
  val anIntarr = Array(0,0,0,0,0,0,0,0,0,0,0,0,0)
  val s :(String=>String) = (xs:String) => xs.filterNot(x=> x == ' ')
  //xs.replaceAllLiterally(" ","")
  val str = s.apply("hello how are you")
  println (str)
  def countPositivesSumNegatives(integers: Array[Int]):(Int,Int) =
    (integers.count(_>0),integers.filter(_<0).sum)
   //if (integers.isEmpty)  (0,0)  else  (integers.filter(x => x>0).length, integers.filter(x => x<0).sum)
  println(countPositivesSumNegatives(anIntarr))
} */
/* Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty. */
/* object SmallestIntegerFinder extends App{
  def findSmallestInt(nums:List[Int]):Int = nums.sorted.head
  val aList = List(1,2,-33,-44,-55)
  println(findSmallestInt(aList))
} */

/* Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.

Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:

[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
   7      6      5      4      3            2      1
If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.

Note: there will always be exactly one wolf in the array.

Examples
Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"

Input: ["sheep", "sheep", "wolf"]
Output: "Pls go away and stop eating my sheep" */
/*
object SheepAdvisor extends App {
  val sheep = "sheep"
  val wolf = "wolf"
  val anArray: Array[String] =
    Array[String](sheep, wolf, sheep, sheep, sheep, sheep)

  // println(anArray.length-1)
  val s2: (Int => String) = (x: Int) =>
    s"Oi! Sheep number $x! You are about to be eaten by a wolf!"


  val statement1 = "Pls go away and stop eating my sheep"

  def warnTheSheepCheck(queue: Array[String]): String = {
    if(queue.last == wolf) "Pls go away and stop eating my sheep"
    else s"Oi! Sheep number ${queue.reverse.indexOf(wolf)}! You are about to be eaten by a wolf!"
  }
  println(warnTheSheepCheck(anArray))

} */
//import scala.language.postfixOps
/* You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

Array can contain numbers or strings. X can be either.

Return true if the array contains the value, false if not. */
/* object Solution extends App {

  def check(seq: List[Any], elem: Any) = seq.contains(elem)
  //for(i <-0 until seq.length) yield if(seq(i)==elem) true else false
  println(check(List(10,40,"hi"),"hi"))
} */
/* Very simple, given an integer or a floating-point number, find its opposite.

Examples:

1: -1
14: -14
-34: 34 */
/* object Opposite extends App {

  def opposite(number: Double): Double = -number //+ (-number*2)
  println(opposite(-4))
}
 */ /* If you can't sleep, just count sheep!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers. */
/* object Kata extends App {
  def countingSheep(num: Int): String = {
    var str =""
    for(i<-1 to num) yield{
      str = s"$str$i sheep..."
    }
    str
  }
  val a =((1 to 5).map(x=> s"$x sheep...")).mkString
  println(a)
  //println(countingSheep(2))

}
 */
/* After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.

Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

Write a code that gives out the total amount for different days(d). */
/* object Rental extends App{

  //def cost(days: Int): Int = if(days>= 7) (40*days)-50 else if (days >=3) (40*days)-20 else days*40
  def cost(days: Int): Int = days match {
    case d if d>=7 => days*40 - 50
    case d if d>=3 => days*40 - 20
    case _ => days*40
  }
  println(cost(8))

} */

/* Summation
Write a program that finds the summation of every number from 1 to   num. The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 */
/* object Kata extends App {

  def addN(n: Int): Int = {
    var sum = 0

    //(1 to n).foreach(x=> (sum =sum+x))
    var sum = 0
    for (i <- 1 to n) yield { sum = sum + i }
    return sum
    sum
  }
  println(addN(3))
  // val aL =List(1 5).fold(0)(_ + _)
  // def summation(n: Int): Int = Range(1,n+1).fold(0)(_ + _)
  // val bL = Range(1,6).fold(0)(_ + _)
  // println(bL)
  // println(summation(3))
  // val res = (1 to 8).sum
  // println(res)

} */
/* object Kata extends App {
  def checkForFactor(base: Int, factor: Int): Boolean = if( base % factor == 0) true else false
  println(checkForFactor(0,2))
} */

/* Write a function called repeatStr which repeats the given string string exactly n times.

StringRepeat.repeatStr(6, "I") # "IIIIII"
StringRepeat.repeatStr(5, "Hello") # "HelloHelloHelloHelloHello" */

/* object StringRepeat extends App {
  def repeatStr(times: Int, str: String): String = {
    str*times
/*
    def repeatStrHelper(times: Int, str: String, acc: String): String = {
      if (times <= 0) acc
      else repeatStrHelper(times - 1, str, acc + str)

    }
    repeatStrHelper(times,str,"") */
  }
  println(repeatStr(5,"hi"))
} */

/* Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.

Example:

["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!

 */
/* object Katas extends App {
  val l1 = List(1, "hi", 2, 3, 4, 5, 6, 7, 8)

  def removeEveryOther[T](list: List[T]): List[T] =
    (for ((x, y) <- (0 to list.length zip list) if x % 2 == 0) yield y).toList
  println(removeEveryOther(l1))
  val l2 = List(1,"Hello","Hi",2,4,5,"Good","day")

  def filterOddelem[T](list:List[T])={
      var l3 = List[T]()
      for(i <- 1 until list.length){
        if( i %2 !=0){
          println(list(i))
          l3 = l3 :+ list(i)
        }
      }
      println(l3)
  }
  filterOddelem(l2)
  // println(l2)
}
 */ /* Create a class Ball. Ball objects should accept one argument for "ball type" when instantiated.
If no arguments are given,
 ball objects should instantiate with a "ball type" of "regular."

ball1 = new Ball();
ball2 = new Ball("super");

ball1.ballType     //=> "regular"
ball2.ballType     //=> "super"
 */
/* object Katas extends App {
  val ball1 = new Ball()
  val ball2 = new Ball("green")
 println(ball1.ballType)
 println(ball2.ballType)

}
case class Ball(ballType: String = "regular") {

} */

/* We need a function that can transform a number into a string.

What ways of achieving this do you know?

Examples:
123 --> "123"
999 --> "999"
 */
/* object Katas extends App {
    def numberToString(n: Int): String =n.toString
    println(numberToString(45))
}
 */
