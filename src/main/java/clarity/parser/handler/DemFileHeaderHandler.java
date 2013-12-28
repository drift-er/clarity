package clarity.parser.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import clarity.match.Match;
import clarity.parser.Handler;

import com.dota2.proto.Demo.CDemoFileHeader;

public class DemFileHeaderHandler implements Handler<CDemoFileHeader> {

    private final Logger log = LoggerFactory.getLogger(getClass());
    
    @Override
    public void apply(CDemoFileHeader message, Match match) {
        log.trace("{}\n{}", message.getClass().getSimpleName(), message);
    }

}