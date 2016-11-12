package cl.talavera.rockPaperScissor

object Game {

  def move(left: String, right: String): String = (left,right) match {
    case ("paper", "rock") =>  "win"
    case ("rock", "paper") =>  "lose"

    case ("rock", "scissor") =>  "win"
    case ("scissor", "rock") =>  "lose"

    case ("scissor", "paper") =>  "win"
    case ("paper", "scissor") =>  "lose"

    case (left,right) if(left eq right) =>  "draw"
  }




}
