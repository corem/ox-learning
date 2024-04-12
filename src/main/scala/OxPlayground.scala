import ox.{par, sleep}
import scala.concurrent.duration.*

object OxPlayground {

  def computation1: Int = {
    sleep(2.seconds)
    1
  }

  def computation2: String = {
    sleep(1.second)
    "2"
  }

  def main(args: Array[String]): Unit = {
    val result = par(computation1, computation2)
    println(result)
  }
}