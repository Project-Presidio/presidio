/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidio;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GABY
 */
public class SurveyTest {
    
    public SurveyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of answerList method, of class Survey.
     */
    @org.junit.Test
    public void testAnswerList() {
        System.out.println("answerList");
        Survey instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.answerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class Survey.
     */
    @org.junit.Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        Survey instance = null;
        String expResult = "";
        String result = instance.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class Survey.
     */
    @org.junit.Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        String question = "";
        Survey instance = null;
        instance.setQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer method, of class Survey.
     */
    @org.junit.Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        Survey instance = null;
        String expResult = "";
        String result = instance.getAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer method, of class Survey.
     */
    @org.junit.Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String answer = "";
        Survey instance = null;
        instance.setAnswer(answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswerList method, of class Survey.
     */
    @org.junit.Test
    public void testGetAnswerList() {
        System.out.println("getAnswerList");
        Survey instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAnswerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswerList method, of class Survey.
     */
    @org.junit.Test
    public void testSetAnswerList() {
        System.out.println("setAnswerList");
        ArrayList answerList = null;
        Survey instance = null;
        instance.setAnswerList(answerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
