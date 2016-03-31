package com.typesafe.training.scalatrain

/**
  * Created by d.parfenchik on 31/03/2016.
  */
object Time {
  val MINUTES_IN_HOUR: Int = 60

  def fromMinutes(minutes:Int):Time = {
    new Time(minutes / 60, minutes% MINUTES_IN_HOUR)
  }
}
class Time(val hours: Int = 0,
           val minutes: Int = 0
          ) {
  def this() = {
    this(0, 0)
  }

  val asMinutes = hours * 60 + minutes

  // TODO: min 0 .. 6
  // TODO: hours 0 .. 23
  def minus(that: Time) = {
    this.asMinutes - that.asMinutes
  }

  def -(that: Time) = minus(that)

  // for - new com.typesafe.training.scalatrain.Time(1, 14) => -1 - 14
  def unary_- = new Time(-hours, minutes)
}