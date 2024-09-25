package co.ptm.pmq;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HeroService {

    private final JmsTemplate jmsTemplate;

    public boolean publish(Hero hero){

        jmsTemplate.convertAndSend(Application.qName, hero.toString());
        return true;
    }
}
