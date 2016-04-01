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
    //trains.flatMap(train => train.schedule.withFilter(stop => stop._2 == station).map(stop => (stop._1, train)))

    for {
      train <- trains
      (time, `station`) <- train.schedule
    } yield (time, train)
  }

  def isShortTrip2(from:Station, to:Station):Boolean = {
    trains.exists(train => {
      train.stations.dropWhile(_ != from) match {
        case `from` +: `to` +: _ => true
        case `from` +: _ +: `to` +: _ => true
        case _ => false
      }
    })
  }

  def isShortTrip(from:Station, to:Station):Boolean = {
    trains.exists(train => {
      train.stations.dropWhile(_ != from) match {
        case _ +: (_ +: `to` +: _ | `to` +: _ ) => true
        case _ => false
      }
    })
  }
}
