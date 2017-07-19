import org.scalatest.FunSuite
import Main.returnValue
import org.scalatest.junit.JUnitRunner

class Test extends FunSuite {

  test("Values equal") {
    assert(returnValue("123", 1) === "123  ")
  }

  test("Values equal v2") {
    assert(returnValue("123456", 1) === "123 thousand and 456  ")
  }

  test("Values equal v3") {
    assert(returnValue("123456789", 1) === "123 million 456 thousand and 789  ")
  }

//  test("Values equal v4") {
//    assert(returnValue("1234567891", 1) === "1 millard 234 million 567 thousand and 891  ")
//  }
//
//  test("Values equal v5") {
//    assert(returnValue("1234567891234", 1) === "1 billion 234 millard 567 million 891 thousand and 234  ")
//  }
//
//  test("Values equal v6") {
//    assert(returnValue("12345678912345678", 1) === "12 billiard 345 billion 678 millard 912 million 345 thousand and 678  ")
//  }




}
