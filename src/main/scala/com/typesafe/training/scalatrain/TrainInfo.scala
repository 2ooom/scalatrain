package com.typesafe.training.scalatrain

/**
  * Created by d.parfenchik on 01/04/2016.
  */
sealed abstract class TrainInfo {
  def number():Int
}

case class InterCityExpress(number:Int, hasWifi: Boolean = false) extends TrainInfo {}
case class RegionalExpress(number:Int) extends TrainInfo {}
case class BavarianRegional(number:Int) extends TrainInfo {}

