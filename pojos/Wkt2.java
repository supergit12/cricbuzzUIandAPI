
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "batId",
    "batName",
    "wktNbr",
    "wktOver",
    "wktRuns",
    "ballNbr"
})
public class Wkt2 {

    @JsonProperty("batId")
    private Integer batId;
    @JsonProperty("batName")
    private String batName;
    @JsonProperty("wktNbr")
    private Integer wktNbr;
    @JsonProperty("wktOver")
    private Double wktOver;
    @JsonProperty("wktRuns")
    private Integer wktRuns;
    @JsonProperty("ballNbr")
    private Integer ballNbr;

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

    @JsonProperty("wktNbr")
    public Integer getWktNbr() {
        return wktNbr;
    }

    @JsonProperty("wktNbr")
    public void setWktNbr(Integer wktNbr) {
        this.wktNbr = wktNbr;
    }

    @JsonProperty("wktOver")
    public Double getWktOver() {
        return wktOver;
    }

    @JsonProperty("wktOver")
    public void setWktOver(Double wktOver) {
        this.wktOver = wktOver;
    }

    @JsonProperty("wktRuns")
    public Integer getWktRuns() {
        return wktRuns;
    }

    @JsonProperty("wktRuns")
    public void setWktRuns(Integer wktRuns) {
        this.wktRuns = wktRuns;
    }

    @JsonProperty("ballNbr")
    public Integer getBallNbr() {
        return ballNbr;
    }

    @JsonProperty("ballNbr")
    public void setBallNbr(Integer ballNbr) {
        this.ballNbr = ballNbr;
    }

}
