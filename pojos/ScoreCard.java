
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "matchId",
    "inningsId",
    "timeScore",
    "batTeamDetails",
    "bowlTeamDetails",
    "scoreDetails",
    "extrasData",
    "ppData",
    "wicketsData",
    "partnershipsData"
})

public class ScoreCard {

    @JsonProperty("matchId")
    private Integer matchId;
    @JsonProperty("inningsId")
    private Integer inningsId;
    @JsonProperty("timeScore")
    private Long timeScore;
    @JsonProperty("batTeamDetails")
    private BatTeamDetails batTeamDetails;
    @JsonProperty("bowlTeamDetails")
    private BowlTeamDetails bowlTeamDetails;
    @JsonProperty("scoreDetails")
    private ScoreDetails scoreDetails;
    @JsonProperty("extrasData")
    private ExtrasData extrasData;
    @JsonProperty("ppData")
    private PpData ppData;
    @JsonProperty("wicketsData")
    private WicketsData wicketsData;
    @JsonProperty("partnershipsData")
    private PartnershipsData partnershipsData;

    @JsonProperty("matchId")
    public Integer getMatchId() {
        return matchId;
    }

    @JsonProperty("inningsId")
    public Integer getInningsId() {
        return inningsId;
    }

    @JsonProperty("timeScore")
    public Long getTimeScore() {
        return timeScore;
    }

    @JsonProperty("batTeamDetails")
    public BatTeamDetails getBatTeamDetails() {
        return batTeamDetails;
    }

    @JsonProperty("bowlTeamDetails")
    public BowlTeamDetails getBowlTeamDetails() {
        return bowlTeamDetails;
    }

    @JsonProperty("scoreDetails")
    public ScoreDetails getScoreDetails() {
        return scoreDetails;
    }

    @JsonProperty("extrasData")
    public ExtrasData getExtrasData() {
        return extrasData;
    }

    @JsonProperty("ppData")
    public PpData getPpData() {
        return ppData;
    }

    @JsonProperty("wicketsData")
    public WicketsData getWicketsData() {
        return wicketsData;
    }

    @JsonProperty("partnershipsData")
    public PartnershipsData getPartnershipsData() {
        return partnershipsData;
    }
}
