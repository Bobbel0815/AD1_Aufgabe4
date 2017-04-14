import static org.junit.Assert.*;

import org.junit.Test;

public class BinominalDreieckTest
{	
	BinominalerPascal _BP;
	public BinominalDreieckTest()
	{
		_BP = new BinominalerPascal();
	}
	
	@Test
    public void DreieckTest()
    {
		long[] dreickezeile;
		
		dreickezeile = _BP.berechnePascalschesDreieck(5);
		assertEquals(1, dreickezeile[0]);
		assertEquals(4, dreickezeile[1]);
		assertEquals(6, dreickezeile[2]);
		assertEquals(4, dreickezeile[3]);
		assertEquals(1, dreickezeile[4]);
		
		dreickezeile = _BP.berechnePascalschesDreieck(1);
		assertEquals(1, dreickezeile[0]);
		
		dreickezeile = _BP.berechnePascalschesDreieck(2);
		assertEquals(1, dreickezeile[0]);
		assertEquals(1, dreickezeile[1]);
		
		dreickezeile = _BP.berechnePascalschesDreieck(3);
		assertEquals(1, dreickezeile[0]);
		assertEquals(2, dreickezeile[1]);
		assertEquals(1, dreickezeile[2]);
		
		dreickezeile = _BP.berechnePascalschesDreieck(4);
		assertEquals(1, dreickezeile[0]);
		assertEquals(3, dreickezeile[1]);
		assertEquals(3, dreickezeile[2]);
		assertEquals(1, dreickezeile[3]);
		
		
		dreickezeile = _BP.berechnePascalschesDreieck(5);
		assertEquals(1, dreickezeile[0]);
		assertEquals(4, dreickezeile[1]);
		assertEquals(6, dreickezeile[2]);
		assertEquals(4, dreickezeile[3]);
		assertEquals(1, dreickezeile[4]);
		
		dreickezeile = _BP.berechnePascalschesDreieck(6);
		assertEquals(1, dreickezeile[0]);
		assertEquals(5, dreickezeile[1]);
		assertEquals(10, dreickezeile[2]);
		assertEquals(10, dreickezeile[3]);
		assertEquals(5, dreickezeile[4]);
		assertEquals(1, dreickezeile[5]);
		
		dreickezeile = _BP.berechnePascalschesDreieck(11);
		assertEquals(1, dreickezeile[0]);
		assertEquals(10, dreickezeile[1]);
		assertEquals(45, dreickezeile[2]);
		assertEquals(120, dreickezeile[3]);
		assertEquals(210, dreickezeile[4]);
		assertEquals(252, dreickezeile[5]);
		assertEquals(210, dreickezeile[6]);
		assertEquals(120, dreickezeile[7]);
		assertEquals(45, dreickezeile[8]);
		assertEquals(10, dreickezeile[9]);
		assertEquals(1, dreickezeile[10]);
    }
	
    @Test
    public void FakultaetTest()
    {
        assertEquals(1, _BP.getFakultaetvon(0));
        assertEquals(1, _BP.getFakultaetvon(1));
        

        assertEquals(24, _BP.getFakultaetvon(4));
        

        assertEquals(120, _BP.getFakultaetvon(5));
        
        assertEquals(3628800, _BP.getFakultaetvon(10));
    }
	
}
