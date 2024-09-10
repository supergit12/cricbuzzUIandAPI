
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bowlerId",
    "bowlName",
    "bowlShortName",
    "isCaptain",
    "isKeeper",
    "overs",
    "maidens",
    "runs",
    "wickets",
    "economy",
    "no_balls",
    "wides",
    "dots",
    "balls",
    "runsPerBall",
    "isOverseas",
    "inMatchChange",
    "playingXIChange"
})
public class Bowl5 {

    @JsonProperty("bowlerId")
    private Integer bowlerId;
    @JsonProperty("bowlName")
    private String bowlName;
    @JsonProperty("bowlShortName")
    private String bowlShortName;
    @JsonProperty("isCaptain")
    private Boolean isCaptain;
    @JsonProperty("isKeeper")
    private Boolean isKeeper;
    @JsonProperty("overs")
    private Integer overs;
    @JsonProperty("maidens")
    private Integer maidens;
    @JsonProperty("runs")
    private Integer runs;
    @JsonProperty("wickets")
    private Integer wickets;
    @JsonProperty("economy")
    private Integer economy;
    @JsonProperty("no_balls")
    private Integer noBalls;
    @JsonProperty("wides")
    private Integer wides;
    @JsonProperty("dots")
    private Integer dots;
    @JsonProperty("balls")
    private Integer balls;
    @JsonProperty("runsPerBall")
    private Double runsPerBall;
    @JsonProperty("isOverseas")
    private Boolean isOverseas;
    @JsonProperty("inMatchChange")
    private String inMatchChange;
    @JsonProperty("playingXIChange")
    private String playingXIChange;

    @JsonProperty("bowlerId")
    public Integer getBowlerId() {
        return bowlerId;
    }

    @JsonProperty("bowlerId")
    public void setBowlerId(Integer bowlerId) {
        this.bowlerId = bowlerId;
    }

    @JsonProperty("bowlName")
    public String getBowlName() {
        return bowlName;
    }

    @JsonProperty("bowlName")
    public void setBowlName(String bowlName) {
        this.bowlName = bowlName;
    }

    @JsonProperty("bowlShortName")
    public String getBowlShortName() {
        return bowlShortName;
    }

    @JsonProperty("bowlShortName")
    public void setBowlShortName(String bowlShortName) {
        this.bowlShortName = bowlShortName;
    }

    @JsonProperty("isCaptain")
    public Boolean getIsCaptain() {
        return isCaptain;
    }

    @JsonProperty("isCaptain")
    public void setIsCaptain(Boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    @JsonProperty("isKeeper")
    public Boolean getIsKeeper() {
        return isKeeper;
    }

    @JsonProperty("isKeeper")
    public void setIsKeeper(Boolean isKeeper) {
        this.isKeeper = isKeeper;
    }

    @JsonProperty("overs")
    public Integer getOvers() {
        return overs;
    }

    @JsonProperty("overs")
    public void setOvers(Integer overs) {
        this.overs = overs;
    }

    @JsonProperty("maidens")
    public Integer getMaidens() {
        return maidens;
    }

    @JsonProperty("maidens")
    public void setMaidens(Integer maidens) {
        this.maidens = maidens;
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

    @JsonProperty("economy")
    public Integer getEconomy() {
        return economy;
    }

    @JsonProperty("economy")
    public void setEconomy(Integer economy) {
        this.economy = economy;
    }

    @JsonProperty("no_balls")
    public Integer getNoBalls() {
        return noBalls;
    }

    @JsonProperty("no_balls")
    public void setNoBalls(Integer noBalls) {
        this.noBalls = noBalls;
    }

    @JsonProperty("wides")
    public Integer getWides() {
        return wides;
    }

    @JsonProperty("wides")
    public void setWides(Integer wides) {
        this.wides = wides;
    }

    @JsonProperty("dots")
    public Integer getDots() {
        return dots;
    }

    @JsonProperty("dots")
    public void setDots(Integer dots) {
        this.dots = dots;
    }

    @JsonProperty("balls")
    public Integer getBalls() {
        return balls;
    }

    @JsonProperty("balls")
    public void setBalls(Integer balls) {
        this.balls = balls;
    }

    @JsonProperty("runsPerBall")
    public Double getRunsPerBall() {
        return runsPerBall;
    }

    @JsonProperty("runsPerBall")
    public void setRunsPerBall(Double runsPerBall) {
        this.runsPerBall = runsPerBall;
    }

    @JsonProperty("isOverseas")
    public Boolean getIsOverseas() {
        return isOverseas;
    }

    @JsonProperty("isOverseas")
    public void setIsOverseas(Boolean isOverseas) {
        this.isOverseas = isOverseas;
    }

    @JsonProperty("inMatchChange")
    public String getInMatchChange() {
        return inMatchChange;
    }

    @JsonProperty("inMatchChange")
    public void setInMatchChange(String inMatchChange) {
        this.inMatchChange = inMatchChange;
    }

    @JsonProperty("playingXIChange")
    public String getPlayingXIChange() {
        return playingXIChange;
    }

    @JsonProperty("playingXIChange")
    public void setPlayingXIChange(String playingXIChange) {
        this.playingXIChange = playingXIChange;
    }

}
