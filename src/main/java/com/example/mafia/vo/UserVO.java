package com.example.mafia.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserVO {
  private String userid;
  private String username;
  private String password;
  private String nickname;
  private int citizenWin;
  private int citizenLose;
  private int mafiaWin;
  private int mafiaLose;
  public double citizenRate() {
    return ((double)citizenWin)/(citizenLose+citizenWin);
  }
  public double mafiaRate() {
    return ((double)mafiaWin)/(mafiaLose+mafiaWin);
  }
}
