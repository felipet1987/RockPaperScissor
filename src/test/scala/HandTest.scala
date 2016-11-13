package cl.talavera.rockPaperScissor
import org.scalatest.FunSuite

/**
  * Created by felipe on 12-11-2016.
  */
class HandSuite extends FunSuite {{



  test("one hand play paper then current is paper") {
    var hand : Hand = new Hand()
    hand.play("paper")
    assert(hand.currentMove == "paper")
  }


}

}


