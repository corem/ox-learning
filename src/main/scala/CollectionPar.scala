import ox.*

object CollectionPar {

  val input: List[Int] = (1 to 10).toList

  // mapPar
  val resultMap: List[Int] = input.mapPar(4)(_ + 1)

  // foreachPar
  val resultForeach = input.foreachPar(4)(println(_))

  // filterPar
  val resultFilter = input.filterPar(4)(_ % 2 == 0)

  // collectPar
  val resultCollect = input.collectPar(4) {
    case i if i % 2 == 0 => i + 1
  }

  def main(args: Array[String]): Unit = {
    resultForeach
  }

}
