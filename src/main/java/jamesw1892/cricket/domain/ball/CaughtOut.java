package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class CaughtOut extends Wicket {
  Player catcher;

  public CaughtOut(int id, Player batter, Player bowler, Player catcher) {
    super(id, batter, bowler);
    this.catcher = catcher;
  }
}
