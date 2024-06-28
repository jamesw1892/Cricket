package jamesw1892.cricket.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ODIMatch extends LimitedOversMatch {
  public ODIMatch(int id, Team team1, Team team2, String location) {
    super(id, team1, team2, location, 50);
  }
}
