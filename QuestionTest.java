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
public class QuestionTest {
    
    public QuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of promptList method, of class Question.
     */
    @org.junit.Test
    public void testPromptList() {
        System.out.println("promptList");
        Question instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.promptList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionType method, of class Question.
     */
    @org.junit.Test
    public void testGetQuestionType() {
        System.out.println("getQuestionType");
        Question instance = null;
        String expResult = "";
        String result = instance.getQuestionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionType method, of class Question.
     */
    @org.junit.Test
    public void testSetQuestionType() {
        System.out.println("setQuestionType");
        String questionType = "";
        Question instance = null;
        instance.setQuestionType(questionType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class Question.
     */
    @org.junit.Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        Question instance = null;
        String expResult = "";
        String result = instance.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class Question.
     */
    @org.junit.Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        String question = "";
        Question instance = null;
        instance.setQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPromptList method, of class Question.
     */
    @org.junit.Test
    public void testGetPromptList() {
        System.out.println("getPromptList");
        Question instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPromptList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPromptList method, of class Question.
     */
    @org.junit.Test
    public void testSetPromptList() {
        System.out.println("setPromptList");
        ArrayList promptList = null;
        Question instance = null;
        instance.setPromptList(promptList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
