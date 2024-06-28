package jamesw1892.cricket.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class T20Match extends LimitedOversMatch {
  private boolean powerPlay = true; // TODO

  public T20Match(int id, Team team1, Team team2, String location) {
    super(id, team1, team2, location, 20);
  }
}
