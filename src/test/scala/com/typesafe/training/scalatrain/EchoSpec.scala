package com.typesafe.training.scalatrain

import org.scalatest.{Matchers, WordSpec}

class Echo { ??? }
/**
  * Created by d.parfenchik on 31/03/2016.
  */
class EchoSpec extends WordSpec with Matchers {
  "Calling echo" should {
    "return the given value" in {
      val message =  "test"
      //Echo.echo(message).shouldEqual(message)
    }

    "throw exception" in {
      an[Exception]
    }
  }
}
