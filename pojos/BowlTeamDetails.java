
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bowlTeamId",
    "bowlTeamName",
    "bowlTeamShortName",
    "bowlersData"
})
public class BowlTeamDetails {

    @JsonProperty("bowlTeamId")
    private Integer bowlTeamId;
    @JsonProperty("bowlTeamName")
    private String bowlTeamName;
    @JsonProperty("bowlTeamShortName")
    private String bowlTeamShortName;
    @JsonProperty("bowlersData")
    private BowlersData bowlersData;

    @JsonProperty("bowlTeamId")
    public Integer getBowlTeamId() {
        return bowlTeamId;
    }

    @JsonProperty("bowlTeamId")
    public void setBowlTeamId(Integer bowlTeamId) {
        this.bowlTeamId = bowlTeamId;
    }

    @JsonProperty("bowlTeamName")
    public String getBowlTeamName() {
        return bowlTeamName;
    }

    @JsonProperty("bowlTeamName")
    public void setBowlTeamName(String bowlTeamName) {
        this.bowlTeamName = bowlTeamName;
    }

    @JsonProperty("bowlTeamShortName")
    public String getBowlTeamShortName() {
        return bowlTeamShortName;
    }

    @JsonProperty("bowlTeamShortName")
    public void setBowlTeamShortName(String bowlTeamShortName) {
        this.bowlTeamShortName = bowlTeamShortName;
    }

    @JsonProperty("bowlersData")
    public BowlersData getBowlersData() {
        return bowlersData;
    }

    @JsonProperty("bowlersData")
    public void setBowlersData(BowlersData bowlersData) {
        this.bowlersData = bowlersData;
    }

}
