
package pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scoreCard"
})

public class MainPojo 
{
    @JsonProperty("scoreCard")
    private List<ScoreCard> scoreCard;

    @JsonProperty("scoreCard")
    public List<ScoreCard> getScoreCard() {
        return scoreCard;
    }

}
