package classes

/**
  * Created by jade on 08/02/2017.
  */
class Counter(val count: Int) {
class Counter(val input: Int) {

  def inc = new Counter(count + 1)

  def dec = new Counter(count - 1)
}
