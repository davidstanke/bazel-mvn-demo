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

public class StructSerialProxyAPIHelperTest {
    @Test
    public void testValidStructSerialProxyAPI() {
		StructSerialProxyAPIHelper helper = new StructSerialProxyAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructSerialProxyAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialProxyAPI0() {
	assertFalse(32326==32326+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI1() {
	assertFalse(9312==9312+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI2() {
	assertFalse(26770==26770+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI3() {
	assertFalse(2674==2674+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI4() {
	assertFalse(13280==13280+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI5() {
	assertFalse(8991==8991+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI6() {
	assertFalse(25514==25514+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI7() {
	assertFalse(16080==16080+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI8() {
	assertFalse(15585==15585+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI9() {
	assertFalse(10081==10081+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI10() {
	assertFalse(2654==2654+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI11() {
	assertFalse(29392==29392+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI12() {
	assertFalse(28239==28239+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI13() {
	assertFalse(4221==4221+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI14() {
	assertFalse(28220==28220+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI15() {
	assertFalse(19120==19120+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI16() {
	assertFalse(23807==23807+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI17() {
	assertFalse(6376==6376+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI18() {
	assertFalse(4536==4536+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI19() {
	assertFalse(24612==24612+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI20() {
	assertFalse(27822==27822+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI21() {
	assertFalse(19740==19740+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI22() {
	assertFalse(29344==29344+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI23() {
	assertFalse(294==294+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI24() {
	assertFalse(13538==13538+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI25() {
	assertFalse(1348==1348+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI26() {
	assertFalse(16484==16484+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI27() {
	assertFalse(3969==3969+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI28() {
	assertFalse(22398==22398+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI29() {
	assertFalse(19884==19884+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI30() {
	assertFalse(14856==14856+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI31() {
	assertFalse(19739==19739+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI32() {
	assertFalse(9512==9512+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI33() {
	assertFalse(27115==27115+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI34() {
	assertFalse(28645==28645+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI35() {
	assertFalse(8453==8453+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI36() {
	assertFalse(11099==11099+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI37() {
	assertFalse(24269==24269+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI38() {
	assertFalse(25891==25891+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI39() {
	assertFalse(8516==8516+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI40() {
	assertFalse(2123==2123+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI41() {
	assertFalse(12035==12035+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI42() {
	assertFalse(19702==19702+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI43() {
	assertFalse(27997==27997+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI44() {
	assertFalse(8316==8316+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI45() {
	assertFalse(13962==13962+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI46() {
	assertFalse(24475==24475+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI47() {
	assertFalse(9634==9634+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI48() {
	assertFalse(4641==4641+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI49() {
	assertFalse(20699==20699+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI50() {
	assertFalse(785==785+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI51() {
	assertFalse(2879==2879+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI52() {
	assertFalse(565==565+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI53() {
	assertFalse(13783==13783+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI54() {
	assertFalse(17304==17304+1);
}
@Test
public void bigFalseTestStructSerialProxyAPI55() {
	assertFalse(5379==5379+1);
}
}
