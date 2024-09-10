
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bat1Id",
    "bat1Name",
    "bat1Runs",
    "bat1fours",
    "bat1sixes",
    "bat2Id",
    "bat2Name",
    "bat2Runs",
    "bat2fours",
    "bat2sixes",
    "totalRuns",
    "totalBalls",
    "bat1balls",
    "bat2balls",
    "bat1Ones",
    "bat1Twos",
    "bat1Threes",
    "bat1Fives",
    "bat1Boundaries",
    "bat1Sixers",
    "bat2Ones",
    "bat2Twos",
    "bat2Threes",
    "bat2Fives",
    "bat2Boundaries",
    "bat2Sixers"
})
public class Pat1 {

    @JsonProperty("bat1Id")
    private Integer bat1Id;
    @JsonProperty("bat1Name")
    private String bat1Name;
    @JsonProperty("bat1Runs")
    private Integer bat1Runs;
    @JsonProperty("bat1fours")
    private Integer bat1fours;
    @JsonProperty("bat1sixes")
    private Integer bat1sixes;
    @JsonProperty("bat2Id")
    private Integer bat2Id;
    @JsonProperty("bat2Name")
    private String bat2Name;
    @JsonProperty("bat2Runs")
    private Integer bat2Runs;
    @JsonProperty("bat2fours")
    private Integer bat2fours;
    @JsonProperty("bat2sixes")
    private Integer bat2sixes;
    @JsonProperty("totalRuns")
    private Integer totalRuns;
    @JsonProperty("totalBalls")
    private Integer totalBalls;
    @JsonProperty("bat1balls")
    private Integer bat1balls;
    @JsonProperty("bat2balls")
    private Integer bat2balls;
    @JsonProperty("bat1Ones")
    private Integer bat1Ones;
    @JsonProperty("bat1Twos")
    private Integer bat1Twos;
    @JsonProperty("bat1Threes")
    private Integer bat1Threes;
    @JsonProperty("bat1Fives")
    private Integer bat1Fives;
    @JsonProperty("bat1Boundaries")
    private Integer bat1Boundaries;
    @JsonProperty("bat1Sixers")
    private Integer bat1Sixers;
    @JsonProperty("bat2Ones")
    private Integer bat2Ones;
    @JsonProperty("bat2Twos")
    private Integer bat2Twos;
    @JsonProperty("bat2Threes")
    private Integer bat2Threes;
    @JsonProperty("bat2Fives")
    private Integer bat2Fives;
    @JsonProperty("bat2Boundaries")
    private Integer bat2Boundaries;
    @JsonProperty("bat2Sixers")
    private Integer bat2Sixers;

    @JsonProperty("bat1Id")
    public Integer getBat1Id() {
        return bat1Id;
    }

    @JsonProperty("bat1Id")
    public void setBat1Id(Integer bat1Id) {
        this.bat1Id = bat1Id;
    }

    @JsonProperty("bat1Name")
    public String getBat1Name() {
        return bat1Name;
    }

    @JsonProperty("bat1Name")
    public void setBat1Name(String bat1Name) {
        this.bat1Name = bat1Name;
    }

    @JsonProperty("bat1Runs")
    public Integer getBat1Runs() {
        return bat1Runs;
    }

    @JsonProperty("bat1Runs")
    public void setBat1Runs(Integer bat1Runs) {
        this.bat1Runs = bat1Runs;
    }

    @JsonProperty("bat1fours")
    public Integer getBat1fours() {
        return bat1fours;
    }

    @JsonProperty("bat1fours")
    public void setBat1fours(Integer bat1fours) {
        this.bat1fours = bat1fours;
    }

    @JsonProperty("bat1sixes")
    public Integer getBat1sixes() {
        return bat1sixes;
    }

    @JsonProperty("bat1sixes")
    public void setBat1sixes(Integer bat1sixes) {
        this.bat1sixes = bat1sixes;
    }

    @JsonProperty("bat2Id")
    public Integer getBat2Id() {
        return bat2Id;
    }

    @JsonProperty("bat2Id")
    public void setBat2Id(Integer bat2Id) {
        this.bat2Id = bat2Id;
    }

    @JsonProperty("bat2Name")
    public String getBat2Name() {
        return bat2Name;
    }

    @JsonProperty("bat2Name")
    public void setBat2Name(String bat2Name) {
        this.bat2Name = bat2Name;
    }

    @JsonProperty("bat2Runs")
    public Integer getBat2Runs() {
        return bat2Runs;
    }

    @JsonProperty("bat2Runs")
    public void setBat2Runs(Integer bat2Runs) {
        this.bat2Runs = bat2Runs;
    }

