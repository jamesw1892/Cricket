package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.NonFinal;

@NonFinal
@EqualsAndHashCode(callSuper = true)
@Value
public abstract class Wicket extends Ball {
  public Wicket(int id, Player batter, Player bowler) {
    // TODO: Can you get a wicket on a no-ball?
    super(id, 0, batter, bowler, false);
  }
}
