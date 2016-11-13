package cl.talavera.rockPaperScissor

object Main {
  def main(args: Array[String]) {
    println("choose your oponent: computer or human")
    val scanner = new java.util.Scanner(System.in)
    val oponent = scanner.hasNext()

    Panel.setOponent(oponent)
    

  }
}