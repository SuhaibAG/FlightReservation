public class FlightClass {

Strategy Str;

public String GetClass(){

return Str.classInfo();

}

public void setStrategy(Strategy s){

Str =s;

}


}
