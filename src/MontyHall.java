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

  public int reveal(int user){
    if (user == goat2) {
      int revealed = goat1;
      return revealed;
    }
    else if (user == goat1){
      int revealed = goat2;
      return revealed;
    }
    else{
      int revealed = goat1;
      return revealed;
    }
  }

  public int Switch(int user1, int revealed){
    int switched = 0;
      if (user1 == 1 && revealed == 2){
        switched = 3;
      }
      else if (user1 == 1 && revealed == 3){
        switched = 2;
      }
      else if (user1 == 2 && revealed == 1){
        switched = 3;
      }
      else if (user1 == 2 && revealed == 3){
        switched =1;
      }
      else if (user1 == 3 && revealed == 2){
        switched = 1;
      }
      else if (user1 == 3 && revealed == 1){
        switched = 2;
      } 
      return switched;
    } 

  public void Guessed(int user1){
    if (user1 == car){
      System.out.print("You won!");
    }
    else if (user1!= car){
      System.out.print("The car is behind door " + car + ". You lost! (Or you could say you won a goat!)");
    }
  }
}
