
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bowl_4",
    "bowl_3",
    "bowl_6",
    "bowl_5",
    "bowl_2",
    "bowl_1",
    "bowl_7"
})
public class BowlersData {

    @JsonProperty("bowl_4")
    private Bowl4 bowl4;
    @JsonProperty("bowl_3")
    private Bowl3 bowl3;
    @JsonProperty("bowl_6")
    private Bowl6 bowl6;
    @JsonProperty("bowl_5")
    private Bowl5 bowl5;
    @JsonProperty("bowl_2")
    private Bowl2 bowl2;
    @JsonProperty("bowl_1")
    private Bowl1 bowl1;
    @JsonProperty("bowl_7")
    private Bowl7 bowl7;

    @JsonProperty("bowl_4")
    public Bowl4 getBowl4() {
        return bowl4;
    }

    @JsonProperty("bowl_4")
    public void setBowl4(Bowl4 bowl4) {
        this.bowl4 = bowl4;
    }

    @JsonProperty("bowl_3")
    public Bowl3 getBowl3() {
        return bowl3;
    }

    @JsonProperty("bowl_3")
    public void setBowl3(Bowl3 bowl3) {
        this.bowl3 = bowl3;
    }

    @JsonProperty("bowl_6")
    public Bowl6 getBowl6() {
        return bowl6;
    }

    @JsonProperty("bowl_6")
    public void setBowl6(Bowl6 bowl6) {
        this.bowl6 = bowl6;
    }

    @JsonProperty("bowl_5")
    public Bowl5 getBowl5() {
        return bowl5;
    }

    @JsonProperty("bowl_5")
    public void setBowl5(Bowl5 bowl5) {
        this.bowl5 = bowl5;
    }

    @JsonProperty("bowl_2")
    public Bowl2 getBowl2() {
        return bowl2;
    }

    @JsonProperty("bowl_2")
    public void setBowl2(Bowl2 bowl2) {
        this.bowl2 = bowl2;
    }

    @JsonProperty("bowl_1")
    public Bowl1 getBowl1() {
        return bowl1;
    }

    @JsonProperty("bowl_1")
    public void setBowl1(Bowl1 bowl1) {
        this.bowl1 = bowl1;
    }

    @JsonProperty("bowl_7")
    public Bowl7 getBowl7() {
        return bowl7;
    }

    @JsonProperty("bowl_7")
    public void setBowl7(Bowl7 bowl7) {
        this.bowl7 = bowl7;
    }

}
