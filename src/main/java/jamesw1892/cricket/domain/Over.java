package jamesw1892.cricket.domain;

import java.util.ArrayList;
import java.util.List;

import jamesw1892.cricket.domain.ball.Ball;
import jamesw1892.cricket.domain.ball.BowledOut;
import jamesw1892.cricket.domain.ball.CaughtOut;
import jamesw1892.cricket.domain.ball.Four;
import jamesw1892.cricket.domain.ball.RanOut;
import jamesw1892.cricket.domain.ball.Six;
import lombok.Data;

@Data
public class Over {
  private static final int BALLS_IN_OVER = 6;
  private final int id;
  private final Player bowler;
  private final List<Ball> balls = new ArrayList<>(BALLS_IN_OVER);
  private int validBallsSoFar = 0;

  public boolean isFinished() {
    return this.validBallsSoFar == BALLS_IN_OVER;
  }

  private int nextBallId() {
    return this.balls.size() + 1;
  }

  private void addBall(Ball ball) {
    this.balls.add(ball);
    if (!ball.isNoBall()) {
      this.validBallsSoFar++;
    }
  }

  public void caughtOut(Player batter, Player catcher) {
    this.addBall(new CaughtOut(this.nextBallId(), batter, this.bowler, catcher));
  }

  public void bowledOut(Player batter) {
    this.addBall(new BowledOut(this.nextBallId(), batter, this.bowler));
  }

  public void ranOut(Player batter, Player fielder) {
    this.addBall(new RanOut(this.nextBallId(), batter, this.bowler, fielder));
  }

  public void four(Player batter, boolean isNoBall) {
    this.addBall(new Four(this.nextBallId(), batter, this.bowler, isNoBall));
  }

  public void six(Player batter, boolean isNoBall) {
    this.addBall(new Six(this.nextBallId(), batter, this.bowler, isNoBall));
  }

  public void runs(Player batter, boolean isNoBall, int runsIgnoringNoBall) {
    this.addBall(new Ball(this.nextBallId(), runsIgnoringNoBall, batter, this.bowler, isNoBall));
  }
}
