package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class Six extends Ball {
  public Six(int id, Player batter, Player bowler, boolean isNoBall) {
    super(id, 6, batter, bowler, isNoBall);
  }
}
