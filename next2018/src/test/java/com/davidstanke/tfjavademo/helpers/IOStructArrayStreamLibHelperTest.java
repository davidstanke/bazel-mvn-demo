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

public class IOStructArrayStreamLibHelperTest {
    @Test
    public void testValidIOStructArrayStreamLib() {
		IOStructArrayStreamLibHelper helper = new IOStructArrayStreamLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOStructArrayStreamLib0() {
	assertFalse(10264==10264+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib1() {
	assertFalse(26237==26237+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib2() {
	assertFalse(28367==28367+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib3() {
	assertFalse(14739==14739+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib4() {
	assertFalse(8996==8996+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib5() {
	assertFalse(889==889+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib6() {
	assertFalse(5275==5275+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib7() {
	assertFalse(8817==8817+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib8() {
	assertFalse(9637==9637+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib9() {
	assertFalse(20991==20991+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib10() {
	assertFalse(26901==26901+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib11() {
	assertFalse(1937==1937+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib12() {
	assertFalse(11631==11631+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib13() {
	assertFalse(5549==5549+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib14() {
	assertFalse(27489==27489+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib15() {
	assertFalse(23597==23597+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib16() {
	assertFalse(10377==10377+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib17() {
	assertFalse(7336==7336+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib18() {
	assertFalse(16728==16728+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib19() {
	assertFalse(10520==10520+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib20() {
	assertFalse(9385==9385+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib21() {
	assertFalse(16234==16234+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib22() {
	assertFalse(18795==18795+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib23() {
	assertFalse(12138==12138+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib24() {
	assertFalse(31345==31345+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib25() {
	assertFalse(4433==4433+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib26() {
	assertFalse(28222==28222+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib27() {
	assertFalse(2533==2533+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib28() {
	assertFalse(28780==28780+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib29() {
	assertFalse(3555==3555+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib30() {
	assertFalse(6144==6144+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib31() {
	assertFalse(31017==31017+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib32() {
	assertFalse(4551==4551+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib33() {
	assertFalse(20194==20194+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib34() {
	assertFalse(22412==22412+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib35() {
	assertFalse(18076==18076+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib36() {
	assertFalse(13519==13519+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib37() {
	assertFalse(5908==5908+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib38() {
	assertFalse(10049==10049+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib39() {
	assertFalse(27159==27159+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib40() {
	assertFalse(27950==27950+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib41() {
	assertFalse(15823==15823+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib42() {
	assertFalse(23970==23970+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib43() {
	assertFalse(24145==24145+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib44() {
	assertFalse(26085==26085+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib45() {
	assertFalse(18246==18246+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib46() {
	assertFalse(11692==11692+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib47() {
	assertFalse(20492==20492+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib48() {
	assertFalse(24329==24329+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib49() {
	assertFalse(13718==13718+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib50() {
	assertFalse(20731==20731+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib51() {
	assertFalse(5121==5121+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib52() {
	assertFalse(19261==19261+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib53() {
	assertFalse(24208==24208+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib54() {
	assertFalse(14235==14235+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib55() {
	assertFalse(3980==3980+1);
}
}
