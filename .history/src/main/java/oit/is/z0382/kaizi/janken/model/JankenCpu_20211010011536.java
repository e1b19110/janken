package oit.is.z0382.kaizi.janken.model;

import java.util.ArrayList;

public class JankenCpu {
  ArrayList<Double> numList = new ArrayList<>();
  double ave;

  // コンストラクタ
  public Score(ArrayList<Double> numList) {
    this.numList = numList;
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
