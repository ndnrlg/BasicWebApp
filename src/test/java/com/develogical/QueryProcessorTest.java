package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }
    @Test
    public void knowsAboutClass() throws Exception {
        assertThat(queryProcessor.process("class"), containsString("17213"));
    }
     @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("NNCKHR"));
    }


    @Test
    public void knowsNumber() throws Exception {
        assertThat(queryProcessor.process("what is 5 plus 10"), containsString("15"));
    }

    // @Test
    // public void knowsMult() throws Exception {
    //     assertThat(queryProcessor.process("what is 10 multiplied by 5"), containsString("50"));
    // }
    // @Test
    // public void knowsMinus() throws Exception {
    //     assertThat(queryProcessor.process("what is 10 minus 5"), containsString("5"));
    // }


    // @Testxs
    // public void knowsLargest() throws Exception {
    //     assertThat(queryProcessor.process("which of the following numbers is the largest: 1, 2, 4, 3"), containsString("4"));
    // }
}
