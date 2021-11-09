package oit.is.z0382.kaizi.janken.model;

public class Match {
   int id; 
   int user1; 
   int user2;
   String user1Hand; 
   String user2Hand;
  

public int getUser1() {
  return this.user1;
}

public void setUser1(int user1) {
    this.user1 = user1;
  }

public void setUser2(int user2) {
  this.user2 = user2;
}

public int getUser2() {
    return this.user2;
  }
  

public int getId() {
  return this.id;
}

public void setId(int id) {
  this.id = id;
}

          
public String getUser1Hand() {
        return this.user1Hand;
      }

      
public void setUser1hand(String user1Hand) {
    this.user1Hand = user1Hand;
  }

public String getUser2Hand() {
    return this.user2Hand;
  }

public void setUser2Hand(String user2Hand) {
      this.user2Hand = user2Hand;
    }

}


