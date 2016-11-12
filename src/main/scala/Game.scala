package cl.talavera.rockPaperScissor

object Game {

  def move(left: String, right: String): String = (left,right) match {
    case ("paper", "rock") =>  "win"
    case ("rock", "paper") =>  "lose"
  }



}