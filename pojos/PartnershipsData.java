
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pat_1",
    "pat_2",
    "pat_3",
    "pat_4",
    "pat_5",
    "pat_6",
    "pat_7"
})
public class PartnershipsData {

    @JsonProperty("pat_1")
    private Pat1 pat1;
    @JsonProperty("pat_2")
    private Pat2 pat2;
    @JsonProperty("pat_3")
    private Pat3 pat3;
    @JsonProperty("pat_4")
    private Pat4 pat4;
    @JsonProperty("pat_5")
    private Pat5 pat5;
    @JsonProperty("pat_6")
    private Pat6 pat6;
    @JsonProperty("pat_7")
    private Pat7 pat7;

    @JsonProperty("pat_1")
    public Pat1 getPat1() {
        return pat1;
    }

    @JsonProperty("pat_1")
    public void setPat1(Pat1 pat1) {
        this.pat1 = pat1;
    }

    @JsonProperty("pat_2")
    public Pat2 getPat2() {
        return pat2;
    }

    @JsonProperty("pat_2")
    public void setPat2(Pat2 pat2) {
        this.pat2 = pat2;
    }

    @JsonProperty("pat_3")
    public Pat3 getPat3() {
        return pat3;
    }

    @JsonProperty("pat_3")
    public void setPat3(Pat3 pat3) {
        this.pat3 = pat3;
    }

    @JsonProperty("pat_4")
    public Pat4 getPat4() {
        return pat4;
    }

    @JsonProperty("pat_4")
    public void setPat4(Pat4 pat4) {
        this.pat4 = pat4;
    }

    @JsonProperty("pat_5")
    public Pat5 getPat5() {
        return pat5;
    }

    @JsonProperty("pat_5")
    public void setPat5(Pat5 pat5) {
        this.pat5 = pat5;
    }

    @JsonProperty("pat_6")
    public Pat6 getPat6() {
        return pat6;
    }

    @JsonProperty("pat_6")
    public void setPat6(Pat6 pat6) {
        this.pat6 = pat6;
    }

    @JsonProperty("pat_7")
    public Pat7 getPat7() {
        return pat7;
    }

    @JsonProperty("pat_7")
    public void setPat7(Pat7 pat7) {
        this.pat7 = pat7;
    }

}
