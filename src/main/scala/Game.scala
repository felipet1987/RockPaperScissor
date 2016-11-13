package cl.talavera.rockPaperScissor

object Game {


  def evaluate(left: String, right: String): String = (left,right) match {
    case ("paper", "rock") =>  "win"
    case ("rock", "paper") =>  "lose"

    case ("rock", "scissor") =>  "win"
    case ("scissor", "rock") =>  "lose"

    case ("scissor", "paper") =>  "win"
    case ("paper", "scissor") =>  "lose"

    case (l,r) if(l eq r) =>  "draw"
  }




}
