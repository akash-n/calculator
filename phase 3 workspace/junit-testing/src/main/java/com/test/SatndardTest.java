package com.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class SatndardTest{
@BeforeClass
public static void beforeAll(){
System.out.println("Before all test");
}
@BeforeEach
public void beforeEach(){
System.out.println("Before each test cases");
}
@DisplayName("Standard Test")
@Test
public void test(){
System.out.println(" test cases 1 " );}
@Test
public void test1(){
System.out.println(" test cases 2 " );}
@AfterEach
public void afterEach(){
System.out.println(" afterr each test cases" );}
@org.junit.jupiter.api.AfterAll
public static void AfterAll(){
System.out.println(" after all test cases " );}
@Disabled
@Test
public void skippedTest(){
System.out.println(" skipped test case " );}
}