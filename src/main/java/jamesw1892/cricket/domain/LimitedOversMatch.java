package jamesw1892.cricket.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class LimitedOversMatch extends Match {
  private final int oversInInnings;

  public LimitedOversMatch(int id, Team team1, Team team2, String location, int oversInInnings) {
    super(id, team1, team2, location);
    this.oversInInnings = oversInInnings;
  }

  @Override
  protected boolean areLimitedOversUp() {
    return this.getOversGone() == oversInInnings;
  }
}
