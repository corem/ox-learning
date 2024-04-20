import ox.*
import scala.concurrent.duration.*

object ForkThreads {

  val numbers = (1 to 10).toList

  val comp = supervised {
    val f1 = fork {
      sleep(2.seconds)
      1
    }

    val f2 = fork {
      sleep(1.second)
      2
    }

    (f1.join(), f2.join())
  }
  def main(args: Array[String]): Unit = {
    println(s"${comp._1} - ${comp._2}")
  }
}
