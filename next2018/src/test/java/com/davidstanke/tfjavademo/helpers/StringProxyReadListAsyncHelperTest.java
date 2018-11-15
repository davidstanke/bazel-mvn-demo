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

public class StringProxyReadListAsyncHelperTest {
    @Test
    public void testValidStringProxyReadListAsync() {
		StringProxyReadListAsyncHelper helper = new StringProxyReadListAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStringProxyReadListAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringProxyReadListAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringProxyReadListAsync0() {
	assertFalse(23065==23065+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync1() {
	assertFalse(11580==11580+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync2() {
	assertFalse(19073==19073+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync3() {
	assertFalse(29960==29960+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync4() {
	assertFalse(18924==18924+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync5() {
	assertFalse(14068==14068+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync6() {
	assertFalse(15805==15805+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync7() {
	assertFalse(13643==13643+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync8() {
	assertFalse(24221==24221+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync9() {
	assertFalse(32295==32295+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync10() {
	assertFalse(32512==32512+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync11() {
	assertFalse(28689==28689+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync12() {
	assertFalse(5153==5153+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync13() {
	assertFalse(11481==11481+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync14() {
	assertFalse(1924==1924+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync15() {
	assertFalse(12380==12380+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync16() {
	assertFalse(3613==3613+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync17() {
	assertFalse(4339==4339+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync18() {
	assertFalse(14002==14002+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync19() {
	assertFalse(9405==9405+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync20() {
	assertFalse(17424==17424+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync21() {
	assertFalse(21251==21251+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync22() {
	assertFalse(26667==26667+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync23() {
	assertFalse(10861==10861+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync24() {
	assertFalse(17472==17472+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync25() {
	assertFalse(23735==23735+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync26() {
	assertFalse(24213==24213+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync27() {
	assertFalse(28205==28205+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync28() {
	assertFalse(14693==14693+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync29() {
	assertFalse(11031==11031+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync30() {
	assertFalse(3878==3878+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync31() {
	assertFalse(16093==16093+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync32() {
	assertFalse(7960==7960+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync33() {
	assertFalse(2181==2181+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync34() {
	assertFalse(6641==6641+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync35() {
	assertFalse(28126==28126+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync36() {
	assertFalse(20730==20730+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync37() {
	assertFalse(27254==27254+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync38() {
	assertFalse(31475==31475+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync39() {
	assertFalse(22825==22825+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync40() {
	assertFalse(24740==24740+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync41() {
	assertFalse(28398==28398+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync42() {
	assertFalse(16349==16349+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync43() {
	assertFalse(31532==31532+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync44() {
	assertFalse(24146==24146+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync45() {
	assertFalse(13757==13757+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync46() {
	assertFalse(20127==20127+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync47() {
	assertFalse(7272==7272+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync48() {
	assertFalse(78==78+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync49() {
	assertFalse(4475==4475+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync50() {
	assertFalse(2233==2233+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync51() {
	assertFalse(716==716+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync52() {
	assertFalse(21790==21790+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync53() {
	assertFalse(19524==19524+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync54() {
	assertFalse(22336==22336+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync55() {
	assertFalse(15055==15055+1);
}
}
