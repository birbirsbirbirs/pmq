package co.ptm.pmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/mq")
public class HeroController {

    private final HeroService heroService;

    @PostMapping
    public boolean publish(@RequestBody Hero hero) {
        return heroService.publish(hero);
    }
}
