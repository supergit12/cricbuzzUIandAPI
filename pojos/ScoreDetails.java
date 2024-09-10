
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ballNbr",
    "isDeclared",
    "isFollowOn",
    "overs",
    "revisedOvers",
    "runRate",
    "runs",
    "wickets",
    "runsPerBall"
})
public class ScoreDetails {

    @JsonProperty("ballNbr")
    private Integer ballNbr;
    @JsonProperty("isDeclared")
    private Boolean isDeclared;
    @JsonProperty("isFollowOn")
    private Boolean isFollowOn;
    @JsonProperty("overs")
    private Double overs;
    @JsonProperty("revisedOvers")
    private Integer revisedOvers;
    @JsonProperty("runRate")
    private Double runRate;
    @JsonProperty("runs")
    private Integer runs;
    @JsonProperty("wickets")
    private Integer wickets;
    @JsonProperty("runsPerBall")
    private Double runsPerBall;

    @JsonProperty("ballNbr")
    public Integer getBallNbr() {
        return ballNbr;
    }

    @JsonProperty("ballNbr")
    public void setBallNbr(Integer ballNbr) {
        this.ballNbr = ballNbr;
    }

    @JsonProperty("isDeclared")
    public Boolean getIsDeclared() {
        return isDeclared;
    }

    @JsonProperty("isDeclared")
    public void setIsDeclared(Boolean isDeclared) {
        this.isDeclared = isDeclared;
    }

    @JsonProperty("isFollowOn")
    public Boolean getIsFollowOn() {
        return isFollowOn;
    }

    @JsonProperty("isFollowOn")
    public void setIsFollowOn(Boolean isFollowOn) {
        this.isFollowOn = isFollowOn;
    }

    @JsonProperty("overs")
    public Double getOvers() {
        return overs;
    }

    @JsonProperty("overs")
    public void setOvers(Double overs) {
        this.overs = overs;
    }

    @JsonProperty("revisedOvers")
    public Integer getRevisedOvers() {
        return revisedOvers;
    }

    @JsonProperty("revisedOvers")
    public void setRevisedOvers(Integer revisedOvers) {
        this.revisedOvers = revisedOvers;
    }

    @JsonProperty("runRate")
    public Double getRunRate() {
        return runRate;
    }

    @JsonProperty("runRate")
    public void setRunRate(Double runRate) {
        this.runRate = runRate;
    }

    @JsonProperty("runs")
    public Integer getRuns() {
        return runs;
    }

    @JsonProperty("runs")
    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    @JsonProperty("wickets")
    public Integer getWickets() {
        return wickets;
    }

    @JsonProperty("wickets")
    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }

    @JsonProperty("runsPerBall")
    public Double getRunsPerBall() {
        return runsPerBall;
    }

    @JsonProperty("runsPerBall")
    public void setRunsPerBall(Double runsPerBall) {
        this.runsPerBall = runsPerBall;
    }

}
