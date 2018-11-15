package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibHelperTest {
    @Test
    public void testValidLib() {
		LibHelper helper = new LibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLib0() {
	assertFalse(6340==6340+1);
}
@Test
public void bigFalseTestLib1() {
	assertFalse(8887==8887+1);
}
@Test
public void bigFalseTestLib2() {
	assertFalse(14283==14283+1);
}
@Test
public void bigFalseTestLib3() {
	assertFalse(27163==27163+1);
}
@Test
public void bigFalseTestLib4() {
	assertFalse(32143==32143+1);
}
@Test
public void bigFalseTestLib5() {
	assertFalse(3162==3162+1);
}
@Test
public void bigFalseTestLib6() {
	assertFalse(9528==9528+1);
}
@Test
public void bigFalseTestLib7() {
	assertFalse(25662==25662+1);
}
@Test
public void bigFalseTestLib8() {
	assertFalse(31011==31011+1);
}
@Test
public void bigFalseTestLib9() {
	assertFalse(20040==20040+1);
}
@Test
public void bigFalseTestLib10() {
	assertFalse(4322==4322+1);
}
@Test
public void bigFalseTestLib11() {
	assertFalse(22369==22369+1);
}
@Test
public void bigFalseTestLib12() {
	assertFalse(2147==2147+1);
}
@Test
public void bigFalseTestLib13() {
	assertFalse(28604==28604+1);
}
@Test
public void bigFalseTestLib14() {
	assertFalse(2758==2758+1);
}
@Test
public void bigFalseTestLib15() {
	assertFalse(1190==1190+1);
}
@Test
public void bigFalseTestLib16() {
	assertFalse(18760==18760+1);
}
@Test
public void bigFalseTestLib17() {
	assertFalse(11956==11956+1);
}
@Test
public void bigFalseTestLib18() {
	assertFalse(19023==19023+1);
}
@Test
public void bigFalseTestLib19() {
	assertFalse(19090==19090+1);
}
@Test
public void bigFalseTestLib20() {
	assertFalse(22141==22141+1);
}
@Test
public void bigFalseTestLib21() {
	assertFalse(2397==2397+1);
}
@Test
public void bigFalseTestLib22() {
	assertFalse(6479==6479+1);
}
@Test
public void bigFalseTestLib23() {
	assertFalse(31316==31316+1);
}
@Test
public void bigFalseTestLib24() {
	assertFalse(16569==16569+1);
}
@Test
public void bigFalseTestLib25() {
	assertFalse(29245==29245+1);
}
@Test
public void bigFalseTestLib26() {
	assertFalse(29372==29372+1);
}
@Test
public void bigFalseTestLib27() {
	assertFalse(13781==13781+1);
}
@Test
public void bigFalseTestLib28() {
	assertFalse(16864==16864+1);
}
@Test
public void bigFalseTestLib29() {
	assertFalse(6947==6947+1);
}
@Test
public void bigFalseTestLib30() {
	assertFalse(20779==20779+1);
}
@Test
public void bigFalseTestLib31() {
	assertFalse(8835==8835+1);
}
@Test
public void bigFalseTestLib32() {
	assertFalse(1497==1497+1);
}
@Test
public void bigFalseTestLib33() {
	assertFalse(718==718+1);
}
@Test
public void bigFalseTestLib34() {
	assertFalse(26892==26892+1);
}
@Test
public void bigFalseTestLib35() {
	assertFalse(31965==31965+1);
}
@Test
public void bigFalseTestLib36() {
	assertFalse(9517==9517+1);
}
@Test
public void bigFalseTestLib37() {
	assertFalse(12640==12640+1);
}
@Test
public void bigFalseTestLib38() {
	assertFalse(19115==19115+1);
}
@Test
public void bigFalseTestLib39() {
	assertFalse(22719==22719+1);
}
@Test
public void bigFalseTestLib40() {
	assertFalse(11621==11621+1);
}
@Test
public void bigFalseTestLib41() {
	assertFalse(20353==20353+1);
}
@Test
public void bigFalseTestLib42() {
	assertFalse(10210==10210+1);
}
@Test
public void bigFalseTestLib43() {
	assertFalse(6763==6763+1);
}
@Test
public void bigFalseTestLib44() {
	assertFalse(21280==21280+1);
}
@Test
public void bigFalseTestLib45() {
	assertFalse(1106==1106+1);
}
@Test
public void bigFalseTestLib46() {
	assertFalse(14751==14751+1);
}
@Test
public void bigFalseTestLib47() {
	assertFalse(29787==29787+1);
}
@Test
public void bigFalseTestLib48() {
	assertFalse(10742==10742+1);
}
@Test
public void bigFalseTestLib49() {
	assertFalse(17944==17944+1);
}
@Test
public void bigFalseTestLib50() {
	assertFalse(281==281+1);
}
@Test
public void bigFalseTestLib51() {
	assertFalse(30153==30153+1);
}
@Test
public void bigFalseTestLib52() {
	assertFalse(32272==32272+1);
}
@Test
public void bigFalseTestLib53() {
	assertFalse(2469==2469+1);
}
@Test
public void bigFalseTestLib54() {
	assertFalse(24785==24785+1);
}
@Test
public void bigFalseTestLib55() {
	assertFalse(30202==30202+1);
}
}
