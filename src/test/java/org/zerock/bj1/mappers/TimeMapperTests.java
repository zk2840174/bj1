package org.zerock.bj1.mappers;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class TimeMapperTests {

    @Autowired(required = false)
    TimeMapper timeMapper;

    @Test
    public void testTime(){

        log.info("testTime...................");

        log.info(timeMapper.getTime());

    }
}
