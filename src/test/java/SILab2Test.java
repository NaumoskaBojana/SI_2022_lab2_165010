import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SILab2Test {

    @Test
    public void everyStatementTesting(){

        List<String> emptylist = Collections.emptyList();
        try {
            SILab2.function(emptylist);
        }
        catch (IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"List length should be greater than 0"); }

        List<String> noSquarelist = Arrays.asList("#","#","#","#","#");
        try {
            SILab2.function(noSquarelist);
        }
        catch (IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"List length should be a perfect square"); }

        List<String> test1list1 = Arrays.asList("0","#","0","#");
        List<String> test1list2 = Arrays.asList("1","#","1","#");
        try {
            assertEquals( test1list2, SILab2.function(test1list1) );
            System.out.println( Arrays.toString(SILab2.function(test1list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> test2list1 = Arrays.asList("0","#","#","#");
        List<String> test2list2 = Arrays.asList("2","#","#","#");
        try {
            assertEquals( test2list2, SILab2.function(test2list1) );
            System.out.println( Arrays.toString(SILab2.function(test2list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> test3list1 = Arrays.asList("#","#","#","#");
        List<String> test3list2 = Arrays.asList("#","#","#","#");
        try {
            assertEquals( test3list2, SILab2.function(test3list1) );
            System.out.println( Arrays.toString(SILab2.function(test3list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> test4list1 = Arrays.asList("0","0","0","0");
        List<String> test4list2 = Arrays.asList("0","0","0","0");
        try {
            assertEquals( test4list2, SILab2.function(test4list1) );
            System.out.println( Arrays.toString(SILab2.function(test4list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void everyBranchTesting(){

        List<String> emptylist = Collections.emptyList();

        try {
            SILab2.function(emptylist);
        }
        catch (IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"List length should be greater than 0"); }

        List<String> noSquarelist = Arrays.asList("#","#","#","#","#");
        try {
            SILab2.function(noSquarelist);
        }
        catch (IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"List length should be a perfect square"); }

        List<String> test1list1 = Arrays.asList("0","#","0","#");
        List<String> test1list2 = Arrays.asList("1","#","1","#");
        try {
            assertEquals( test1list2, SILab2.function(test1list1) );
            System.out.println( Arrays.toString(SILab2.function(test1list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> test2list1 = Arrays.asList("0","#","#","#");
        List<String> test2list2 = Arrays.asList("2","#","#","#");
        try {
            assertEquals( test2list2, SILab2.function(test2list1) );
            System.out.println( Arrays.toString(SILab2.function(test2list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> test3list1 = Arrays.asList("#","#","#","#");
        List<String> test3list2 = Arrays.asList("#","#","#","#");
        try {
            assertEquals( test3list2, SILab2.function(test3list1) );
            System.out.println( Arrays.toString(SILab2.function(test3list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> test4list1 = Arrays.asList("0","0","0","0");
        List<String> test4list2 = Arrays.asList("0","0","0","0");
        try {
            assertEquals( test4list2, SILab2.function(test4list1) );
            System.out.println( Arrays.toString(SILab2.function(test4list1).toArray() ) );

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
