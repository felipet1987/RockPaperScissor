package cl.talavera.rockPaperScissor
import org.scalatest.FunSuite

/**
  * Created by felipe on 12-11-2016.
  */
class PanelSuite extends FunSuite {


  def setMove(s: String) = ???

  test("Player plays against other player them panel show  result message")
  {
    Panel.setOponent("computer")
    Panel.init()
    Panel.setMove("paper")
    Panel.setMove("rock")

     assert(Panel.result() ==  "player 1 won")
  }






}


