package jamesw1892.cricket.domain.ball;

import jamesw1892.cricket.domain.Player;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class BowledOut extends Wicket {
  public BowledOut(int id, Player batter, Player bowler) {
    super(id, batter, bowler);
  }
}
