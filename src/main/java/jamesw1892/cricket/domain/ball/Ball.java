package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.Value;
import lombok.experimental.NonFinal;

@NonFinal
@Value
public class Ball {
  int id;
  int runs;
  Player batter;
  Player bowler;
  boolean isNoBall;

  public Ball(int id, int runsIgnoringNoBall, Player batter, Player bowler, boolean isNoBall) {
    this.id = id;
    this.runs = isNoBall ? runsIgnoringNoBall + 1 : runsIgnoringNoBall;
    this.batter = batter;
    this.bowler = bowler;
    this.isNoBall = isNoBall;
  }
}
