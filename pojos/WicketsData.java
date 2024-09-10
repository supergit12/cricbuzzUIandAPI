
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wkt_1",
    "wkt_2",
    "wkt_3",
    "wkt_4",
    "wkt_5",
    "wkt_6"
})
public class WicketsData {

    @JsonProperty("wkt_1")
    private Wkt1 wkt1;
    @JsonProperty("wkt_2")
    private Wkt2 wkt2;
    @JsonProperty("wkt_3")
    private Wkt3 wkt3;
    @JsonProperty("wkt_4")
    private Wkt4 wkt4;
    @JsonProperty("wkt_5")
    private Wkt5 wkt5;
    @JsonProperty("wkt_6")
    private Wkt6 wkt6;

    @JsonProperty("wkt_1")
    public Wkt1 getWkt1() {
        return wkt1;
    }

    @JsonProperty("wkt_1")
    public void setWkt1(Wkt1 wkt1) {
        this.wkt1 = wkt1;
    }

    @JsonProperty("wkt_2")
    public Wkt2 getWkt2() {
        return wkt2;
    }

    @JsonProperty("wkt_2")
    public void setWkt2(Wkt2 wkt2) {
        this.wkt2 = wkt2;
    }

    @JsonProperty("wkt_3")
    public Wkt3 getWkt3() {
        return wkt3;
    }

    @JsonProperty("wkt_3")
    public void setWkt3(Wkt3 wkt3) {
        this.wkt3 = wkt3;
    }

    @JsonProperty("wkt_4")
    public Wkt4 getWkt4() {
        return wkt4;
    }

    @JsonProperty("wkt_4")
    public void setWkt4(Wkt4 wkt4) {
        this.wkt4 = wkt4;
    }

    @JsonProperty("wkt_5")
    public Wkt5 getWkt5() {
        return wkt5;
    }

    @JsonProperty("wkt_5")
    public void setWkt5(Wkt5 wkt5) {
        this.wkt5 = wkt5;
    }

    @JsonProperty("wkt_6")
    public Wkt6 getWkt6() {
        return wkt6;
    }

    @JsonProperty("wkt_6")
    public void setWkt6(Wkt6 wkt6) {
        this.wkt6 = wkt6;
    }

}
