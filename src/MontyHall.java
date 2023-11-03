public class MontyHall {

    private int goat1;
    private int goat2;
    private int car;

    public void setUp(){
        car = (int)(Math.random()*3)+1;
        if (car == 1){
            goat1 = 2;
            goat2 = 3;
        }
        else if (car == 2){
            goat1 = 1;
            goat2 = 3;
        }
        else {
            goat1 = 1;
            goat2 = 2;
        }
    }

    public String reveal(int user){
        if (user == goat2) {
            return "One of the goats is behind door number " + goat1;
        }
        else if (user == goat1){
            return "One of the goats is behind door number " + goat2;
        }
        else{
            return "One of the goats is behind door number " + goat1;
        }
    }

    public boolean Guessed(int user){
        if (user == car){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean Switch(String user,int user1){
        if (user.equals("Yes")){

        }
    }

}
