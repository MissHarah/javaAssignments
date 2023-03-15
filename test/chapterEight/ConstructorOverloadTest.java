package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorOverloadTest {
    ConstructorOverload constructorOverload;

    @BeforeEach
    @Test
    public void setUp(){
        constructorOverload = new ConstructorOverload();
        assertNotNull(constructorOverload);

    }
    @Test
    public void testName(){

        constructorOverload.setName("neefah");

        assertEquals("neefah",   constructorOverload.getName() );


    }
    @Test
    public void  testLocation(){
//        constructorOverload.setLocation();

    }


    }

