
package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bat_1",
    "bat_2",
    "bat_3",
    "bat_4",
    "bat_5",
    "bat_6",
    "bat_7",
    "bat_8",
    "bat_9",
    "bat_10",
    "bat_11",
    "bat_12"
})
public class BatsmenData {

    @JsonProperty("bat_1")
    private Bat1 bat1;
    @JsonProperty("bat_2")
    private Bat2 bat2;
    @JsonProperty("bat_3")
    private Bat3 bat3;
    @JsonProperty("bat_4")
    private Bat4 bat4;
    @JsonProperty("bat_5")
    private Bat5 bat5;
    @JsonProperty("bat_6")
    private Bat6 bat6;
    @JsonProperty("bat_7")
    private Bat7 bat7;
    @JsonProperty("bat_8")
    private Bat8 bat8;
    @JsonProperty("bat_9")
    private Bat9 bat9;
    @JsonProperty("bat_10")
    private Bat10 bat10;
    @JsonProperty("bat_11")
    private Bat11 bat11;
    @JsonProperty("bat_12")
    private Bat12 bat12;

    @JsonProperty("bat_1")
    public Bat1 getBat1() {
        return bat1;
    }

    @JsonProperty("bat_1")
    public void setBat1(Bat1 bat1) {
        this.bat1 = bat1;
    }

    @JsonProperty("bat_2")
    public Bat2 getBat2() {
        return bat2;
    }

    @JsonProperty("bat_2")
    public void setBat2(Bat2 bat2) {
        this.bat2 = bat2;
    }

    @JsonProperty("bat_3")
    public Bat3 getBat3() {
        return bat3;
    }

    @JsonProperty("bat_3")
    public void setBat3(Bat3 bat3) {
        this.bat3 = bat3;
    }

    @JsonProperty("bat_4")
    public Bat4 getBat4() {
        return bat4;
    }

    @JsonProperty("bat_4")
    public void setBat4(Bat4 bat4) {
        this.bat4 = bat4;
    }

    @JsonProperty("bat_5")
    public Bat5 getBat5() {
        return bat5;
    }

    @JsonProperty("bat_5")
    public void setBat5(Bat5 bat5) {
        this.bat5 = bat5;
    }

    @JsonProperty("bat_6")
    public Bat6 getBat6() {
        return bat6;
    }

    @JsonProperty("bat_6")
    public void setBat6(Bat6 bat6) {
        this.bat6 = bat6;
    }

    @JsonProperty("bat_7")
    public Bat7 getBat7() {
        return bat7;
    }

    @JsonProperty("bat_7")
    public void setBat7(Bat7 bat7) {
        this.bat7 = bat7;
    }

    @JsonProperty("bat_8")
    public Bat8 getBat8() {
        return bat8;
    }

    @JsonProperty("bat_8")
    public void setBat8(Bat8 bat8) {
        this.bat8 = bat8;
    }

    @JsonProperty("bat_9")
    public Bat9 getBat9() {
        return bat9;
    }

    @JsonProperty("bat_9")
    public void setBat9(Bat9 bat9) {
        this.bat9 = bat9;
    }

    @JsonProperty("bat_10")
    public Bat10 getBat10() {
        return bat10;
    }

    @JsonProperty("bat_10")
    public void setBat10(Bat10 bat10) {
        this.bat10 = bat10;
    }

    @JsonProperty("bat_11")
    public Bat11 getBat11() {
        return bat11;
    }

    @JsonProperty("bat_11")
    public void setBat11(Bat11 bat11) {
        this.bat11 = bat11;
    }

    @JsonProperty("bat_12")
    public Bat12 getBat12() {
        return bat12;
    }

    @JsonProperty("bat_12")
    public void setBat12(Bat12 bat12) {
        this.bat12 = bat12;
    }

}
