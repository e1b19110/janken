package oit.is.z0382.kaizi.janken.model;

import java.util.ArrayList;
import java.util.Random;

public class JankenCpu {
 int num;
  // コンストラクタ
  public JankenCpu(int result) {
    Random rand = new Random();
    num = rand.nextInt(10) + 100;
    if(result==1){}
    double sum = 0;
    for (Double num : numList) {
      sum = sum + num;
    }
    ave = sum / numList.size();
  }

  public ArrayList<Double> getNumList() {
    return numList;
  }

  public void setNumList(ArrayList<Double> numList) {
    this.numList = numList;
  }

  public double getAve() {
    return ave;
  }

  public void setAve(double ave) {
    this.ave = ave;
  }
}
