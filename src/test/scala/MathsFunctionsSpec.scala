import org.scalatest.{Matchers, WordSpec}

class MathsFunctionsSpec extends WordSpec with Matchers {

  "multiply" should {
    "multiply 2 and 4 to return 8" in {
      MathsFunctions.multiply(2, 4) shouldBe 8
    }
  }

  "divide" should {
    "divide 4 and 2 to return 2" in {
      MathsFunctions.divide(4, 2) shouldBe Some(2)
    }

    "return empty option for divide by zero" in {
      MathsFunctions.divide(6, 0) shouldBe None
    }
  }

  "doubleList" should {
    "double all the numbers in a List" in {
      MathsFunctions.doubleList(List(1,5,8,11)) shouldBe List(2,10,16,22)
    }
    "return an empty list when passed an empty list" in {
      MathsFunctions.doubleList(List.empty) shouldBe List.empty
    }
  }

  "modulusOfThree" should {
    "return 'one' for 4" in {
      MathsFunctions.modulusOfThree(4) shouldBe "one"
    }
    "return 'two' for 5" in {
      MathsFunctions.modulusOfThree(4) shouldBe "two"
    }
    "return 'zero' for 6" in {
      MathsFunctions.modulusOfThree(4) shouldBe "zero"
    }
  }

  "doubleOption" should {
    "double an option of 10 to return 20" in {
      MathsFunctions.doubleOption(Some(10)) shouldBe 20
    }
    "return zero for empty option" in {
      MathsFunctions.doubleOption(None) shouldBe 0
    }
  }

}
