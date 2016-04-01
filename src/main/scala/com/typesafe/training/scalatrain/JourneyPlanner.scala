package com.typesafe.training.scalatrain

/**
  * Created by d.parfenchik on 01/04/2016.
  */
case class JourneyPlanner(trains:Set[Train]) {
  val stations:Set[Station] = trains.flatMap(t => t.stations)

  def trainsAt(station:Station):Set[Train] = {
    trains.filter(_.stations.contains(station))
  }

  def stopsAt(station:Station):Set[(Time, Train)] = {
    for {
      train <- trains
      stop <- train.schedule if stop._2 == station
    } yield (stop._1, train)
  }
}
