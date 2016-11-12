package cl.talavera.rockPaperScissor

import org.scalatest.FunSuite


class GameSuite extends FunSuite {




  test("Paper Beats Rock") {
    assert(Game.move("paper","rock") == "win")
    assert(Game.move("rock","paper") == "lose")
  }

  test("Rock Beats Scissor") {
    assert(Game.move("rock","scissor") == "win")
    assert(Game.move("scissor","rock") == "lose")
  }



}