    @JsonProperty("bat2fours")
    public Integer getBat2fours() {
        return bat2fours;
    }

    @JsonProperty("bat2fours")
    public void setBat2fours(Integer bat2fours) {
        this.bat2fours = bat2fours;
    }

    @JsonProperty("bat2sixes")
    public Integer getBat2sixes() {
        return bat2sixes;
    }

    @JsonProperty("bat2sixes")
    public void setBat2sixes(Integer bat2sixes) {
        this.bat2sixes = bat2sixes;
    }

    @JsonProperty("totalRuns")
    public Integer getTotalRuns() {
        return totalRuns;
    }

    @JsonProperty("totalRuns")
    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }

    @JsonProperty("totalBalls")
    public Integer getTotalBalls() {
        return totalBalls;
    }

    @JsonProperty("totalBalls")
    public void setTotalBalls(Integer totalBalls) {
        this.totalBalls = totalBalls;
    }

    @JsonProperty("bat1balls")
    public Integer getBat1balls() {
        return bat1balls;
    }

    @JsonProperty("bat1balls")
    public void setBat1balls(Integer bat1balls) {
        this.bat1balls = bat1balls;
    }

    @JsonProperty("bat2balls")
    public Integer getBat2balls() {
        return bat2balls;
    }

    @JsonProperty("bat2balls")
    public void setBat2balls(Integer bat2balls) {
        this.bat2balls = bat2balls;
    }

    @JsonProperty("bat1Ones")
    public Integer getBat1Ones() {
        return bat1Ones;
    }

    @JsonProperty("bat1Ones")
    public void setBat1Ones(Integer bat1Ones) {
        this.bat1Ones = bat1Ones;
    }

    @JsonProperty("bat1Twos")
    public Integer getBat1Twos() {
        return bat1Twos;
    }

    @JsonProperty("bat1Twos")
    public void setBat1Twos(Integer bat1Twos) {
        this.bat1Twos = bat1Twos;
    }

    @JsonProperty("bat1Threes")
    public Integer getBat1Threes() {
        return bat1Threes;
    }

    @JsonProperty("bat1Threes")
    public void setBat1Threes(Integer bat1Threes) {
        this.bat1Threes = bat1Threes;
    }

    @JsonProperty("bat1Fives")
    public Integer getBat1Fives() {
        return bat1Fives;
    }

    @JsonProperty("bat1Fives")
    public void setBat1Fives(Integer bat1Fives) {
        this.bat1Fives = bat1Fives;
    }

    @JsonProperty("bat1Boundaries")
    public Integer getBat1Boundaries() {
        return bat1Boundaries;
    }

    @JsonProperty("bat1Boundaries")
    public void setBat1Boundaries(Integer bat1Boundaries) {
        this.bat1Boundaries = bat1Boundaries;
    }

    @JsonProperty("bat1Sixers")
    public Integer getBat1Sixers() {
        return bat1Sixers;
    }

    @JsonProperty("bat1Sixers")
    public void setBat1Sixers(Integer bat1Sixers) {
        this.bat1Sixers = bat1Sixers;
    }

    @JsonProperty("bat2Ones")
    public Integer getBat2Ones() {
        return bat2Ones;
    }

    @JsonProperty("bat2Ones")
    public void setBat2Ones(Integer bat2Ones) {
        this.bat2Ones = bat2Ones;
    }

    @JsonProperty("bat2Twos")
    public Integer getBat2Twos() {
        return bat2Twos;
    }

    @JsonProperty("bat2Twos")
    public void setBat2Twos(Integer bat2Twos) {
        this.bat2Twos = bat2Twos;
    }

    @JsonProperty("bat2Threes")
    public Integer getBat2Threes() {
        return bat2Threes;
    }

    @JsonProperty("bat2Threes")
    public void setBat2Threes(Integer bat2Threes) {
        this.bat2Threes = bat2Threes;
    }

    @JsonProperty("bat2Fives")
    public Integer getBat2Fives() {
        return bat2Fives;
    }

    @JsonProperty("bat2Fives")
    public void setBat2Fives(Integer bat2Fives) {
        this.bat2Fives = bat2Fives;
    }

    @JsonProperty("bat2Boundaries")
    public Integer getBat2Boundaries() {
        return bat2Boundaries;
    }

    @JsonProperty("bat2Boundaries")
    public void setBat2Boundaries(Integer bat2Boundaries) {
        this.bat2Boundaries = bat2Boundaries;
    }

    @JsonProperty("bat2Sixers")
    public Integer getBat2Sixers() {
        return bat2Sixers;
    }

    @JsonProperty("bat2Sixers")
    public void setBat2Sixers(Integer bat2Sixers) {
        this.bat2Sixers = bat2Sixers;
    }

}
