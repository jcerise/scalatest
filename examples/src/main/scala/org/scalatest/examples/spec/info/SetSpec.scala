package org.scalatest.examples.spec.info

import collection.mutable
import org.scalatest._
 
class SetSpec extends Spec with GivenWhenThen {
  
  object `A mutable Set` {
    def `should allow an element to be added` {
      Given("an empty mutable Set")
      val set = mutable.Set.empty[String]

      When("an element is added")
      set += "clarity"

      Then("the Set should have size 1")
      assert(set.size === 1)

      And("the Set should contain the added element")
      assert(set.contains("clarity"))

      info("That's all folks!")
    }
  }
}