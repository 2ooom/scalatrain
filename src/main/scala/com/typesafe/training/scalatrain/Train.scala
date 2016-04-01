package com.typesafe.training.scalatrain
import collection.immutable.Seq
/**
  * Created by d.parfenchik on 31/03/2016.
  */
case class Train (info:TrainInfo, schedule:Seq[(Time, Station)]) {
  // TODO: schedule should be increasing only
  require(schedule.length > 1,  "You should have at least 2 stations")
  val stations:Seq[Station] = schedule.map(_._2)

  def timeAt(station: Station):Option[Time] = {
    schedule.collectFirst{ case (t, `station`) => t }
  }
}
