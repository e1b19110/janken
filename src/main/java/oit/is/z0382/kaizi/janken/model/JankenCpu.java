package oit.is.z0382.kaizi.janken.model;

import java.util.ArrayList;
import java.util.Random;

public class JankenCpu {
 int cpu;
 int result;
 int me;
  // コンストラクタ
  public JankenCpu(int me) {
    Random rand = new Random();
    this.cpu = rand.nextInt(3)-1;
    this.me=me;
    //あいこ
    if(this.me==this.cpu){this.result=0;}
    //勝ち
    else if((this.me==1 && this.cpu==0) || (this.me==0 && this.cpu==-1) || (this.me==-1 && this.cpu==1)){this.result=1;}
    //負け
    else if((this.me==1 && this.cpu==-1) || (this.me==0 && this.cpu==1) || (this.me==-1 && this.cpu==0)){this.result=-1;}
   
  }

  public int getresult() {
    return this.result;
  }

  public int getcpu() {
    return this.cpu;
  }

 
}
