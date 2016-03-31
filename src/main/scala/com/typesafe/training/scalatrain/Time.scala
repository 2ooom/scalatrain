package com.typesafe.training.scalatrain

/**
  * Created by d.parfenchik on 31/03/2016.
  */
object Time {
  val MINUTES_IN_HOUR: Int = 60

  def fromMinutes(minutes:Int):Time = {
    new Time(minutes / 60, minutes% MINUTES_IN_HOUR)
  }

  def fromHours(hours:Int):Time = ???
}
class Time(val hours: Int = 0,
           val minutes: Int = 0
          ) {
  def this() = {
    this(0, 0)
  }
  require(hours >= 0 && hours < 24, "Hours must be within range of 0..23")
  require(minutes >= 0 && minutes < 60, "Minutes must be within range of 0..59")
  val asMinutes = hours * 60 + minutes

  def minus(that: Time) = {
    this.asMinutes - that.asMinutes
  }

  def -(that: Time) = minus(that)

  // for - new com.typesafe.training.scalatrain.Time(1, 14) => -1 - 14
  def unary_- = new Time(-hours, minutes)
}