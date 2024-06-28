package jamesw1892.cricket.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestMatch extends Match {
  public TestMatch(int id, Team team1, Team team2, String location) {
    super(id, team1, team2, location);
  }

  @Override
  protected boolean areLimitedOversUp() {
    return false;
  }
}
