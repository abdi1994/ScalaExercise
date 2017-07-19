import org.scalatest.FunSuite
import Main.returnValue
import org.scalatest.junit.JUnitRunner

class Test extends FunSuite {

  test("Values equal") {
    assert(returnValue("123", 1) === "123")
  }

}
