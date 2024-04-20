import ox.*

import scala.concurrent.duration.DurationInt
import scala.util.Try

object ComputationTimeout {

  def computation: Int = {
    sleep(2.seconds)
    1
  }

  val result1: Try[Int] = Try(timeout(1.second)(computation)) // Failure: TimeoutException
  val result2: Try[Int] = Try(timeout(3.second)(computation)) // Success: 1

  val resultOption1: Try[Option[Int]] = Try(timeoutOption(1.second)(computation)) // Failure: None
  val resultOption2: Try[Option[Int]] = Try(timeoutOption(3.second)(computation)) // Success: Some(1)

  def main(args: Array[String]): Unit = {

  }
}
