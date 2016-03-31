package com.typesafe.training.scalatrain

/**
  * Created by d.parfenchik on 31/03/2016.
  */
case class Train (kind:String, number:Int,schedule:collection.immutable.Seq[Station]) {
  require(schedule.length > 1,  "You should have at least 2 stations")
}
