/**
  * Created by Administrator on 19/07/2017.
  */
object Main {

  def main(args: Array[String]): Unit = {

    val valueInput = scala.io.StdIn.readLine()

    print(returnValue(valueInput, 1))



  }


//  val scale = Array("thousand", "million million", "billion milliard", "trillion billion",
//  "quadrillion billiard", "quintrillion trillion", "sextillion trilliard")

  val scale2 = Array(
    ("", ""),
    ("thousand and", "thousand and"),
    ("million", "million"),
    ("billion", "millard"),
    ("trillion", "billion"),
    ("quadrillion", "billiard"),
    ("quintillion", "trillion"),
    ("sextillion", "trilliard")

  )

  def longOrShort2(x : Int, test : Int): String = {

    x match {
      case 1 => scale2(test)._1
      case 2 => scale2(test)._2
    }

  }



  def returnValue (valueInput : String, scaleType : Int): String = {
    val stringLength = valueInput.length

    var x = valueInput.length
    val z = valueInput.reverse
    var stringtest = ""

    if(stringLength < 3) {

      valueInput
    }
    else {
      while(x != 0) {
        if(x % 3 == 1) {
          //print(z(x - 1) + " " + longOrShort2(scaleType, x / 3) + " ")
          //stringtest += z(x - 1) + " " + longOrShort2(scaleType, x / 3) + " "
          stringtest = valueInput.substring(valueInput.length - 3, valueInput.length) + longOrShort2(scaleType, x / 3) + stringtest
          var leftover = valueInput.substring(0, valueInput.length - 3)
          returnValue(stringtest, scaleType)
        }
        else {
          //print(z(x - 1))
          //stringtest += z(x - 1)
          x -= 1
        }
      }
    }
    stringtest

  }




}
