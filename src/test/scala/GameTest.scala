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
  test("Scissor Beats Paper") {
    assert(Game.move("scissor","paper") == "win")
    assert(Game.move("paper","scissor") == "lose")
  }
  test("Same move is draw") {
    assert(Game.move("scissor","scissor") == "draw")
    assert(Game.move("paper","paper") == "draw")
    assert(Game.move("rock","rock") == "draw")
  }

}

