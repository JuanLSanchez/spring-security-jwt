package es.juanlsanchez.springsecurityjwt.web.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextDTO {

  @JsonProperty("text")
  private String text;
  @JsonProperty("instant")
  private Instant instant;

}
