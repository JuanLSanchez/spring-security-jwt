package es.juanlsanchez.springsecurityjwt.web.rest;

import java.net.URISyntaxException;
import java.time.Instant;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.juanlsanchez.springsecurityjwt.web.dto.TextDTO;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class RestResource {

  @RequestMapping(value = "/all", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TextDTO> all() throws URISyntaxException {
    log.debug("REST for all");
    return ResponseEntity.ok(new TextDTO("ok", Instant.now()));
  }

  @RequestMapping(value = "/user", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TextDTO> user() throws URISyntaxException {
    log.debug("REST for user");
    return ResponseEntity.ok(new TextDTO("user", Instant.now()));
  }

  @RequestMapping(value = "/admin", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<TextDTO> admin() throws URISyntaxException {
    log.debug("REST for admin");
    return ResponseEntity.ok(new TextDTO("admin", Instant.now()));
  }

}
