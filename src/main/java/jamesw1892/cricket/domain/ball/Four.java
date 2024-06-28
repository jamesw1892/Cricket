package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.EqualsAndHashCode;
import lombok.Value;

// TODO: Check doesn't think objects are equal if different subclasses but same data
@EqualsAndHashCode(callSuper = true)
@Value
public class Four extends Ball {
  public Four(int id, Player batter, Player bowler, boolean isNoBall) {
    super(id, 4, batter, bowler, isNoBall);
  }
}
