package jamesw1892.cricket.domain;

import lombok.Data;

@Data
public abstract class Match {
  private static final int WICKETS = 10;
  private final int id;
  private final Team team1;
  private final Team team2;
  private final String location;
  private Status status = Status.NOT_STARTED;
  private Player bowler = null;
  private Over over = null;
  private Player batterOnStrike = null;
  private Player batterOffStrike = null;
  private int oversGone = 0;

  public void start(boolean isTeam1BattingFirst, Player batterOnStrike, Player batterOffStrike, Player bowler) {
    this.status = isTeam1BattingFirst ? Status.TEAM_1_BATTING : Status.TEAM_2_BATTING;
    this.batterOnStrike = batterOnStrike;
    this.batterOffStrike = batterOffStrike;
    this.nextOver(bowler);
  }

  abstract protected boolean areLimitedOversUp();

  private void checkEnd() {
    // TODO: Winning conditions

    // End of over
    if (this.over.isFinished()) {
      this.oversGone++;
      this.status = Status.BETWEEN_OVERS;
    }

    // End of innings
    if (this.areLimitedOversUp() || this.wickets == WICKETS) {
      // TODO: Switch teams or finished but change to winning condition
      this.status = Status.FINISHED;
    }
  }

  public void caughtOut(Player catcher) {
    this.over.caughtOut(this.batterOnStrike, catcher);
    checkEnd();
  }

  public void bowledOut() {
    this.over.bowledOut(this.batterOnStrike);
    checkEnd();
  }

  public void ranOut(Player fielder) {
    this.over.ranOut(this.batterOnStrike, fielder);
    checkEnd();
  }

  public void four(boolean isNoBall) {
    this.over.four(this.batterOnStrike, isNoBall);
    checkEnd();
  }

  public void six(boolean isNoBall) {
    this.over.six(this.batterOnStrike, isNoBall);
    checkEnd();
  }

  public void runs(int runsIgnoringNoBall, boolean isNoBall) {
    this.over.runs(this.batterOnStrike, isNoBall, runsIgnoringNoBall);
    checkEnd();
  }

  public void nextOver(Player bowler) {
    this.over = new Over(this.oversGone + 1, bowler);
    // TODO: Change status
  }
}
