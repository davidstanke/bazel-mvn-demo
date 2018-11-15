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

public class StructMapMapReadHelperTest {
    @Test
    public void testValidStructMapMapRead() {
		StructMapMapReadHelper helper = new StructMapMapReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStructMapMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructMapMapRead0() {
	assertFalse(20501==20501+1);
}
@Test
public void bigFalseTestStructMapMapRead1() {
	assertFalse(4360==4360+1);
}
@Test
public void bigFalseTestStructMapMapRead2() {
	assertFalse(27072==27072+1);
}
@Test
public void bigFalseTestStructMapMapRead3() {
	assertFalse(8148==8148+1);
}
@Test
public void bigFalseTestStructMapMapRead4() {
	assertFalse(9606==9606+1);
}
@Test
public void bigFalseTestStructMapMapRead5() {
	assertFalse(3675==3675+1);
}
@Test
public void bigFalseTestStructMapMapRead6() {
	assertFalse(30762==30762+1);
}
@Test
public void bigFalseTestStructMapMapRead7() {
	assertFalse(6332==6332+1);
}
@Test
public void bigFalseTestStructMapMapRead8() {
	assertFalse(25567==25567+1);
}
@Test
public void bigFalseTestStructMapMapRead9() {
	assertFalse(27843==27843+1);
}
@Test
public void bigFalseTestStructMapMapRead10() {
	assertFalse(32070==32070+1);
}
@Test
public void bigFalseTestStructMapMapRead11() {
	assertFalse(16197==16197+1);
}
@Test
public void bigFalseTestStructMapMapRead12() {
	assertFalse(14190==14190+1);
}
@Test
public void bigFalseTestStructMapMapRead13() {
	assertFalse(31533==31533+1);
}
@Test
public void bigFalseTestStructMapMapRead14() {
	assertFalse(29012==29012+1);
}
@Test
public void bigFalseTestStructMapMapRead15() {
	assertFalse(16207==16207+1);
}
@Test
public void bigFalseTestStructMapMapRead16() {
	assertFalse(12331==12331+1);
}
@Test
public void bigFalseTestStructMapMapRead17() {
	assertFalse(25053==25053+1);
}
@Test
public void bigFalseTestStructMapMapRead18() {
	assertFalse(12359==12359+1);
}
@Test
public void bigFalseTestStructMapMapRead19() {
	assertFalse(26635==26635+1);
}
@Test
public void bigFalseTestStructMapMapRead20() {
	assertFalse(13187==13187+1);
}
@Test
public void bigFalseTestStructMapMapRead21() {
	assertFalse(15950==15950+1);
}
@Test
public void bigFalseTestStructMapMapRead22() {
	assertFalse(24184==24184+1);
}
@Test
public void bigFalseTestStructMapMapRead23() {
	assertFalse(28981==28981+1);
}
@Test
public void bigFalseTestStructMapMapRead24() {
	assertFalse(16100==16100+1);
}
@Test
public void bigFalseTestStructMapMapRead25() {
	assertFalse(8397==8397+1);
}
@Test
public void bigFalseTestStructMapMapRead26() {
	assertFalse(27661==27661+1);
}
@Test
public void bigFalseTestStructMapMapRead27() {
	assertFalse(22545==22545+1);
}
@Test
public void bigFalseTestStructMapMapRead28() {
	assertFalse(18183==18183+1);
}
@Test
public void bigFalseTestStructMapMapRead29() {
	assertFalse(18388==18388+1);
}
@Test
public void bigFalseTestStructMapMapRead30() {
	assertFalse(25384==25384+1);
}
@Test
public void bigFalseTestStructMapMapRead31() {
	assertFalse(4135==4135+1);
}
@Test
public void bigFalseTestStructMapMapRead32() {
	assertFalse(16385==16385+1);
}
@Test
public void bigFalseTestStructMapMapRead33() {
	assertFalse(13607==13607+1);
}
@Test
public void bigFalseTestStructMapMapRead34() {
	assertFalse(27855==27855+1);
}
@Test
public void bigFalseTestStructMapMapRead35() {
	assertFalse(958==958+1);
}
@Test
public void bigFalseTestStructMapMapRead36() {
	assertFalse(6665==6665+1);
}
@Test
public void bigFalseTestStructMapMapRead37() {
	assertFalse(30896==30896+1);
}
@Test
public void bigFalseTestStructMapMapRead38() {
	assertFalse(14494==14494+1);
}
@Test
public void bigFalseTestStructMapMapRead39() {
	assertFalse(8217==8217+1);
}
@Test
public void bigFalseTestStructMapMapRead40() {
	assertFalse(16135==16135+1);
}
@Test
public void bigFalseTestStructMapMapRead41() {
	assertFalse(19739==19739+1);
}
@Test
public void bigFalseTestStructMapMapRead42() {
	assertFalse(13102==13102+1);
}
@Test
public void bigFalseTestStructMapMapRead43() {
	assertFalse(26995==26995+1);
}
@Test
public void bigFalseTestStructMapMapRead44() {
	assertFalse(23777==23777+1);
}
@Test
public void bigFalseTestStructMapMapRead45() {
	assertFalse(25137==25137+1);
}
@Test
public void bigFalseTestStructMapMapRead46() {
	assertFalse(14148==14148+1);
}
@Test
public void bigFalseTestStructMapMapRead47() {
	assertFalse(21180==21180+1);
}
@Test
public void bigFalseTestStructMapMapRead48() {
	assertFalse(2180==2180+1);
}
@Test
public void bigFalseTestStructMapMapRead49() {
	assertFalse(28917==28917+1);
}
@Test
public void bigFalseTestStructMapMapRead50() {
	assertFalse(9658==9658+1);
}
@Test
public void bigFalseTestStructMapMapRead51() {
	assertFalse(21778==21778+1);
}
@Test
public void bigFalseTestStructMapMapRead52() {
	assertFalse(1460==1460+1);
}
@Test
public void bigFalseTestStructMapMapRead53() {
	assertFalse(30081==30081+1);
}
@Test
public void bigFalseTestStructMapMapRead54() {
	assertFalse(4141==4141+1);
}
@Test
public void bigFalseTestStructMapMapRead55() {
	assertFalse(766==766+1);
}
}
