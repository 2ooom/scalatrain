/**
  * Created by d.parfenchik on 31/03/2016.
  */
package scalatrain
import java.util._

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

  // for - new Time(1, 14) => -1 - 14
  def unary_- = new Time(-hours, minutes)
}