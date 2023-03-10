import scala.io.StdIn.readLine

class ToggleString {

  //This method is used to convert uppercase to lowercase and vice versa
  def toggleString(inputString: String): String = {
    var afterToggleString:String=""
    for (index <- 0 until inputString.length) {
      val asciiValue: Int = inputString.charAt(index)

      //converting uppercase to lowercase
      if (asciiValue >= 65 && asciiValue <= 90) {
        val toLowerCase: Char = (asciiValue + 32).asInstanceOf[Char]
        afterToggleString+=toLowerCase
      }

        //converting lowercase to uppercase
      else if (asciiValue >= 97 && asciiValue <= 122) {
        val toUpperCase: Char = (asciiValue - 32).asInstanceOf[Char]
        afterToggleString+=toUpperCase
      }
    }
    return afterToggleString
  }
}

//singleton object
object Main {
  def main(args: Array[String]): Unit = {
    val obj = new ToggleString
    val inputString = readLine("Enter the String :")
    try {
      if (inputString.isEmpty)
        throw new NullPointerException
    }
    catch {
      case ex: NullPointerException=> {
        print("Input by User is " + ex.getMessage)
      }
    }
    val toggleString:String=obj.toggleString(inputString)
    print(toggleString)
  }
}