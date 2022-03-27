fun main(){
    var subaru=Cars(make = "vokswagen", model = "outback", colour = "black", capacity = 14)
    subaru.carry(10)
    subaru.carry(15)
    subaru.identity()
    println(subaru.calculateParkingFees(3))

    var y=Bus("japan","imprezer","maroon",6)
    println(y.maxTripFare(200.0))
    println(y.calculateParkingFees(3))



}
open class Cars(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry (people:Int){
        var conductor=people - capacity
        if (people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("overcapacity by $conductor people")
        }
    }
    fun identity(){
        println("I am a $colour $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var fees=hours*20
        return fees
    }

}
class Bus(make: String,model: String,colour: String,capacity:Int):Cars(make,model,colour,capacity){
      fun maxTripFare(fare:Double):Double{
        var trip = (fare * capacity)
        return trip
        }

    override fun calculateParkingFees(hours: Int): Int {
        var z=hours*capacity
        return z

    }
}




