package cl.talavera.rockPaperScissor

object Panel {
  def result() = {

    val result : String = Game.evaluate(leftPLayer.currentMove,rightPlayer.currentMove)
    result  match {
      case "win" =>  "player 1 won"
      case "lose" => "player 2 won"
      case "draw" => "is a draw"
    }
  }


  var currentPlayer = "left"

  def setMove(move: String) = {
    currentPlayer match {
      case "left" => {
        leftPLayer.play(move)
        currentPlayer = "right"
      }
      case "right" => {
        rightPlayer.play(move)
        currentPlayer = "left"
      }

    }
  }


  var leftPLayer : Hand = null
  var rightPlayer : Hand = null
  var oponent : String = ""

  def init() = {
    leftPLayer = new Hand()
    rightPlayer = new Hand()
  }


  def setOponent(o: String) = oponent = o


}