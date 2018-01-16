package com.git.zaq12392;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Scanner;

public class MainTest {

  @Test
  public void Main() throws IOException {
    Input ask = new Input();
    Main main = new Main();
    main.main(null);
    /*Assert.assertEquals(1,ask.ask());
    Assert.assertEquals(1,ask.ask());
    Assert.assertEquals(1,ask.ask());
    Assert.assertEquals(1,ask.ask());
    Assert.assertEquals(1,ask.ask());*/
  }
}