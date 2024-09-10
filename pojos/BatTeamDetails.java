
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "batTeamId",
    "batTeamName",
    "batTeamShortName",
    "batsmenData"
})
public class BatTeamDetails {

    @JsonProperty("batTeamId")
    private Integer batTeamId;
    @JsonProperty("batTeamName")
    private String batTeamName;
    @JsonProperty("batTeamShortName")
    private String batTeamShortName;
    @JsonProperty("batsmenData")
    private BatsmenData batsmenData;

    @JsonProperty("batTeamId")
    public Integer getBatTeamId() {
        return batTeamId;
    }

    @JsonProperty("batTeamId")
    public void setBatTeamId(Integer batTeamId) {
        this.batTeamId = batTeamId;
    }

    @JsonProperty("batTeamName")
    public String getBatTeamName() {
        return batTeamName;
    }

    @JsonProperty("batTeamName")
    public void setBatTeamName(String batTeamName) {
        this.batTeamName = batTeamName;
    }

    @JsonProperty("batTeamShortName")
    public String getBatTeamShortName() {
        return batTeamShortName;
    }

    @JsonProperty("batTeamShortName")
    public void setBatTeamShortName(String batTeamShortName) {
        this.batTeamShortName = batTeamShortName;
    }

    @JsonProperty("batsmenData")
    public BatsmenData getBatsmenData() {
        return batsmenData;
    }

    @JsonProperty("batsmenData")
    public void setBatsmenData(BatsmenData batsmenData) {
        this.batsmenData = batsmenData;
    }

}
