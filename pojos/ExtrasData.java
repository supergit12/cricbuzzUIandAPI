
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "noBalls",
    "total",
    "byes",
    "penalty",
    "wides",
    "legByes"
})
public class ExtrasData {

    @JsonProperty("noBalls")
    private Integer noBalls;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("byes")
    private Integer byes;
    @JsonProperty("penalty")
    private Integer penalty;
    @JsonProperty("wides")
    private Integer wides;
    @JsonProperty("legByes")
    private Integer legByes;

    @JsonProperty("noBalls")
    public Integer getNoBalls() {
        return noBalls;
    }

    @JsonProperty("noBalls")
    public void setNoBalls(Integer noBalls) {
        this.noBalls = noBalls;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("byes")
    public Integer getByes() {
        return byes;
    }

    @JsonProperty("byes")
    public void setByes(Integer byes) {
        this.byes = byes;
    }

    @JsonProperty("penalty")
    public Integer getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    @JsonProperty("wides")
    public Integer getWides() {
        return wides;
    }

    @JsonProperty("wides")
    public void setWides(Integer wides) {
        this.wides = wides;
    }

    @JsonProperty("legByes")
    public Integer getLegByes() {
        return legByes;
    }

    @JsonProperty("legByes")
    public void setLegByes(Integer legByes) {
        this.legByes = legByes;
    }

}
