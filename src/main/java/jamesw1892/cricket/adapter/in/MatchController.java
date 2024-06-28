package jamesw1892.cricket.adapter.in;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/match")
public class MatchController {

  @GetMapping
  public String listMatches() {
    return "";
  }

  @GetMapping("/{id}")
  public String getMatch(@RequestParam int id) {
    return new String();
  }
}
