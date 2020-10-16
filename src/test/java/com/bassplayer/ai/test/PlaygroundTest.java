package com.bassplayer.ai.test;

import com.bassplayer.ai.Playground;
import org.junit.Assert;

public class PlaygroundTest {

    public void testCount(){
        Playground pg = new Playground();
        String str = "Hello world!";
        Assert.assertEquals(str.length(),pg.count(str));
    }
}
