
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "batId",
    "batName",
    "batShortName",
    "isCaptain",
    "isKeeper",
    "runs",
    "balls",
    "dots",
    "fours",
    "sixes",
    "mins",
    "strikeRate",
    "outDesc",
    "bowlerId",
    "fielderId1",
    "fielderId2",
    "fielderId3",
    "ones",
    "twos",
    "threes",
    "fives",
    "boundaries",
    "sixers",
    "wicketCode",
    "isOverseas",
    "inMatchChange",
    "playingXIChange"
})
public class Bat5 {

    @JsonProperty("batId")
    private Integer batId;
    @JsonProperty("batName")
    private String batName;
    @JsonProperty("batShortName")
    private String batShortName;
    @JsonProperty("isCaptain")
    private Boolean isCaptain;
    @JsonProperty("isKeeper")
    private Boolean isKeeper;
    @JsonProperty("runs")
    private Integer runs;
    @JsonProperty("balls")
    private Integer balls;
    @JsonProperty("dots")
    private Integer dots;
    @JsonProperty("fours")
    private Integer fours;
    @JsonProperty("sixes")
    private Integer sixes;
    @JsonProperty("mins")
    private Integer mins;
    @JsonProperty("strikeRate")
    private Double strikeRate;
    @JsonProperty("outDesc")
    private String outDesc;
    @JsonProperty("bowlerId")
    private Integer bowlerId;
    @JsonProperty("fielderId1")
    private Integer fielderId1;
    @JsonProperty("fielderId2")
    private Integer fielderId2;
    @JsonProperty("fielderId3")
    private Integer fielderId3;
    @JsonProperty("ones")
    private Integer ones;
    @JsonProperty("twos")
    private Integer twos;
    @JsonProperty("threes")
    private Integer threes;
    @JsonProperty("fives")
    private Integer fives;
    @JsonProperty("boundaries")
    private Integer boundaries;
    @JsonProperty("sixers")
    private Integer sixers;
    @JsonProperty("wicketCode")
    private String wicketCode;
    @JsonProperty("isOverseas")
    private Boolean isOverseas;
    @JsonProperty("inMatchChange")
    private String inMatchChange;
    @JsonProperty("playingXIChange")
    private String playingXIChange;

    @JsonProperty("batId")
    public Integer getBatId() {
        return batId;
    }

    @JsonProperty("batId")
    public void setBatId(Integer batId) {
        this.batId = batId;
    }

    @JsonProperty("batName")
    public String getBatName() {
        return batName;
    }

    @JsonProperty("batName")
    public void setBatName(String batName) {
        this.batName = batName;
    }

    @JsonProperty("batShortName")
    public String getBatShortName() {
        return batShortName;
    }

    @JsonProperty("batShortName")
    public void setBatShortName(String batShortName) {
        this.batShortName = batShortName;
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

    @JsonProperty("runs")
    public Integer getRuns() {
        return runs;
    }

    @JsonProperty("runs")
    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    @JsonProperty("balls")
    public Integer getBalls() {
        return balls;
    }

    @JsonProperty("balls")
    public void setBalls(Integer balls) {
        this.balls = balls;
    }

    @JsonProperty("dots")
    public Integer getDots() {
        return dots;
    }

    @JsonProperty("dots")
    public void setDots(Integer dots) {
        this.dots = dots;
    }

    @JsonProperty("fours")
    public Integer getFours() {
        return fours;
    }

    @JsonProperty("fours")
    public void setFours(Integer fours) {
        this.fours = fours;
    }

    @JsonProperty("sixes")
    public Integer getSixes() {
        return sixes;
    }

    @JsonProperty("sixes")
    public void setSixes(Integer sixes) {
        this.sixes = sixes;
    }

    @JsonProperty("mins")
    public Integer getMins() {
        return mins;
    }

    @JsonProperty("mins")
    public void setMins(Integer mins) {
        this.mins = mins;
    }

    @JsonProperty("strikeRate")
    public Double getStrikeRate() {
        return strikeRate;
    }

    @JsonProperty("strikeRate")
    public void setStrikeRate(Double strikeRate) {
        this.strikeRate = strikeRate;
    }

    @JsonProperty("outDesc")
    public String getOutDesc() {
        return outDesc;
    }

    @JsonProperty("outDesc")
    public void setOutDesc(String outDesc) {
        this.outDesc = outDesc;
    }

    @JsonProperty("bowlerId")
    public Integer getBowlerId() {
        return bowlerId;
    }

    @JsonProperty("bowlerId")
    public void setBowlerId(Integer bowlerId) {
        this.bowlerId = bowlerId;
    }

    @JsonProperty("fielderId1")
    public Integer getFielderId1() {
        return fielderId1;
    }

    @JsonProperty("fielderId1")
    public void setFielderId1(Integer fielderId1) {
        this.fielderId1 = fielderId1;
    }

    @JsonProperty("fielderId2")
    public Integer getFielderId2() {
        return fielderId2;
    }

    @JsonProperty("fielderId2")
    public void setFielderId2(Integer fielderId2) {
        this.fielderId2 = fielderId2;
    }

    @JsonProperty("fielderId3")
    public Integer getFielderId3() {
        return fielderId3;
    }

    @JsonProperty("fielderId3")
    public void setFielderId3(Integer fielderId3) {
        this.fielderId3 = fielderId3;
    }

    @JsonProperty("ones")
    public Integer getOnes() {
        return ones;
    }

    @JsonProperty("ones")
    public void setOnes(Integer ones) {
        this.ones = ones;
    }

    @JsonProperty("twos")
    public Integer getTwos() {
        return twos;
    }

    @JsonProperty("twos")
    public void setTwos(Integer twos) {
        this.twos = twos;
    }

    @JsonProperty("threes")
    public Integer getThrees() {
        return threes;
    }

    @JsonProperty("threes")
    public void setThrees(Integer threes) {
        this.threes = threes;
    }

    @JsonProperty("fives")
    public Integer getFives() {
        return fives;
    }

    @JsonProperty("fives")
    public void setFives(Integer fives) {
        this.fives = fives;
    }

    @JsonProperty("boundaries")
    public Integer getBoundaries() {
        return boundaries;
    }

    @JsonProperty("boundaries")
    public void setBoundaries(Integer boundaries) {
        this.boundaries = boundaries;
    }

    @JsonProperty("sixers")
    public Integer getSixers() {
        return sixers;
    }

    @JsonProperty("sixers")
    public void setSixers(Integer sixers) {
        this.sixers = sixers;
    }

    @JsonProperty("wicketCode")
    public String getWicketCode() {
        return wicketCode;
    }

    @JsonProperty("wicketCode")
    public void setWicketCode(String wicketCode) {
        this.wicketCode = wicketCode;
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
