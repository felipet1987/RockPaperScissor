package cl.talavera.rockPaperScissor

import org.scalatest.FunSuite


class GameSuite extends FunSuite {


  test("Paper Beats Rock") {
    assert(Game.evaluate("paper","rock") == "win")
    assert(Game.evaluate("rock","paper") == "lose")
  }

  test("Rock Beats Scissor") {
    assert(Game.evaluate("rock","scissor") == "win")
    assert(Game.evaluate("scissor","rock") == "lose")
  }
  test("Scissor Beats Paper") {
    assert(Game.evaluate("scissor","paper") == "win")
    assert(Game.evaluate("paper","scissor") == "lose")
  }
  test("Same move is draw") {
    assert(Game.evaluate("scissor","scissor") == "draw")
    assert(Game.evaluate("paper","paper") == "draw")
    assert(Game.evaluate("rock","rock") == "draw")
  }



}

