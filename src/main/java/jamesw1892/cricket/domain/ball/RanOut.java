package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class RanOut extends Wicket {
  Player fielder;

  public RanOut(int id, Player batter, Player bowler, Player fielder) {
    super(id, batter, bowler);
    this.fielder = fielder;
  }
}
